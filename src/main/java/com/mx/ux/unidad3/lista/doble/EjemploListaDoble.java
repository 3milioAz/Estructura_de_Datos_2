package com.mx.ux.unidad3.lista.doble;

public class EjemploListaDoble {

    public static void main(String[] args) {

        ListaDoble lista = new ListaDoble();
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.agregar(4);

        System.out.println("Recorremos hacia adelante: ");
        lista.imprimirHaciaDelante();

        System.out.println("Recorremos hacia atras: ");
        lista.imprimirHaciaAtras();
    }
}

class Nodo{

    int dato;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(int dato){  // Este es el constructor
        this.dato = dato;
        this.anterior = null;
        this.siguiente = null;
    }

}

class ListaDoble{

    Nodo cabeza;    // Referencia al primer nodo
    Nodo cola;      // Referencia al ultimo nodo

    public ListaDoble(){
        this.cabeza = null;
        this.cola = null;

    }

    // Construir un metodo para agregar un nodo al final de la lista
    public void agregar(int dato){

        Nodo nuevoNodo = new Nodo(dato);   // Esta es una instacia con la forma: clase + objeto = operador: NEW + nombre de la clase

        if (cabeza == null){
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            return;
        }

        cola.siguiente = nuevoNodo;
        nuevoNodo.anterior = cola;
        cola = nuevoNodo;
    }

    public void imprimirHaciaDelante(){
        Nodo actual = cabeza;
        while(actual != null){
            System.out.println(actual.dato + "<->");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    public void imprimirHaciaAtras(){
        Nodo actual = cola;
        while(actual != null){
            System.out.println(actual.dato + "<->");
            actual = actual.anterior;
        }
        System.out.println("null");
    }


}