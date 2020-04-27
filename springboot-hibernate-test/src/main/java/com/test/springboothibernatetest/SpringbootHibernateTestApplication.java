package com.test.springboothibernatetest;

import com.test.springboothibernatetest.controller.ProductController;
import com.test.springboothibernatetest.entity.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootHibernateTestApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootHibernateTestApplication.class, args);
        /*
        Product product = new Product();
        product.setName("a");
        product.setId("b");
        product.setQuantity(1);
        product.setPrice(1.5);
        ProductController productController = new ProductController();
        productController.addProduct(product);
        */

    }

}
