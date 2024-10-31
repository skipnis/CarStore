package com.example.CarStore.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "test")
@Builder

public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name="brand")
    private String brand;
    @Column(name="model")
    private String model;
    @Column(name="description")
    private String description;
    @Column(name="price")
    private double price;

}
