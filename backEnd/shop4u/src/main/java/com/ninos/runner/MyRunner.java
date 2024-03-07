package com.ninos.runner;

import lombok.AllArgsConstructor;

import java.util.Arrays;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ninos.model.entity.Brand;
import com.ninos.model.entity.Category;
import com.ninos.model.entity.Product;
import com.ninos.repository.BrandRepository;
import com.ninos.repository.CategoryRepository;
import com.ninos.repository.ProductRepository;

//@AllArgsConstructor
//@Component
public class MyRunner {
//implements CommandLineRunner
//    private final ProductRepository productRepository;
//    private final CategoryRepository categoryRepository;
//    private final BrandRepository brandRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        createBrand();
//
//    }
//
//    private void createBrand() {
//        Brand[] brands = new Brand[] { new Brand("Addidas"), new Brand("Slazenger"), new Brand("Nike") };
//        brandRepository.saveAll(Arrays.asList(brands));
//
//        Category[] categories = new Category[] { new Category("Running"), new Category("Tennis"), new Category("Basketball") };
//        categoryRepository.saveAll(Arrays.asList(categories));
//
//        Product[] products = new Product[]{
//                new Product("A101","World Star","Shoes for next century",195.5,"shoe-1.jpg", true, 12, new Date(2022,8,11),
//                        new  Date(2022, 8,11),new Category(2L),new Brand(3L)),
//
//                new Product("A102","White Line",
//                        "Will make you world champion", 295.5,"shoe-2.jpg", true, 12, new
//                        Date(2022,8,11), new Date(2022, 8,11),new Category(1L), new Brand(3L)),
//
//                new Product("A103","Prism White",
//                        "You have already won a gold medal", 135.5,"shoe-3.jpg", true, 12, new
//                        Date(2022,8,11), new Date(2022, 8,11), new Category(3L), new Brand(3L)),
//
//
//                new Product("A104","Olympic Runner",
//                        "Hitect in shoesy", 195.5,"shoe-4.jpg", true, 12, new Date(2022,8,11), new
//                        Date(2022, 8,11),new Category(1L), new Brand(1L)),
//
//
//                new Product("A105","Lala Land Shoes",
//                        "Romantism with hitech combined", 185.5,"shoe-5.jpg", true, 12, new
//                        Date(2022,8,11), new Date(2022, 8,11), new Category(2L), new Brand(2L)),
//
//
//                new Product("A106","Dunker in the Sky",
//                        "Blue Star  for next century", 195.5,"shoe-6.jpg", true, 12, new
//                        Date(2022,8,11), new Date(2022, 8,11),new Category(3L), new Brand(3L)),
//
//                new Product("A107","Even the smallest can dunk", "Bouncy Shoes for next century",
//                        165.5,"shoe-7.jpg", true, 12, new Date(2022,8,11), new Date(2022, 8,11),new Category(1L), new Brand(2L)),
//
//
//                new Product("A108","Wimbledon Star",
//                        "Grass or sand don't matter", 167.5,"shoe-8.jpg", true, 12, new
//                        Date(2022,8,11), new Date(2022, 8,11), new Category(2L), new Brand(3L)),
//
//                new Product("A109","Will blow your brains out!", "Do something good for your brains",
//                        175.5,"shoe-9.jpg", true, 12, new Date(2022,8,11), new Date(2022, 8,11),new Category(3L), new Brand(1L)),
//
//
//                new Product("A110","Universal  Star",
//                        "Neptune Plazma", 105.5,"shoe-10.jpg", true, 12, new Date(2022,8,11), new
//                        Date(2022, 8,11),new Category(1L), new Brand(3L)),
//
//
//                new Product("A111","Saturn",
//                        "Will take you to the Saturn", 115.5,"shoe-11.jpg", true, 12, new
//                        Date(2022,8,11), new Date(2022, 8,11),new Category(2L), new Brand(2L)),
//
//
//                new Product("A112","Paris Blues",
//                        "Save the environment", 195.5,"shoe-12.jpg", true, 12, new Date(2022,8,11),
//                        new Date(2022, 8,11),new Category(3L), new Brand(1L)),
//
//                new Product("A113","Vegan  Star", "Vegan", 125.5,"shoe-13.jpg", true, 12, new
//                Date(2022,8,11), new Date(2022, 8,11),new Category(2L), new Brand(3L)),
//
//
//                new Product("A114","London Star",
//                        "Piccadily", 145.5,"shoes-14.jpg", true, 12, new Date(2022,8,11), new
//                        Date(2022, 8,11),new Category(2L), new Brand(2L)),
//
//                new Product("A115","Istanbul Star",
//                        "Bhosphoros Blues", 165.5,"shoe-15.jpg", true, 12, new Date(2022,8,11), new
//                        Date(2022, 8,11),new Category(1L), new Brand(1L)),
//
//
//                new Product("A116","One and Only",
//                        "Roland Garros", 155.5,"shoes-16.jpg", true, 12, new Date(2022,8,11), new
//                        Date(2022, 8,11),new Category(3L), new Brand(3L)),
//
//
//                new Product("A117","NBA Star", "Warriors",
//                        125.5,"shoes-17.jpg", true, 12, new Date(2022,8,11), new Date(2022, 8,11),new Category(1L), new Brand(2L)),
//
//
//                new Product("A118","Atlantic All Star ",
//                        "Wimbledon", 191.5,"shoes-18.jpg", true, 12, new Date(2022,8,11), new
//                        Date(2022, 8,11),new Category(2L), new Brand(3L))
//
//                };
//
//        productRepository.saveAll(Arrays.asList(products));
//
//
//    }


}
