package com.example.Product.Controllers;

import com.example.Product.Models.Product;
import com.example.Product.Services.IProductService;
import com.example.Product.dtos.ProductRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts()
    {
        return new ArrayList<>();
    }

    @GetMapping("/products/{id}")
    public Product getSingleProduct(@PathVariable("id") Long id)
    {
        return productService.getSingleProduct(id);
    }

    @PostMapping("/Products")
    public Product addProduct(@RequestBody ProductRequestDto productRequestDto)
    {
        return new Product();
    }

    @PutMapping("/products/{id}")
    public Product updateProduct(@PathVariable("id") Long id, @RequestBody ProductRequestDto productRequestDto)
    {
        return new Product();
    }

    @DeleteMapping("/products/{id}")
    public boolean deleteProduct(@PathVariable("id") Long id)
    {
        return true;
    }
}
