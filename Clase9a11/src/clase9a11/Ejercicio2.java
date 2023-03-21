package clase9a11;

import java.util.Scanner;

public class Ejercicio2 {
    private static Scanner leer=new Scanner(System.in);
    
    public static void main(String[] args) {
        /*Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
        le pida al usuario un número a buscar en el vector. El programa mostrará dónde se encuentra 
        el número y si se encuentra repetido*/
      
        System.out.println("Ingrese el tamaño del vector");
        int n=leer.nextInt();
        int num;
        int contador=0;
        int[] vector=new int[n];
        
        // Fill the vector with random numbers
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int)(Math.random()*100);
        }
        
        // Print the vector to verify its contents
        for (int i : vector) {
            System.out.print(" "+i); // use "i" instead of "vector[i]"
        }
        
        System.out.println("\nQue numero desea buscar dentro del vector?"); // use "\n" to print a new line before the prompt
        num=leer.nextInt();
        
        // Search for the number in the vector
        for (int i = 0; i < vector.length; i++) { // use a regular for loop instead of a for-each loop
            if (vector[i]==num) {
                contador++;
                System.out.println("El número "+num+" se encuentra en la posición "+i+" del vector");
            }
        }
        
        if (contador == 0) {
            System.out.println("El número "+num+" no se encuentra en el vector");
        } else {
            System.out.println("El número "+num+" se encuentra "+contador+" veces en el vector");
        }
    }
}
