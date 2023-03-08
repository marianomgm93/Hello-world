
package javaintro01;

import java.util.Scanner;

public class JavaIntro01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
/*Escribir un programa que pida dos números enteros por teclado y 
calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma*/
    Scanner leer=new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num1=leer.nextInt();
        System.out.println("Ingrese un numero");
        int num2=leer.nextInt();
    
        System.out.println(num1+num2);
        
        
    }
    
}
