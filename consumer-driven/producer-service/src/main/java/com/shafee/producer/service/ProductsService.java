package com.shafee.producer.service;

import com.shafee.producer.dto.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {

    public Product getProduct(long id){
        return new Product(2,"iphone",1099.99);
    }
}
