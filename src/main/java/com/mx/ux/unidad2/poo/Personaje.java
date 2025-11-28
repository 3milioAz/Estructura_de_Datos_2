package com.mx.ux.unidad2.poo;

public class Personaje {

    private String nombre;

    public double puntosVida(){
        return 2000.00;
    }
    public int puntosDano(){
        return 75;
    }
    public void sigueVivo(){
        System.out.println("Finn sigue con vida");
    }
    public int calcularDanoPorSegundo(int puntosDano, int velocidadAtaque){
        return puntosDano * velocidadAtaque;
    }


    public static void main(String[] args) {
        Personaje finn = new Personaje();
        System.out.println("Puntos de vida: "+ finn.puntosVida());
        System.out.println("Puntos de dano : "+ finn.puntosDano());
        finn.sigueVivo();
        System.out.println("Daño por segundo: "
                + finn.calcularDanoPorSegundo(finn.puntosDano(), 3));
    };
}
