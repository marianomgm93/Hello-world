/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Hammerforce
 */
public class EjercicioExtra2 {

    /**
     * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
     * diferente a cada una.. A continuación, realizar las instrucciones
     * necesarias para que: B tome el valor de C, C tome el valor de A, A tome
     * el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
     * valores finales de cada variable. Utilizar sólo una variable auxiliar.
     *
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor para a");
        int a = leer.nextInt();
        System.out.println("Ingrese un valor para b");
        int b = leer.nextInt();
        System.out.println("Ingrese un valor para c");
        int c = leer.nextInt();
        System.out.println("Ingrese un valor para d");
        int d = leer.nextInt();
        String aux = "iniciales: a= " + a + " b= " + b + " c= " + c + " d= " + d;
        b = c;
        c = a;
        a = d;
        d = b;
        aux += "finales: a= " + a + " b= " + b + " c= " + c + " d= " + d;
        System.out.println(aux);
    }

}
