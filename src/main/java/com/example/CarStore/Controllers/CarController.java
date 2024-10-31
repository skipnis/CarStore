package com.example.CarStore.Controllers;

import com.example.CarStore.Dto.CarDTO;
import com.example.CarStore.Entities.Car;
import com.example.CarStore.Service.Api.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.SplittableRandom;

@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;
    @GetMapping
    public List<CarDTO> findAll(){
        return carService.findAll();
    }
    @GetMapping("/{brand}")
    public List<CarDTO> findByBrand(@PathVariable String brand) {
        return carService.findByBrand(brand);
    }
    @PostMapping
    public CarDTO saveCar(@RequestBody CarDTO carDTO) {
        return carService.saveCar(carDTO);
    }
    @PutMapping("/{id}")
    public void updateCar(@PathVariable Long id, @RequestBody CarDTO carDTO) {
        carService.updateCar(carDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteCarById(@PathVariable Long id){
        carService.deleteById(id);
    }

}
