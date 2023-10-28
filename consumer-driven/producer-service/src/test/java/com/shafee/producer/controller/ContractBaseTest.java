package com.shafee.producer.controller;

import com.shafee.producer.ProducerApplication;
import com.shafee.producer.dto.Product;
import com.shafee.producer.service.ProductsService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest(classes = {ProducerApplication.class})
public class ContractBaseTest {

    @Autowired
    ProductsController productsController;

    @MockBean
    ProductsService productsService;

    @BeforeEach
    void setup(){
        RestAssuredMockMvc.standaloneSetup(productsController);
        Mockito.when(productsService.getProduct(1))
                .thenReturn(new Product(1,"iphone",1099.99));
    }

}
