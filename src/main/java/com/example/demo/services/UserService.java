package com.example.demo.services;

import com.example.demo.tests.UserTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.example.demo.models.Usuario;
import com.example.demo.tests.UserTest;

public class UserService {

    private static Map<Long, Usuario>  l_usuarios= new HashMap<>();
    private static Long index = 113L;

    static{
        Usuario usuario1 = new Usuario(111L, "Laura", "Es");
        Usuario usuario2 = new Usuario(112L, "Michelle", "En");
        Usuario usuario3 = new Usuario(113L, "Ulises", "Du");

        l_usuarios.put(111L, usuario1);
        l_usuarios.put(112L, usuario2);
        l_usuarios.put(113L, usuario3);
    }

    public static List<Usuario> getAllUsuarios(){
        return new ArrayList<>(l_usuarios.values());
    }

    public static Usuario getUsuarioById(Long usuarioId){
        return l_usuarios.get(usuarioId);
    }

    public static String saludo(Long usuarioId){
        Usuario u = l_usuarios.get(0);
        String la = u.getIdioma();

        if (la.equals("Es")){
            System.out.println("USUARIO" + l_usuarios.get(usuarioId));
            return "Hola usuario";
        } if (la.equals("En")){
            System.out.println("USUARIO" + l_usuarios.get(usuarioId));
            return "Hello user";
        } if (la.equals("Du")) {
            System.out.println("USUARIO" + l_usuarios.get(usuarioId));
            return "Hallo Benutzer";
        }
        else {
            return "No se encontraron";
        }
    }

    public static Usuario updateUsuario(Long usuarioId, Usuario usuario){
        usuario.setId(usuarioId);
        l_usuarios.put(usuarioId, usuario);
        return usuario;
    }

    public static Usuario addUser(Usuario usuario){
        index += 1; 
        usuario.setId(index); 
        l_usuarios.put(index, usuario); //Se agrega a la lista de libros
        UserTest.mostrarUsuario();
        return usuario;
        
    }

    public static Usuario deteleBook(Long usuarioId){
        return l_usuarios.remove(usuarioId);
    }
}
