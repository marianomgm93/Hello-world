/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaejercicio4;

import java.util.Scanner;

/**
 *
 * @author Hammerforce
 */
public class JavaEjercicio4 {

    /**
    Dada una cantidad de grados centígrados se debe mostrar 
    su equivalente en grados Fahrenheit. 
    La fórmula correspondiente es: F = 32 + (9 * C / 5).

     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        double temperatura;
        System.out.println("Ingrese la temperatura");
        temperatura=leer.nextDouble();
        System.out.println(32+(9*temperatura/5));
        
        
    }
    
}
