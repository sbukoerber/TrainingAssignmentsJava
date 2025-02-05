package com.productapp.repo;

import com.productapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    @Query("select p from Product p")
    public List<Product> getAllProducts();

    @Query("select p from Product p where p.name = ?1")
    public Product addProduct(Product product);

    @Query("delete from Product p where p.id = ?1")
    public void deleteProduct(int id);

    @Query("update Product p set p = ?2 where p.id = ?1")
    public void updateProduct(int id, Product product);

    @Query("select p from Product p where p.id = ?1")
    public Product getProductById(int id);

    @Query("select p from Product p where p.name = ?1")
    public Product findByName(String name);
}
