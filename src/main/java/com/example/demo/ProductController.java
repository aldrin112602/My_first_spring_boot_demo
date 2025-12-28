package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Product> getProducts() {
        return List.of(
            new Product(1, "Laptop", 999.99),
            new Product(2, "Mouse", 25.50),
            new Product(3, "Keyboard", 75.00)
        );
    }
}
