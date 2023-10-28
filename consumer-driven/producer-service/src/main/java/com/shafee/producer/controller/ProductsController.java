package com.shafee.producer.controller;

import com.shafee.producer.dto.Product;
import com.shafee.producer.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

    @Autowired
    ProductsService productsService;

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProducts(@PathVariable long id){
        return new ResponseEntity<>(productsService.getProduct(id), HttpStatus.OK);
    }
}
