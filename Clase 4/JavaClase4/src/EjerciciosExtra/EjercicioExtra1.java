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
public class EjercicioExtra1 {

    /**
     * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
     * ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
     * equivalente: 1 día, 2 horas.
     *
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tiempo");
        int tiempo = leer.nextInt();
        int horas = tiempo / 60;
        int dias=0;
        do {
            if (horas > 24) {
                dias+=1;
                horas-=24;
                        
            }
        } while (horas>24);
        
        System.out.println("Dias: " + dias + " horas: " + horas);
    }
    
}
