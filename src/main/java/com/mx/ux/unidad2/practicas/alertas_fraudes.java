package com.mx.ux.unidad2.practicas;

import java.util.Arrays;

public class alertas_fraudes {

    public static void insertionSort(float[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            float key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        float[] datos = {.45f, .87f, .23f, .91f, .66f, .12f, .78f, .34f, .59f, .99f};

        System.out.println("Arreglo original:");
        System.out.println(Arrays.toString(datos));

        insertionSort(datos);

        System.out.println("\nArreglo ordenado:");
        System.out.println(Arrays.toString(datos));
    }
}