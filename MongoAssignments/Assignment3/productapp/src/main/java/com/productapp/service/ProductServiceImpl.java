package com.productapp.service;

import com.productapp.entities.Product;
import com.productapp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{

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
        Product prodToUpdate= productrepo.findById(id).orElseThrow(()->
                new RuntimeException("Product Not Found"));
        prodToUpdate.setName(prod.getName());
        prodToUpdate.setCost(prod.getCost());
        prodToUpdate.setQty(prod.getQty());
        prodToUpdate.setVendor(prod.getVendor());
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
