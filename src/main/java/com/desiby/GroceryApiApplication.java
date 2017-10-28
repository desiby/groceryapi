package com.desiby;

import com.desiby.entity.Product;

import com.desiby.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GroceryApiApplication implements CommandLineRunner{

    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(GroceryApiApplication.class);
    }

    @Override
    public void run(String...args) throws Exception{
        productRepository.deleteAll();
        //save some products
        productRepository.save(new Product("tomato", 5.99));
        productRepository.save(new Product("orange", 6.99));
        //fetch all product:
        System.out.println("fetching all products...");
        System.out.println("-------------------------");
        for(Product product: productRepository.findAll()){
            System.out.println(product);
        }
    }

}
