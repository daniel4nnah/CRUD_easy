package com.example.demo.models;

public class Usuario {
    private long id;
    private String nombre;
    private String idioma;

    public Usuario(){
        
    }

    public Usuario(long id, String nombre, String idioma){
        this.id = id;
        this.nombre = nombre;
        this.idioma = idioma;

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

    public String getIdioma() {
        return this.idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}
