package com.example.mouredevreto16;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
Reto #16: EN MAYÚSCULA
Crea una función que reciba un String de cualquier tipo y se encargue de poner en mayúscula la primera letra de cada palabra.
No se pueden utilizar operaciones del lenguaje que lo resuelvan directamente.

*/
public class Main {
         public static void main(String[] args) {
            String frase = "hoy es el partido de Chile Contra peRu la pobre eMMa Esta pal gato";
            String[] palabras = frase.split(" ");
            List<String> listaDePalabras = new ArrayList<>(Arrays.asList(palabras));
            String resultado = "";
             for (int i= 0; i< listaDePalabras.size(); i++){
                      String buscadaminuscula = listaDePalabras.get(i).toLowerCase();
                      String buscadaMayuscula = listaDePalabras.get(i).toUpperCase();
                      char caracterMayusculo = buscadaMayuscula.charAt(0);
                      String nuevoelemento = caracterMayusculo + buscadaminuscula.substring(1);
                      resultado += (" "+ nuevoelemento);
                  }
             System.out.println(resultado);
            }
         }