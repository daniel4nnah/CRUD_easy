package com.example.demo;

import java.util.List;

import static org.mockito.Mockito.when;

import java.util.Arrays;

import com.example.demo.controllers.UserController;
import com.example.demo.models.Usuario;
import com.example.demo.services.UserService;

//import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


public class BookTest {

    @Mock
    private UserService userService;
    private UserController userControll;

    private Usuario usu1;
    private Usuario usu2;
    private List<Usuario> lista_usuarios;
    
    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);
        usu1 = new Usuario(114L, "Andrea", "Es");
        usu2 = new Usuario(115L, "María", "Du");
        lista_usuarios = Arrays.asList(usu1, usu2);
    }

    @Test
    public void viewAll(){
        when(userControll.getAllUsuarios()).thenReturn(lista_usuarios);
        if (userControll.getAllUsuarios().size() == lista_usuarios.size()){
            System.out.println("Ok.");
        }
        else {
            ResourceNotFoundException e;
            //e.printStackTrace();
        }
    }
}
