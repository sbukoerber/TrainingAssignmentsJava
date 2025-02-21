package com.productapp.service;

import com.productapp.repo.Product;
import com.productapp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productrepo;
    @Override
    public List<Product> getAll() {
        return productrepo.findAll();
    }

    @Override
    public Product save(Product prod) {
        return productrepo.save(prod);
    }

    @Override
    public Product update(String id, Product prod) {
        Product productToUpdate = productrepo.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
        productToUpdate.setName(prod.getName());
        productToUpdate.setQty(prod.getQty());
        productToUpdate.setVendor(prod.getVendor());
        productToUpdate.setCost(prod.getCost());
        return productrepo.save(prod);
    }

    @Override
    public void delete(String id) {
        productrepo.deleteById(id);
    }

    @Override
    public Product getById(String id) {
        return productrepo.findById(id).get();
    }
}
