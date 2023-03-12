package com.example.Mapping1.dao;

import com.example.Mapping1.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudent extends JpaRepository<Student,Integer> {
}
