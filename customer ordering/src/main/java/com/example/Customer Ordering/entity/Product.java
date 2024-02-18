package com.example.springdatajpamapping.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table
@Entity(name = "products")
public class Product {
    @Id
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1
    )
    @Column(name = "product_id")
    private Integer id;
    @Column(name = "product_name")
    private String name;
    @Column(name = "qty")
    private Integer qty;
    @Column(name = "price")
    private Double price;
}
