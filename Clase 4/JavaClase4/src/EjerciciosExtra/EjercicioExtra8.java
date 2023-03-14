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
public class EjercicioExtra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa que lea números enteros. Si el número es múltiplo 
        de cinco debe detener la lectura y mostrar la cantidad de números leídos,
        la cantidad de números pares y la cantidad de números impares. Al igual 
        que en el ejercicio anterior los números negativos no deben sumarse. 
        Nota: recordar el uso de la sentencia break.
        */
        int numero, contadorPar = 0, contadorImpar= 0;
        Scanner leer = new Scanner(System.in);
        do{
            System.out.println("Ingrese un numero entero positivo: ");
            numero = leer.nextInt();
            while(numero < 0){
                System.out.println("Incorrecto, reinngrese un numero entero positivo: ");
            numero = leer.nextInt();
            }
            if(numero % 2 == 0){
                contadorPar ++;
            }else{
                contadorImpar ++;
            }
            
        }while(numero % 5 != 0);
        
        System.out.println("La cantidad de numeros pares son " + contadorPar + " y la cantidad de numeros impares son " + contadorImpar);
    }
    
}
    
    

