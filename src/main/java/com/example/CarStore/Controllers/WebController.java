package com.example.CarStore.Controllers;

import com.example.CarStore.Dto.CarDTO;
import com.example.CarStore.Service.Api.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class WebController {
    private final CarService carService;

    public WebController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/store")
    public String view(Model model){
        model.addAttribute("cars", carService.findAll());
        return "store";
    }

    @GetMapping("/store/{id}")
    public String deleteCar(@PathVariable Long id){
        carService.deleteById(id);
        return "redirect:/store";
    }
}
