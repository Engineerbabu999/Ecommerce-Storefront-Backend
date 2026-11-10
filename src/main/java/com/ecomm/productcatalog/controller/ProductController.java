package com.ecomm.productcatalog.controller;

import com.ecomm.productcatalog.entities.Category;
import com.ecomm.productcatalog.entities.Product;
import com.ecomm.productcatalog.services.CategoryService;
import com.ecomm.productcatalog.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {

    @Autowired
    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts(){
        return ResponseEntity.ok(productService.getAllProductsService());
    }

    @GetMapping("{categoryId}")
    public ResponseEntity<List<Product>> getProductByCategoryId(@PathVariable Long categoryId){
        return ResponseEntity.ok(productService.getProductByCategory(categoryId));
    }

}
