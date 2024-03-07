package com.ninos.service;

import com.ninos.model.dto.ProductResponseDTO;
import com.ninos.model.dto.ProductResponseListDTO;
import com.ninos.specification.ProductSpecParams;

public interface ProductService {

    ProductResponseDTO getProductById(Long id);
    ProductResponseListDTO getProductList(ProductSpecParams specParams);

}
