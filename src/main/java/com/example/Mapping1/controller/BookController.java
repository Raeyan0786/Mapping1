package com.example.Mapping1.controller;

import com.example.Mapping1.model.Book;
import com.example.Mapping1.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @PostMapping("/add-book")
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }
    @GetMapping("get-book/bookId/{bookId}")
    public Book getBookById(@PathVariable Integer bookId){
        return bookService.getBookById(bookId);
    }
    @GetMapping("/all-books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
    @PutMapping("/update-book/bookId/{bookId}")
    public Book updateBook(@PathVariable Integer bookId,@RequestBody Book book){
        return bookService.updateBook(bookId,book);
    }
    @DeleteMapping("/delete-book/bookId/{bookId}")
    public void deleteBook(@PathVariable Integer bookId){
        bookService.deleteBook(bookId);
    }
}
