package com.productapp.services;

import com.productapp.entities.Product;
import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductServices  {

    private ProductRepo productRepo;

    @Autowired
    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepo.getAllProducts();
    }

    @Override
    public Product addProduct(Product product) {
        productRepo.save(product);
        return productRepo.addProduct(product);
    }

    @Override
    public void deleteProduct(int id) {
        productRepo.deleteProduct(id);
    }

    @Override
    public Product updateProduct(int id, Product product) {
        Product productToUpdate = getProductById(id);
            productToUpdate.setPrice(product.getPrice());
            productRepo.save(productToUpdate);
            return productToUpdate;
    }

    @Override
    public Product getProductById(int id) {
        return productRepo.findById(id).
                orElseThrow(() -> new ProductNotFoundException("Product not found"));
    }

    @Override
    public Product findByName(String name) {
        return productRepo.findByName(name);
    }

    @Override
    public List<Product> getAllProductSorted(String field) {
        return productRepo.findAll(Sort.by(Sort.Direction.ASC, field));
    }

    @Override
    public List<Product> getAllProductPage(int offset, int pageSize) {
        return productRepo.findAll(PageRequest.of(offset, pageSize)).getContent();
    }

    @Override
    public List<Product> getAllProductPageSorted(String field, int offset, int pageSize) {
        return productRepo.findAll(PageRequest.of(offset, pageSize, Sort.by(Sort.Direction.DESC, field))).getContent();
    }
}
