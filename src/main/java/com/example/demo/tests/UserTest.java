package com.example.demo.tests;

import java.util.List;

import com.example.demo.models.Usuario;
import com.example.demo.services.UserService;

public class UserTest {
    private static UserService user;
    
    //Mostrar que sí se están agregando los usuarios nuevos
    public static String mostrarUsuario(){
        String prueba = "Datos antes" + user.getAllUsuarios();
        //Usuario nuevo_usuario = new Usuario();
        //user.addUser(nuevo_usuario);
        prueba = prueba + "Datos nuevos" + user.getAllUsuarios();
        return String.format(prueba);
    }
    
}
