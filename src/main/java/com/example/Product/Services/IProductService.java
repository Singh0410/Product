package com.example.Product.Services;

import com.example.Product.Models.Product;
import org.springframework.stereotype.Service;

@Service
public interface IProductService {

    public Product getSingleProduct(Long id);
}
