package com.ob;

import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        String[] nombres = {"Angelo", "Jose", "Pedro", "Enrique"};
        String nombresConcatenados = concatenarNombres(nombres);
        System.out.println(nombresConcatenados);
    }

    private static String concatenarNombres(String[] nombres) {
        String concatenado = "";
        for (String nombre:nombres) {
            concatenado = concatenado + nombre;
        }
        return concatenado;
    }
}
