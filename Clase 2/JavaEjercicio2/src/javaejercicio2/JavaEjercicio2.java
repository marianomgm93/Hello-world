/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaejercicio2;

import java.util.Scanner;

/**
 *
 * @author Hammerforce
 */
public class JavaEjercicio2 {

    /**
     Escribir un programa que pida tu nombre, 
     lo guarde en una variable y lo muestre por pantalla.

     */
    public static void main(String[] args) {
        Scanner leerNombre=new Scanner(System.in);
        
        String nombre;
        System.out.println("Ingrese su nombre");
        nombre=leerNombre.next();
        System.out.println(nombre);
        
        
        
    }
    
}
