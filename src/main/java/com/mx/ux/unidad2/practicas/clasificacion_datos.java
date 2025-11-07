package com.mx.ux.unidad2.practicas;

import java.util.Arrays;

public class clasificacion_datos {

    public static void main(String[] args) {
        // Lista con las puntuaciones de importancia
        int[] importancias = {75, 20, 55, 40, 90, 10, 60, 30};

        // Lista con los productos
        String[] productos = {"motos", "doctor", "comida", "peliculas", "carros", "maquillaje", "pension", "electricidad"};
        System.out.println("Productos no Ordenados:");
        System.out.println(Arrays.toString(productos));

        int n = importancias.length;
        //         Algoritmo de selección para ordenar de mayor a menor
        for (int i = 0; i < n; i++) {
            int maximo = i;
            for (int j = i + 1; j < n; j++) {
                if (importancias[j] > importancias[maximo]) {
                    maximo = j;
                }
            }
            // Intercambiar
            int temp = importancias[i];
            importancias[i] = importancias[maximo];
            importancias[maximo] = temp;

            // Intercambiar productos
            String temp_s = productos[i];
            productos[i] = productos[maximo];
            productos[maximo] = temp_s;
        }
        System.out.println("Productos ordenados por importancia (mayor a menor):");
        System.out.println(Arrays.toString(productos));
        System.out.println("Importancias:");
        System.out.println(Arrays.toString(importancias));
    }
}
