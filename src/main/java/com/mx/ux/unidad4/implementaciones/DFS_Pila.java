package com.mx.ux.unidad4.implementaciones;

import java.util.Stack;

public class DFS_Pila {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();

        pila.push("Nodo A");
        pila.push("Nodo B");
        pila.push("Nodo C");

        while (!pila.isEmpty()) {
            String nodo = pila.pop();
            System.out.println("Visitando: " + nodo);
        }
    }
}