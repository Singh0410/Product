package com.example.Product.Services;

import com.example.Product.Models.Product;
import org.springframework.stereotype.Service;

@Service
public class FakeStoreProductService implements IProductService{
    @Override
    public Product getSingleProduct(Long id) {
        return null;
    }
}
