package com.ob.ejercicio789;

import java.io.*;
import java.util.*;

public class Ejercicio789 {
    public static void main(String[] args) throws IOException {
        String textoOriginal = "hola mundo";
        String textoInvertido = reverse(textoOriginal);
        System.out.println("El texto original es: " + textoOriginal);
        System.out.println("El texto invertido es: " + textoInvertido);

        //punto 1
        String[] nombres = {"Juan", "María", "Pedro", "Lucía"};
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        //punto 2
        int[][] numeros = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("El elemento en la posición [" + i + "][" + j + "] es: " + numeros[i][j]);
            }
        }

        //punto 3
        Vector<String> vector = new Vector<String>();
        vector.add("Elemento 1");
        vector.add("Elemento 2");
        vector.add("Elemento 3");
        vector.add("Elemento 4");
        vector.add("Elemento 5");

        System.out.println("Vector antes de eliminar elementos: " + vector);

        vector.remove(2);
        vector.remove(1);

        System.out.println("Vector después de eliminar elementos: " + vector);

        //punto 4
        /* El problema de Vector con su capacidad por defecto para el caso de querer añadir 1000 elementos
        es que si ya no hay suficiente espacio afectará mucho al rendimiento del programa */

        //punto 5
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("Elemento 1");
        arrayList.add("Elemento 2");
        arrayList.add("Elemento 3");
        arrayList.add("Elemento 4");

        List<String> linkedList = new LinkedList<String>(arrayList);

        System.out.println("Elementos del ArrayList:");
        for (String element : arrayList) {
            System.out.println(element);
        }

        System.out.println("\nElementos del LinkedList:");
        for (String element : linkedList) {
            System.out.println(element);
        }

        //punto 6
        List<Integer> arrayListInt = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++) {
            arrayListInt.add(i);
        }

        Iterator<Integer> iterator = arrayListInt.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println("Elementos del ArrayList:");
        for (Integer element : arrayListInt) {
            System.out.println(element);
        }

        //punto 7
        try {
            dividePorCero();
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }

        //punto 8
        String fileIn = "archivo.txt";
        String fileOut = "archivo_copia.txt";
        copiarArchivo(fileIn, fileOut);



    }

    public static String reverse(String texto) {
        char[] textoInvertido = new char[texto.length()];
        int j = 0;
        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido[j] = texto.charAt(i);
            j++;
        }
        return new String(textoInvertido);
    }

    public static void dividePorCero() {
        int a = 3;
        int b = 0;
        int c = a / b;
    }

    public static void copiarArchivo(String fileIn, String fileOut) throws IOException {

        String currentDir = System.getProperty("user.dir");
        String filePathIn = currentDir + "/src/main/java/com/ob/ejercicio789/" + fileIn;
        String filePathOut = currentDir + "/src/main/java/com/ob/ejercicio789/" + fileOut;
        InputStream inputStream = new FileInputStream(filePathIn);
        OutputStream outputStream = new FileOutputStream(filePathOut);

        PrintStream printStream = new PrintStream(outputStream);

        byte[] buffer = new byte[1024];

        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            printStream.write(buffer, 0, bytesRead);
        }

        inputStream.close();
        printStream.close();

    }
}
