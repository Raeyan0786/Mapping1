package com.example.Mapping1.dao;

import com.example.Mapping1.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourse extends JpaRepository<Course,Integer> {
}
