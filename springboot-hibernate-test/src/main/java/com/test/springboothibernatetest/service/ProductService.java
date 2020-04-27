package com.test.springboothibernatetest.service;

import com.test.springboothibernatetest.entity.Product;
import com.test.springboothibernatetest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product){
        return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products){
        return repository.saveAll(products);
    }

    public List<Product> getProducts(){
        return repository.findAll();
    }

    public Product getProductById(String portNum){
        return repository.findById(portNum).orElse(null);
    }

    public Product getProductByName(String name){
        return repository.findByName(name);
    }

    public String deleteProduct(String portNum){
        repository.deleteById(portNum);
        return "product removed" + portNum;
    }

    public Product updateProduct(Product product){
        Product existingProduct = repository.findById(product.getPortNum()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }
}
