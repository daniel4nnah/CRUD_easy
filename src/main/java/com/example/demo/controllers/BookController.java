package com.example.demo.controllers;

import java.util.List;

import com.example.demo.models.Book;
import com.example.demo.services.BookService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @GetMapping("/libros")
    public List<Book> getAllBooks(){
        return BookService.getAllBooks();
    }

    @GetMapping("/detalles/{bookId}")
    public Book getBookDetails(@PathVariable Long bookId){
        return BookService.getBookDetails(bookId);
    }

    @PostMapping("/agregar")
    public Book addBook(@RequestBody Book book){
        return BookService.addBook(book);
    }

    @PutMapping("/modificar/{bookId}")
    public Book updateBook(@PathVariable Long bookId, @RequestBody Book book){
        return BookService.updateBook(bookId, book);
    }
    
    @DeleteMapping("/eliminar/{bookId}")
    public Book deleteBook(@PathVariable Long bookId){
        return BookService.deteleBook(bookId);
    }
}
