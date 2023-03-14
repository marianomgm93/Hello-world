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
public class EjercicioExtra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Simular la división usando solamente restas. Dados dos números enteros mayores que 
        uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
        Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
        este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
         */

        Scanner leer = new Scanner(System.in);

        int num1, num2, contador = 0;

        System.out.println("Ingrese el dividendo");
        num1 = leer.nextInt();
        System.out.println("Ingrese el divisor");
        num2 = leer.nextInt();
        if (num1 > 1 && num2 > 1) {
            do {
                num1 -= num2;
                contador++;

            } while (num1 > num2);

        }else{
            System.out.println("Ambos numeros deben ser mayores que uno");
        }
        System.out.println("Cociente: "+contador);
        System.out.println("Residuo: " +num1);
        
    }

}
