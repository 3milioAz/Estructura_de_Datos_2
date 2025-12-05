package com.mx.ux.unidad3.colas;

import java.util.LinkedList;
import java.util.Queue;

public class EjemploQueue {

    public static void main(String[] args) {

        //Crear una instancia
        Queue<String> cola = new LinkedList<>();
        cola.add("Elemento: 1");
        cola.add("Elemento: 2");
        cola.add("Elemento: 3");

        System.out.println("Contenido de la cola: " + cola);
        System.out.println("Primer Elemento: " + cola.peek());

    }
}
