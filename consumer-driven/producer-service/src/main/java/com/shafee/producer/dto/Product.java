package com.shafee.producer.dto;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private long productId;
    private String name;
    private double price;

}
