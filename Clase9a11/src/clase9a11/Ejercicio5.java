package clase9a11;

import java.util.Random;

public class Ejercicio5 {

    public static void main(String[] args) {
        /*Realice un programa que compruebe si una matriz dada es antisimétrica. 
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de una 
matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).*/
        
       int[][] matriz={{0,-2,4},{2,0,2},{-4,-2,0}};
       
       print(3,3,matriz);
       
        System.out.println("la matriz es antisimetrica?: "+ esAntisimetrica(matriz,trasponerMatriz(opuestaMatriz(matriz))));
        
    }

    public static void print(int filas, int columnas, int[][] matriz) {
        System.out.println("Matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("  " + matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void llenar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }

    }

    public static int[][] trasponerMatriz(int[][] matriz) {
        int[][] traspuesta = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                traspuesta[i][j] = matriz[j][i];
            }
        }
        System.out.println("Traspuesta");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("  " + traspuesta[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        
        return traspuesta;

    }

    public static int[][] opuestaMatriz(int[][] matriz) {
        int[][] opuesta = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                opuesta[i][j] = -matriz[i][j];
            }
        }
        System.out.println("Opuesta");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("  " + opuesta[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        return opuesta;
    }

    public static boolean esAntisimetrica(int[][] matriz, int[][] opuesta) {
        boolean antisimetrica = true;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                if (matriz[i][j] != opuesta[i][j]) {

                    antisimetrica = false;
                    break;
                }

            }
        }

        return antisimetrica;

    }

}
