package com.mx.ux.unidad4.implementaciones;

class Nodo {
    String mensaje;
    Nodo siguiente;

    Nodo(String mensaje) {
        this.mensaje = mensaje;
        this.siguiente = null;
    }
}

public class HistorialChat {
    Nodo inicio;

    public void agregarMensaje(String mensaje) {
        Nodo nuevo = new Nodo(mensaje);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            Nodo actual = inicio;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void mostrarHistorial() {
        Nodo actual = inicio;
        while (actual != null) {
            System.out.println(actual.mensaje);
            actual = actual.siguiente;
        }
    }

    public static void main(String[] args) {
        HistorialChat chat = new HistorialChat();
        chat.agregarMensaje("Hola");
        chat.agregarMensaje("¿En qué puedo ayudarte?");
        chat.mostrarHistorial();
    }
}