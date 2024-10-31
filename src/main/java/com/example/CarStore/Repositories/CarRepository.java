package com.example.CarStore.Repositories;

import com.example.CarStore.Dto.CarDTO;
import com.example.CarStore.Entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {
    List<Car> findCarsByBrand(String brand);

}

