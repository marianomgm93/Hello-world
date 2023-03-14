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
public class EjercicioExtra4 {

    /**
     * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
     * muestre su equivalente en romano.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        do {
            if (num <= 3) {
                for (int i = 0; i < num; i++) {
                    System.out.print("I");
                    num--;
                }

            } else if (num == 4) {
                System.out.print("IV");
                num -= 4;
            } else if (num == 10) {
                System.out.print("X");
                num -= 10;
            } else if (num>=5) {
                System.out.print("V");
                num -= 5;
            } else if (num == 9) {
                System.out.println("IX");
                num-=9;
            }
            

        } while (num>0);

    }

}
