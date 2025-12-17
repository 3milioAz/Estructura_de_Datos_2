package com.mx.ux.unidad4.implementaciones;

import java.util.Stack;

public class DeshacerEntrenamiento {
    public static void main(String[] args) {
        Stack<String> cambios = new Stack<>();

        for (int i = 1; i <= 5; i++) {
            cambios.push("Cambio " + i);
        }

        String ultimo = cambios.pop();
        System.out.println("Deshaciendo: " + ultimo);
    }
}