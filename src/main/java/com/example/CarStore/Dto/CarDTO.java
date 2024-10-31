package com.example.CarStore.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarDTO {
    private long id;
    private String brand;
    private String model;
    private String description;
    private double price;
}
