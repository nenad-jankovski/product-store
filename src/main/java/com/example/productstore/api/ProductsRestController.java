package com.example.productstore.api;

import com.example.productstore.repository.ProductRepository;
import com.example.productstore.services.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductsRestController {
    private final ProductService productService;

    public ProductsRestController(ProductService productService) {
        this.productService = productService;
    }
}
