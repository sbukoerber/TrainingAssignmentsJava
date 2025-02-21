package com.productapp.controller;

import com.productapp.repo.Product;
import com.productapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("products")
    public ResponseEntity<List<Product>> getProducts(){
        return ResponseEntity.status(200).body(service.getAll());
    }

    @GetMapping("products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable String id){
        return ResponseEntity.status(200).body(service.getById(id));
    }

    @PostMapping("products/add")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product){
        return ResponseEntity.status(200).body(service.save(product));
    }

    @PutMapping("products/update/{id}")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product,@PathVariable String id){
        return ResponseEntity.status(200).body(service.update(id,product));
    }

    @DeleteMapping("products/delete/{id}")
    public void deleteProduct(@PathVariable String id){
        service.delete(id);
    }
}