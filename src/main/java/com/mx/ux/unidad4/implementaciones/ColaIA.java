package com.mx.ux.unidad4.implementaciones;

import java.util.LinkedList;
import java.util.Queue;

public class ColaIA {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        cola.add("Entrenar modelo A");
        cola.add("Entrenar modelo B");

        while (!cola.isEmpty()) {
            String tarea = cola.poll();
            System.out.println("Procesando: " + tarea);
        }
    }
}