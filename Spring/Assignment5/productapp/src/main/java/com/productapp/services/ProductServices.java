package com.productapp.services;

import com.productapp.entities.Product;

import java.util.List;

public interface ProductServices {
    public List<Product> getAllProducts();
    public Product addProduct(Product product);
    public void deleteProduct(int id);
    public Product updateProduct(int id, Product product);
    public Product getProductById(int id);
    public Product findByName(String name);
    public List<Product> getAllProductSorted(String field);
    public List<Product> getAllProductPage(int offset, int pageSize);
    public List<Product> getAllProductPageSorted(String field, int offset, int pageSize);
}
