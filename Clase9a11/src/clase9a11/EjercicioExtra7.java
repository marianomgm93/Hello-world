package clase9a11;

import java.util.Scanner;

public class EjercicioExtra7 {

    public static void main(String[] args) {
        /*Realizar un programa que complete un vector con los N primeros números de la sucesión 
de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...*/

        Scanner leer = new Scanner(System.in);
        System.out.println("Introducir la dimension del vector: ");
        int dim = leer.nextInt();
        int vector[] = new int[dim];
        int a = 0, b = 1, c;
        for (int i = 0; i < dim; i++) {
            System.out.print(" " + a);
            c = a + b;
            a = b;
            b = c;
        }

    }
}
