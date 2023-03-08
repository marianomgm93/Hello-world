
package javaejercicio3;

import java.util.Scanner;

/**
 *
 * @author Hammerforce
 */
public class JavaEjercicio3 {

    /**
     Escribir un programa que pida una frase y 
     la muestre toda en mayúsculas y después toda en minúsculas. 

     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase=leer.nextLine();
        System.out.println("En Minusculas: " + frase.toLowerCase());
        System.out.println("En Mayusculas: " + frase.toUpperCase());
        
        
        
        
    }
    
}
