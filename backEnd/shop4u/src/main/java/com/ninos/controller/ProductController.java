package com.ninos.controller;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninos.model.dto.ProductResponseDTO;
import com.ninos.model.dto.ProductResponseListDTO;
import com.ninos.model.entity.Brand;
import com.ninos.model.entity.Category;
import com.ninos.repository.BrandRepository;
import com.ninos.repository.CategoryRepository;
import com.ninos.service.ProductService;
import com.ninos.specification.ProductSpecParams;


@AllArgsConstructor
@RestController
@RequestMapping("/api/shop")
public class ProductController {

   private final CategoryRepository categoryRepository;
   private final BrandRepository brandRepository;
   private final ProductService productService;

   @GetMapping("/categories")
   public ResponseEntity<List<Category>> getCategories(){
       List<Category> categories = categoryRepository.findAll();
       if(categories != null){
           return ResponseEntity.ok(categories);
       }
       else{
           return ResponseEntity.noContent().build();
       }
   }

    @GetMapping("/brands")
    public ResponseEntity<List<Brand>> getBrands(){
        List<Brand> brands = brandRepository.findAll();
        if(brands != null){
            return ResponseEntity.ok(brands);
        }
        else{
            return ResponseEntity.noContent().build();
        }
    }


    @GetMapping("/products")
    public ResponseEntity<ProductResponseListDTO> getProducts(ProductSpecParams requestParams) {

        ProductResponseListDTO productList = productService.getProductList(requestParams);
        return ResponseEntity.ok(productList);
    }


    @GetMapping("/products/{id}")
    public ResponseEntity<ProductResponseDTO> getProductById(@PathVariable long id) {

        ProductResponseDTO product = productService.getProductById(id);
        return ResponseEntity.ok(product);
    }





}
