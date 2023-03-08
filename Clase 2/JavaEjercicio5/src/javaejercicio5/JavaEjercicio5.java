/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaejercicio5;

import java.util.Scanner;

/**
 *
 * @author Hammerforce
 */
public class JavaEjercicio5 {

    /**
     Escribir un programa que lea un número entero por teclado y 
     muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
        Nota: investigar la función Math.sqrt().
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero");
        num=leer.nextInt();
        System.out.println("El doble del numero: " + num*2);
        System.out.println("El triple del numero: " + num*3);
        System.out.println("La Raiz cuadrada del numero: " + Math.sqrt(num));
        
    }
    
}
