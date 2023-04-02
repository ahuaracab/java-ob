package com.ob.ejercicio789;

import java.io.*;
import java.util.*;

public class Miscelanea {

    public static void main(String[] args) {

        HashMap<String, Integer> mapa = new HashMap<String, Integer>();

        ArrayList<String> lista = new ArrayList<String>();
        String currentDir = System.getProperty("user.dir");

        try {

            String filePathIn = currentDir + "/src/main/java/com/ob/ejercicio789/entrada.txt";
            InputStream inputStream = new FileInputStream(filePathIn);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                String[] palabras = linea.split(" ");
                for (String palabra : palabras) {
                    if (mapa.containsKey(palabra)) {
                        mapa.put(palabra, mapa.get(palabra) + 1);
                    } else {
                        mapa.put(palabra, 1);
                    }
                    if (!lista.contains(palabra)) {
                        lista.add(palabra);
                    }
                }
            }
            inputStream.close();

        } catch (IOException e) {
            System.out.println("Error al leer el archivo de entrada: " + e.getMessage());
            return;
        }

        OutputStream outputStream;
        try {

            String filePathOut = currentDir + "/src/main/java/com/ob/ejercicio789/salida.txt";
            outputStream = new FileOutputStream(filePathOut);
            PrintStream printStream = new PrintStream(outputStream);

            for (String palabra : lista) {
                printStream.println(palabra + " : " + mapa.get(palabra));
            }

            outputStream.close();

            System.out.println("Archivo de salida generado exitosamente.");

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo de salida: " + e.getMessage());
            return;
        }

    }

}
