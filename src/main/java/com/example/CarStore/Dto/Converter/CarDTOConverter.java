package com.example.CarStore.Dto.Converter;

import com.example.CarStore.Dto.CarDTO;
import com.example.CarStore.Entities.Car;
import lombok.Builder;
import lombok.experimental.UtilityClass;

import java.util.List;
import java.util.stream.Collectors;

@UtilityClass

public class CarDTOConverter {
   public CarDTO entityToDTO(Car car) {
       return CarDTO.builder()
               .id(car.getId())
               .brand(car.getBrand())
               .model(car.getModel())
               .description(car.getDescription())
               .price(car.getPrice())
               .build();
   }
   public List<CarDTO> entityToDTO(List<Car> cars) {
       return cars.stream().map(CarDTOConverter::entityToDTO).collect(Collectors.toList());
   }
    public List<Car> dtoToEntity(List<CarDTO> carsDTO) {
        return carsDTO.stream().map(CarDTOConverter::dtoToEntity).collect(Collectors.toList());
    }
   public Car dtoToEntity(CarDTO carDTO) {
       return Car.builder()
               .id(carDTO.getId())
               .brand(carDTO.getBrand())
               .model(carDTO.getModel())
               .description(carDTO.getDescription())
               .price(carDTO.getPrice())
               .build();
   }
}
