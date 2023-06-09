package com.example.Mapping1.service;

import com.example.Mapping1.dao.IBook;
import com.example.Mapping1.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private IBook iBook;
    public void addBook(Book book) {
        iBook.save(book);
    }

    public Book getBookById(Integer bookId) {
        return iBook.findById(bookId).get();
    }

    public List<Book> getAllBooks() {
        return iBook.findAll();
    }

    public Book updateBook(Integer bookId, Book book) {
        Book book1=iBook.findById(bookId).get();
        book1.setBookAuthor(book.getBookAuthor());
        book1.setBookTitle(book.getBookTitle());
        book1.setBookPrice(book.getBookPrice());
        book1.setBookDescription(book.getBookDescription());
        book1.setStudent(book.getStudent());
        return iBook.save(book1);
    }

    public void deleteBook(Integer bookId) {
         iBook.deleteById(bookId);
    }
}
