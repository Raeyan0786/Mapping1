package com.example.Mapping1.service;

import com.example.Mapping1.dao.ILaptop;
import com.example.Mapping1.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    private ILaptop iLaptop;
    public void addLaptop(Laptop laptop) {
        iLaptop.save(laptop);
    }

    public Laptop getLaptopById(Integer laptopId) {
        return iLaptop.findById(laptopId).get();
    }

    public List<Laptop> getAllLaptops() {
        return iLaptop.findAll();
    }

    public Laptop updateLaptop(Integer laptopId, Laptop laptop) {
        Laptop laptop1=iLaptop.findById(laptopId).get();
        laptop1.setLaptopBrand(laptop.getLaptopBrand());
        laptop1.setLaptopName(laptop.getLaptopName());
        laptop1.setLaptopPrice(laptop.getLaptopPrice());
        return iLaptop.save(laptop1);
    }

    public void deleteLaptop(Integer laptopId) {
        iLaptop.deleteById(laptopId);
    }
}
