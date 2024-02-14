package com.example.Product.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    private  long id;
    private String name;
    private String description;
    private int price;
    private String image;
    private Category category;
}
