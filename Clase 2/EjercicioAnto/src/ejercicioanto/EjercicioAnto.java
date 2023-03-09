/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioanto;

import java.util.Scanner;

/**
 *
 * @author Hammerforce
 */
public class EjercicioAnto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();

        asteriscos(num1);
        asteriscos(num2);

    }

    public static void asteriscos(int num) {

        if (num > 20) {
            System.out.println("EL NUMERO " + num + " ES DEMASIADO GRANDE, INGRESE UN NUMERO MENOR QUE 20");

        } else {
            System.out.print(num);
            for (int i = 0; i < num; i++) {
                System.out.print("*");

            }
            System.out.println("");
        }
    }
}
