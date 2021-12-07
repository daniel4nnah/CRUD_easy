package com.example.demo.models;

import org.springframework.web.bind.annotation.RestController;


public class Book {
    private long id;
    private String nombre;
    private String autor;
    private String idioma;
    private String genero;
    private int numPaginas;

    public Book(long id, String nombre, String autor, String idioma, String genero, int NumeroPaginas){
        this.id = id;
        this.autor = autor;
        this.nombre = nombre;
        this.idioma = idioma;
        this.genero = genero;
        this.numPaginas = numPaginas;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIdioma() {
        return this.idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumPaginas() {
        return this.numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
}
