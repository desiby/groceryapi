package com.desiby.controller;

import com.desiby.repository.ProductRepository;
import com.desiby.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ProductController {

    //injection of ProductRepository
    @Autowired
    private ProductRepository productRepository;

    /**
     * Get all products
     * @return a list as json
     */
    @GetMapping("/all")
    public List<Product> findAll(){
        return productRepository.findAll();
    }

    /**
     * Get product by id
     * @param id of product
     * @return a product as json
     */
    @GetMapping("/product/{id}")
    public Product findById(@PathVariable String id){
        return productRepository.findOne(id);
    }
}
