package com.ecomm.productcatalog.services;

import com.ecomm.productcatalog.entities.Category;
import com.ecomm.productcatalog.entities.Product;
import com.ecomm.productcatalog.repository.CategoryRepository;
import com.ecomm.productcatalog.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getAllProductsService(){
        return productRepository.findAll();
    }

    public List<Product> getProductByCategory(Long categoryId){
        return productRepository.fingByCategoryId(categoryId);
    }



}
