package com.productapp.controller;

import com.productapp.entities.Product;
import com.productapp.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private ProductServices productServices;

    @Autowired
    public ProductController(ProductServices productServices) {

        this.productServices = productServices;
    }

//    http://localhost:8081/productapp/productsorted?field=name
    @GetMapping(path = "/productsorted")
    public List<Product> getAllProductSorted(@RequestParam(name="field")  String field) {
        return productServices.getAllProductSorted(field);
    }

//http://localhost:8081/productapp/productspage?offset=2&pageSize=20
    @GetMapping(path = "/productspage")
    public List<Product> getAllProductPage(@RequestParam(name="offset")  int offset,
                                           @RequestParam(name = "pageSize")  int pageSize){
        return productServices.getAllProductPage(offset, pageSize);
    }

//    http://localhost:8081/productapp/productspage2?offset=1&pageSize=20&field=name
    @GetMapping(path = "productspage2")
    public List<Product> getAllProductPage2(@RequestParam(name="offset")  int offset,
                                            @RequestParam(name = "pageSize")  int pageSize,
                                            @RequestParam(name = "field") String field){
        return productServices.getAllProductPageSorted(field, offset, pageSize);
    }
//    http://localhost:8081/productapp/products?
    @GetMapping("products")
    public List<Product> getAllProducts() {
        return productServices.getAllProducts();
    }

//    http://localhost:8081/productapp/products/product%202
    @GetMapping("products/{name}")
    public Product getProductByName(@PathVariable String name) {
        return productServices.findByName(name);
    }

}
