package EjerciciosExtra;

import static java.lang.Math.random;
import static java.lang.Math.round;
import java.util.Scanner;

public class EjercicioExtra14 {

    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Se dispone de un conjunto de N familias, cada una de las cuales tiene una 
        M cantidad de hijos. Escriba un programa que pida la cantidad de familias 
        y para cada familia la cantidad de hijos para averiguar la media de edad de 
        los hijos de todas las familias.
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de familias");
        int n = leer.nextInt();
        int m;
        int edad = 0;
       

        for (int i = 1; i < n + 1; i++) {
            m = (int) round(random() * 2+1);
            System.out.println(m);

            int suma = 0;
            for (int j = 1; j < m + 1; j++) {

                edad = (int) round(random() * 17 + 1);

                suma += edad;

                System.out.println(j + " " + edad);
            }
            
            System.out.println("La media de edad de los hijos de la familia " + i + " es de: " + (suma / m));
            System.out.println("");
        }

    }

}
