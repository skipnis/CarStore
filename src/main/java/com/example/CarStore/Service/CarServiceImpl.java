package com.example.CarStore.Service;

import com.example.CarStore.Dto.CarDTO;
import com.example.CarStore.Dto.Converter.CarDTOConverter;
import com.example.CarStore.Entities.Car;
import com.example.CarStore.Repositories.CarRepository;
import com.example.CarStore.Service.Api.CarService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;
    @Override
    public List<CarDTO> findAll() {
       /* return CarDTOConverter.entityToDTO(carRepository.findAll());*/
        return CarDTOConverter.entityToDTO((List<Car>)carRepository.findAll());
    }
    @Override
    public List<CarDTO> findByBrand(String brand) {
        return CarDTOConverter.entityToDTO(carRepository.findCarsByBrand(brand));
    }

    @Override
    @Transactional
    public CarDTO saveCar(CarDTO carDTO) {
        return CarDTOConverter.entityToDTO(carRepository.save(CarDTOConverter.dtoToEntity(carDTO)));
    }
    @Override
    public void updateCar(CarDTO carDTO) {
        carRepository.save(CarDTOConverter.dtoToEntity(carDTO));
    }

    @Override
    public void deleteById(Long id) {
        carRepository.deleteById(id);
    }
}
