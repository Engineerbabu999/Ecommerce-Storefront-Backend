package com.ecomm.productcatalog.services;

import com.ecomm.productcatalog.entities.Category;
import com.ecomm.productcatalog.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public List<Category> getAllCategoriesService(){
        return categoryRepository.findAll();
    }

}
