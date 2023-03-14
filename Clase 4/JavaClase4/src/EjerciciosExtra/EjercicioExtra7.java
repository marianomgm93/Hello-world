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
public class EjercicioExtra7 {

    /**
     Realice un programa que calcule y visualice el valor máximo, 
     * el valor mínimo y el promedio de n números (n>0). 
     * El valor de n se solicitará al principio del programa y los números 
     * serán introducidos por el usuario. Realice dos versiones del programa, 
     * una usando el bucle “while” y otra con el bucle “do - while”.

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int n;
        int contador=1;
        int num;
        int min=0;
        int max=0;
        double suma=0;
        double positivos=0;     
        double promedio=0;
        System.out.println("Ingrese la cantidad de numeros");
        n=leer.nextInt();
 /*       
        do {
            System.out.println("Ingrese el numero " + contador);
            contador++;
            num=leer.nextInt();
            if (contador==1) {
                min=num;
                max=num;
                
            }else if(num<min) {
                min=num;
                
            }else if(num>max){
                max=num;
                
            }
            if (num>0){
                suma+=num;
                positivos++;
            }
                    
        } while (contador<n+1);
*/
        while(contador<n+1){
            System.out.println("Ingrese el numero " + contador);
            contador++;
            num=leer.nextInt();
            if (contador==1) {
                min=num;
                max=num;
                
            }else if(num<min) {
                min=num;
                
            }else if(num>max){
                max=num;
                
            }
            if (num>0){
                suma+=num;
                positivos++;
            }
            

            
        }
        promedio=suma/positivos;
 
        System.out.println("El promedio de los numeros es de " + promedio);
        System.out.println("El Numero mas alto es " + max+ " El numero mas bajo es " +min);
        
    }
    
}
