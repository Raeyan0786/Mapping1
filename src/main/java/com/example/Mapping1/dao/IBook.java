package com.example.Mapping1.dao;

import com.example.Mapping1.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBook extends JpaRepository<Book,Integer> {
}
