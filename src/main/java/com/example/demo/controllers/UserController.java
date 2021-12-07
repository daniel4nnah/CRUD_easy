package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.demo.models.Usuario;
import com.example.demo.services.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/verUsuarios")
    public List<Usuario> getAllUsuarios(){
        return UserService.getAllUsuarios();
    }

    @GetMapping("/verUsuario/{usuarioId}")
    public Usuario getUsuarioById(@PathVariable Long usuarioId){
        return UserService.getUsuarioById(usuarioId);
    }

    @GetMapping("/saludar/{usuarioId}")
    public String saludar(Long usuarioId){
        return UserService.saludo(usuarioId);
    }

    @GetMapping("/actualizarUsuario/{usuarioId}")
    public Usuario updateUsuario(Long usuarioId, Usuario usuario){
        return UserService.updateUsuario(usuarioId, usuario);
    }

    @GetMapping("/agregarUsuario")
    public Usuario addUsuario(Usuario usuario){
        return UserService.addUser(usuario);
    }

    @GetMapping("/eliminarUsuario/{usuarioId}")
    public Usuario eliminarUsuario(Long usuarioId){
        return UserService.deteleBook(usuarioId);
    }
/*
    List<Usuario> lista_usuarios = new ArrayList<>();

    @RequestMapping(value = "/usuarios")
    public List<Usuario> verUsuarios(){
        //Datos primer usuario
        Usuario usuario1 = new Usuario();
        usuario1.setId(1);
        usuario1.setIdioma("Es");
        usuario1.setNombre("Laura");

        //Datos segundo usuario
        Usuario usuario2 = new Usuario();
        usuario2.setId(2);
        usuario2.setIdioma("En");
        usuario2.setNombre("Oscar");

        //Datos tercer usuario
        Usuario usuario3 = new Usuario();
        usuario3.setId(3);
        usuario3.setIdioma("De");
        usuario3.setNombre("Ulises");

        //Datos cuarto usuario
        Usuario usuario4 = new Usuario();
        usuario4.setId(4);
        usuario4.setIdioma("Es");
        usuario4.setNombre("Paola");

        lista_usuarios.add(usuario1);
        lista_usuarios.add(usuario2);
        lista_usuarios.add(usuario3);
        lista_usuarios.add(usuario4);
        return lista_usuarios;

    }

    @GetMapping("/get/{id}")
    public String saludoUsuario(Long Id, String nombre, String idioma){
        for (Usuario u : lista_usuarios){
            System.out.println(lista_usuarios);
            //if (Arrays.asList(lista_usuarios).contains(u))
            if (lista_usuarios.contains(u))
            {
                System.out.println(u);
                if (u.getIdioma() == "Es"){
                    return "Hola usuario";
                } if (u.getIdioma() == "De"){
                    return "Hallo Benutzer";
                } else {
                    return "Hello User";
                }
            }
            else {
                return "No se encontraron usuarios";
            }
        }
        return "Final";
    }
    */
    
}
