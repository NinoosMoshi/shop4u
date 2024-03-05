package com.ninos.controller;

import lombok.AllArgsConstructor;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/shop")
public class ProductController {

    @GetMapping("/categories")
    public List<String> getCategories(){
        String[] categories = new String[] {"Shoes", "Jackets", "Suits"};
        return Arrays.asList(categories);
    }

    @GetMapping("/products")
    public List<String> getProducts(){
        String[] products = new String[] {"Shoes-01", "Jackets-01", "Suits-01"};
        return Arrays.asList(products);
    }





}
