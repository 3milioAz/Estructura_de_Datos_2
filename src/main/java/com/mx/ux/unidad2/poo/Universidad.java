package com.mx.ux.unidad2.poo;

public class Universidad {

    public static void main(String[] args) {
        // Crear un objeto de la clase alumno
        Alumno alumno = new Alumno();
        alumno.inscripcionCurso();
        alumno.inscripcionTaller();
        System.out.println("Mensualidad: " + alumno.pagoMensualidad());
        System.out.println("Horas de estudio: "
                + alumno.calcularHorasEstudio(1, 5));
        System.out.println("***********************************");

        // Crear un segundo alumno
        Alumno alumno2 = new Alumno();
        alumno2.inscripcionCurso();
        alumno2.pagoMensualidad();
        alumno2.inscripcionTaller();
        System.out.println("Horas de estudio: "
                + alumno.calcularHorasEstudio(1, 5));

        // Invocar al metodo sin crear un objeto de la clase Docente
        Docente.asignarCalificacion();
    }



}
