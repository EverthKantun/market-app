package com.tecdesoftware.market.web.controller;

import com.tecdesoftware.market.domain.Product;
import com.tecdesoftware.market.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // GET /products
    @GetMapping
    public ResponseEntity<List<Product>> getAll() {
        return ResponseEntity.ok(productService.getAll());
    }

    // GET /products/{productId}
    @GetMapping("/{productId}")
    public ResponseEntity<Product> getProduct(@PathVariable("productId") int productId) {
        return productService.getProduct(productId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // GET /products/category/{categoryId}
    @GetMapping("/category/{categoryId}")
    public ResponseEntity<List<Product>> getByCategory(@PathVariable("categoryId") int categoryId) {
        return productService.getByCategory(categoryId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // POST /products
    @PostMapping
    public ResponseEntity<Product> save(@RequestBody Product product) {
        return ResponseEntity.ok(productService.save(product));
    }

    // DELETE /products/{productId}
    @DeleteMapping("/{productId}")
    public ResponseEntity<Void> delete(@PathVariable("productId") int productId) {
        if (productService.delete(productId)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
