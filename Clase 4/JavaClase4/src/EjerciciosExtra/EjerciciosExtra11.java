/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Hammerforce
 */
public class EjerciciosExtra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que lea un número entero y devuelva 
        el número de dígitos que componen ese número. 
        Por ejemplo, si introducimos el número 12345, el programa deberá 
        devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando 
        el operador de división. Nota: recordar que las variables de tipo entero 
        truncan los números o resultados.
         */
        
        Scanner leer=new Scanner(System.in);
        int num;
        int contador=0;
        System.out.println("ingrese un numero");
        num=leer.nextInt();
        do {
            num=Math.round(num/10);
            contador++;
            
        } while (num>0);
        
        System.out.println("El numero ingresado tiene " +contador+ " digitos");
    }

}
