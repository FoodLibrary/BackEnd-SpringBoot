package com.test.springboothibernatetest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product3")
public class Product {
    @Id
    private String portNum;
    private String name;
    private int quantity;
    private double price;
}
