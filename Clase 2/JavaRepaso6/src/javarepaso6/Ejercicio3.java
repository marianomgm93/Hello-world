/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarepaso6;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 * Para leer numeros -> nextInt()
 * @author BlackMadia
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase para mostrar en minusculas y mayusculas");
        frase = leer.nextLine();
        
        /*
        String mayusculas = frase;
        mayusculas = toUpperCase(mayusculas);
        System.out.println(mayusculas);
        
        String minusculas = frase;
        minusculas = toLowerCase(minusculas);
        System.out.println(minusculas);
        */
        
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
    }
}