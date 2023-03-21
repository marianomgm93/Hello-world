package clase9a11;

import java.util.Scanner;

public class Ejercicio4 {

    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        /*   Realizar un programa que rellene un matriz de 4 x 4 de valores 
aleatorios y muestre la traspuesta de la matriz. La matriz traspuesta de una 
matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).*/

        int[][] matriz = new int[4][4];
        int[][] traspuesta = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < traspuesta.length; i++) {
            for (int j = 0; j < traspuesta.length; j++) {
                traspuesta[i][j] = matriz[j][i];
            }
        }

        for (int i = 0; i < traspuesta.length; i++) {
            for (int j = 0; j < traspuesta.length; j++) {
                System.out.print(" " + traspuesta[i][j]);
            }
            System.out.println("");
        }
    }

}
