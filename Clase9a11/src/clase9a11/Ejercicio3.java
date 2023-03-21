package clase9a11;

import java.util.Scanner;

public class Ejercicio3 {

    /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
    cuántos de 2 dígitos, etcétera (hasta 5 dígitos).*/
    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int contador = 0;
        int[] vector = new int[n];
        int cant, dig1 = 0, dig2 = 0, dig3 = 0, dig4 = 0, dig5 = 0;
        // Fill the vector with random numbers
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100);
        }

        // Print the vector to verify its contents
        for (int i : vector) {
            System.out.print(" " + i);
        }

        for (int i : vector) {
            System.out.print(i + " ");
            switch (cantDig(i)) {
                case 1:
                    dig1++;
                    break;
                case 2:
                    dig2++;
                    break;
                case 3:
                    dig3++;
                    break;
                case 4:
                    dig4++;
                    break;
                case 5:
                    dig5++;
                    break;
                default:
                    throw new AssertionError();
            }
        }

        System.out.println("\n1 digito: " + dig1);
        System.out.println("2 digito: " + dig2);
        System.out.println("3 digito: " + dig3);
        System.out.println("4 digito: " + dig4);
        System.out.println("5 digito: " + dig5);
    }

    public static int cantDig(int a) {
        int ab = 0;
        while (a >= 1) {
            a = a / 10;
            ab++;
        }
        return ab;

    }

}
