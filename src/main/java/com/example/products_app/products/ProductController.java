package com.example.products_app.products;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product productCreated = productService.addProduct(product);
        return ResponseEntity.ok(productCreated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable UUID id) {
        boolean removed = productService.deleteProduct(id);
        return removed ? ResponseEntity.ok("Product deleted successfully")
                : ResponseEntity.badRequest().body("Product not found");
    }


}
