package com.ninos.service;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ninos.model.dto.ProductResponseDTO;
import com.ninos.model.dto.ProductResponseListDTO;
import com.ninos.model.entity.Product;
import com.ninos.repository.ProductRepository;
import com.ninos.specification.ProductSpecParams;
import com.ninos.specification.ProductSpecificationTitleBrandCategory;



@Service
public class ProductServiceImpl implements ProductService{

    @Value("${pagination.page.size.default}")
    private Integer defaultPageSize;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductSpecificationTitleBrandCategory productSpecification;


    @Override
    public ProductResponseDTO getProductById(Long id) {
        Optional<Product> productOpt = productRepository.findById(id);
        if(productOpt.isPresent()) {
            ProductResponseDTO prdto = new ProductResponseDTO();
            prdto.populateDto(productOpt.get());
            return prdto;
        }
        return null;
    }


    @Override
    public ProductResponseListDTO getProductList(ProductSpecParams specParams) {
        List<Product> productList = null;
        Page<Product> pages = null;
        if (Integer.valueOf(specParams.getPageIndex()) == null) {

            pages = new PageImpl<>(productRepository.findAll(productSpecification.getProducts(specParams)));
        }
        else {
            if(Integer.valueOf(specParams.getPageSize()) == null || specParams.getPageSize() == 0) {
                specParams.setPageSize(defaultPageSize);
            }
            Pageable paging = PageRequest.of(specParams.getPageIndex() -1, specParams.getPageSize());

            pages = productRepository.findAll(productSpecification.getProducts(specParams), paging);
        }
        if(pages != null && pages.getContent() != null ) {

            productList = pages.getContent();
            if(productList != null && productList.size() > 0) {

                ProductResponseListDTO prldto = new ProductResponseListDTO();
                prldto.setTotalPages(pages.getTotalPages());
                prldto.setTotalCount(pages.getTotalElements());
                prldto.setPageIndex(pages.getNumber());
                prldto.setProductList(new ArrayList<ProductResponseDTO>());
                for(Product product: productList) {

                    ProductResponseDTO prdto= new ProductResponseDTO();
                    prdto.populateDto(product);
                    prldto.getProductList().add(prdto);
                }
                return prldto;
            }
        }
        return null;
    }
    }



