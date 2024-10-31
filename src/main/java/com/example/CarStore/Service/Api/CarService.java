package com.example.CarStore.Service.Api;

import com.example.CarStore.Dto.CarDTO;
import com.example.CarStore.Dto.Converter.CarDTOConverter;
import com.example.CarStore.Entities.Car;

import java.util.List;

public interface CarService {
   List<CarDTO> findAll();
   List<CarDTO> findByBrand(String brand);
   CarDTO saveCar(CarDTO carDTO);
   void updateCar(CarDTO carDTO);
   void deleteById(Long id);

}
