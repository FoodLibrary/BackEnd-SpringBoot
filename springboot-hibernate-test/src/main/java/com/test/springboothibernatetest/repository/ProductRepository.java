package com.test.springboothibernatetest.repository;

import com.test.springboothibernatetest.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,String> {
    Product findByName(String name);
}
