package com.example.Mapping1.dao;

import com.example.Mapping1.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILaptop extends JpaRepository<Laptop,Integer> {
}
