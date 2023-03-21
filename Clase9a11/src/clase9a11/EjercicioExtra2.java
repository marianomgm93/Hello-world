package clase9a11;

import java.util.Scanner;

public class EjercicioExtra2 {
    private static Scanner leer=new Scanner(System.in);
    public static void main(String[] args) {
        /*Escriba un programa que averigüe si dos vectores de N 
    enteros son iguales (la comparación deberá detenerse en 
    cuanto se detecte alguna diferencia entre los elementos).*/
        System.out.println("Ingrese la dimension del vector");
        int n=leer.nextInt();
        int[]vector1=new int[n];
        int[]vector2=new int[n];
        
        llenar(vector1);
        llenar(vector2);
        print(vector1);
        print(vector2);
        
        System.out.println(sonIguales(vector1,vector2));
        
    }

    public static void llenar(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*10);
        }

    }

    public static void print(int[] vector) {
        System.out.println("Vector");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" [" + vector[i] + "]");
        }
        System.out.println("");
    }
    public static boolean sonIguales(int[]vector1,int[]vector2) {
        boolean resultado=true;
        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i]!=vector2[i]) {
                resultado=false;
                break;
            }
        }
        
        return resultado;
    }
}
