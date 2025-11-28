package com.mx.ux.unidad2.busqueda;

public class Secuencial {

    public static int busquedaSecuencial(int [] arr,  int x){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            if (arr[i] == x) {
                return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] datos = {5, 6 , 7 , 1, 5, 8, 9, 10};
        int elementoBuscar = 5;
        int indice = busquedaSecuencial(datos, elementoBuscar);

        if (indice == -1){
            System.out.println("Elemento no encontrado");
        } else {
            System.out.println("Elemento encontrado");
        }
    }
}
