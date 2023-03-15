package clase.pkg7.y.pkg8;

import java.util.Scanner;

public class Ejercicio4 {
    static Scanner leer=new Scanner(System.in);
    public static void main(String[] args) {
     /*Crea una aplicación que nos pida un número por teclado y con una función 
    se lo pasamos por parámetro para que nos indique si es o no un número primo, 
    debe devolver true si es primo, sino false.
    Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
    Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.*/
     System.out.println("Ingrese un numero");
        System.out.println(esPrimo(leer.nextInt()));
     
    }
    public static boolean esPrimo(int num){
        boolean primo=true;
        
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num%i==0) {
                primo=false;
                break;
            }
        }
        
                
                
                
        return primo;
    }
}
