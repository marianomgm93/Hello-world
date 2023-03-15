package clase.pkg7.y.pkg8;

import java.util.Scanner;

public class Ejercicio2 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        /* Diseñe una función que pida el nombre y la edad de N personas e 
        imprima los datos de las personas ingresadas por teclado e indique si son 
        mayores o menores de edad. Después de cada persona, el programa debe preguntarle 
        al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese 
        la palabra “No”.*/
        System.out.println("Ingrese la cantidad de personas a insertar en el sistema");
        blog(leer.nextInt());

    }

    public static void blog(int n) {
        String nombre;
        int edad;
        boolean menu = true;
        int contador = 1;
        String confirmacion;
        do {
            System.out.println("Ingrese un nombre para la persona " + contador);
            nombre = leer.next();

            System.out.println("Ingrese la edad de la persona " + contador);
            edad = leer.nextInt();

            if (edad < 18) {
                System.out.println(nombre + " es menor de edad");

            } else {
                System.out.println(nombre + " es mayor de edad");
            }

            if (contador != n) {
                System.out.println("Desea seguir ingresando personas? s/n");
                confirmacion = leer.next();
                if (confirmacion.equalsIgnoreCase("n")) {
                    menu = false;
                }
            } else {
                menu = false;
            }
            contador++;

        } while (menu);

    }
}
