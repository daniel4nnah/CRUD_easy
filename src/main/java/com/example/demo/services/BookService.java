package com.example.demo.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.models.Book;

public class BookService {

    private static Map<Long, Book> libros = new HashMap<>();
    private static Long index = 2L;
    
    static{
        Book libro1 = new Book(1L, "Don Quijote de la Mancha", "Miguel de Cervantes", "Es", "Ciencia Ficcion", 1000);
        Book libro2 = new Book(2L, "Cazadores de Sombras", "Cassandra Clase", "En", "Ciencia Ficcion", 450);
        libros.put(1L, libro1);
        libros.put(2L, libro2);
    }

    public static List<Book> getAllBooks(){
        return new ArrayList<>(libros.values());
    }

    public static Book getBookDetails(Long bookId){
        return libros.get(bookId);
    }

    public static Book addBook(Book book){
        index += 1; 
        book.setId(index); 
        libros.put(index, book); //Se agrega a la lista de libros
        return book;
    }

    public static Book updateBook(Long bookId, Book book){
        book.setId(bookId);
        libros.put(bookId, book);
        return book;
    }

    public static Book deteleBook(Long bookId){
        return libros.remove(bookId);
    }

}
