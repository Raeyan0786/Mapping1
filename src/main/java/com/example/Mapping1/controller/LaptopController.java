package com.example.Mapping1.controller;

import com.example.Mapping1.model.Laptop;
import com.example.Mapping1.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
    @Autowired
    private LaptopService laptopService;
        @PostMapping("/add-laptop")
        public void addLaptop(@RequestBody Laptop laptop){
            laptopService.addLaptop(laptop);
        }
        @GetMapping("get-laptop/laptopId/{laptopId}")
        public Laptop getLaptopById(@PathVariable Integer laptopId){
            return laptopService.getLaptopById(laptopId);
        }
        @GetMapping("/get-all-laptop")
        public List<Laptop> getAlllaptops() {
            return laptopService.getAllLaptops();
        }
        @PutMapping("/laptop/laptopId/{laptopId}")
        public Laptop updateLaptop(@PathVariable Integer laptopId,@RequestBody Laptop laptop){
            return laptopService.updateLaptop(laptopId,laptop);
        }
        @DeleteMapping("/delete-laptop/laptopId/{laptopId}")
        public void deleteLaptop(@PathVariable Integer laptopId){
            laptopService.deleteLaptop(laptopId);
        }
}
