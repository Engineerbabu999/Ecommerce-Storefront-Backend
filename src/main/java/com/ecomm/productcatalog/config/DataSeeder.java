package com.ecomm.productcatalog.config;


import com.ecomm.productcatalog.entities.Category;
import com.ecomm.productcatalog.entities.Product;
import com.ecomm.productcatalog.repository.CategoryRepository;
import com.ecomm.productcatalog.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@AllArgsConstructor
public class DataSeeder implements CommandLineRunner {


    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;


    @Override
    public void run(String... args) throws Exception {

        // Clear existing data
        productRepository.deleteAll();
        categoryRepository.deleteAll();

        // Create categories
        Category electronics = new Category();
        electronics.setName("Electronics");

        Category clothing = new Category();
        clothing.setName("Clothing");

        Category home = new Category();
        home.setName("Home and Kitchen");

        // Save categories
        categoryRepository.saveAll(
                Arrays.asList(electronics, clothing, home)
        );

        // Electronics Products
        Product phone = new Product();
        phone.setName("SmartPhone");
        phone.setDescription("Latest Android Smartphone");
        phone.setImageUrl("https://images.unsplash.com/photo-1511707171634-5f897ff02aa9?w=800");
        phone.setPrice(799.99);
        phone.setCategory(electronics);

        Product laptop = new Product();
        laptop.setName("MacBook Pro");
        laptop.setDescription("Apple MacBook Pro Laptop");
        laptop.setImageUrl("https://images.unsplash.com/photo-1517336714731-489689fd1ca8?w=800");
        laptop.setPrice(1999.99);
        laptop.setCategory(electronics);

        Product headphones = new Product();
        headphones.setName("Wireless Headphones");
        headphones.setDescription("Noise Cancelling Wireless Headphones");
        headphones.setImageUrl("https://images.unsplash.com/photo-1505740420928-5e560c06d30e?w=800");
        headphones.setPrice(149.99);
        headphones.setCategory(electronics);

        // Clothing Products
        Product tshirt = new Product();
        tshirt.setName("Cotton T-Shirt");
        tshirt.setDescription("Premium Cotton Casual T-Shirt");
        tshirt.setImageUrl("https://images.unsplash.com/photo-1521572163474-6864f9cf17ab?w=800");
        tshirt.setPrice(19.99);
        tshirt.setCategory(clothing);

        Product jacket = new Product();
        jacket.setName("Leather Jacket");
        jacket.setDescription("Premium Black Leather Jacket");
        jacket.setImageUrl("https://images.unsplash.com/photo-1551028719-00167b16eac5?w=800");
        jacket.setPrice(129.99);
        jacket.setCategory(clothing);

        // Home and Kitchen Products
        Product sofa = new Product();
        sofa.setName("Modern Sofa");
        sofa.setDescription("Comfortable Modern Living Room Sofa");
        sofa.setImageUrl("https://images.unsplash.com/photo-1555041469-a586c61ea9bc?w=800");
        sofa.setPrice(899.99);
        sofa.setCategory(home);

        Product coffeeMaker = new Product();
        coffeeMaker.setName("Coffee Maker");
        coffeeMaker.setDescription("Automatic Coffee Maker");
        coffeeMaker.setImageUrl("https://images.unsplash.com/photo-1495474472287-4d71bcdd2085?w=800");
        coffeeMaker.setPrice(89.99);
        coffeeMaker.setCategory(home);

        // Save all products
        List<Product> products = Arrays.asList(
                phone,
                laptop,
                headphones,
                tshirt,
                jacket,
                sofa,
                coffeeMaker
        );

        productRepository.saveAll(products);

        System.out.println("=================================");
        System.out.println("Database seeded successfully!");
        System.out.println("Categories: 3");
        System.out.println("Products: " + products.size());
        System.out.println("=================================");
    }

}
