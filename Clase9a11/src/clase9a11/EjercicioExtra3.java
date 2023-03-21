package clase9a11;

import java.util.Scanner;

public class EjercicioExtra3 {

    public static void main(String[] args) {
        /*Crear una función rellene un vector con números aleatorios, 
        pasándole un arreglo por parámetro. Después haremos otra función 
        o procedimiento que imprima el vector.
         */
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        int[] vector = new int[n];
        llenar(vector);
        imprimir(vector);

    }

    public static int[] llenar(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);

        }
        return vector;
    }

    public static int[] imprimir(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" [" + vector[i] + "]");
        }
        System.out.println(" ");
        return vector;
    }

}
