package com.mx.ux.unidad4.red.social;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RedSocial {

    private final Map<Usuario, List<Usuario>> adjencias = new HashMap<>();

    public void conectarAmigos(Usuario seguidor, Usuario seguido) {
        if (!adjencias.containsKey(seguidor) || !adjencias.containsKey(seguido)) {
            throw new IllegalArgumentException("Los usuarios no existen en la red social");
        }

        adjencias.get(seguidor).add(seguido);
        adjencias.get(seguido).add(seguidor);
    }

    public void imprimirRed() {
        adjencias.forEach((usuario, amigos) -> {
            System.out.println(usuario.getNombre() +
                    " es amigo de: " + amigos);

        });
    }

    public void agregarUsuarios(Usuario usuario) {
        adjencias.putIfAbsent(usuario, new java.util.ArrayList<>());
    }

    public static void main(String[] args) {
        RedSocial red = new RedSocial();

        //Crear Nodos
        Usuario ana = new Usuario("Ana", 1);
        Usuario hector = new Usuario("Hector", 2);
        Usuario esteban = new Usuario("Esteban", 3);
        Usuario lupita = new Usuario("Lupita", 4);
        Usuario juan = new Usuario("Juan", 5);

        //Registrar Nodos
        red.agregarUsuarios(ana);
        red.agregarUsuarios(hector);
        red.agregarUsuarios(esteban);
        red.agregarUsuarios(lupita);
        red.agregarUsuarios(juan);

        //Crear conexiones entre amigos
        red.conectarAmigos(ana, esteban);
        red.conectarAmigos(lupita, juan);
        red.conectarAmigos(esteban, hector);
        red.conectarAmigos(ana, lupita);

        red.imprimirRed();
    }

}