/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaclase4;

import java.util.Scanner;

/**
 *
 * @author Hammerforce
 */
public class JavaEjercicio7 {

    /**
     * Realizar un programa que simule el funcionamiento de un dispositivo
     * RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
     * cadenas deben llegar con un formato fijo: tienen que ser de un máximo de
     * 5 caracteres de largo, el primer carácter tiene que ser X y el último
     * tiene que ser una O. Las secuencias leídas que respeten el formato se
     * consideran correctas, la secuencia especial “&&&&&” marca el final de los
     * envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete
     * el formato se considera incorrecta. Al finalizar el proceso, se imprime
     * un informe indicando la cantidad de lecturas correctas e incorrectas
     * recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan
     * las siguientes funciones de Java Substring(), Length(), equals().
     *
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int correctos = 0;
        int incorrectos = 0;
        int opcion;
        String codigo;
        boolean menu = true;
        do {

            System.out.println("Ingresar nuevo codigo");
            codigo = leer.nextLine();
            if (codigo.length() <= 5) {
                if (codigo.equals("&&&&&")) {
                    menu = false;
                } else if (codigo.substring(0, 1).toUpperCase().equals("X") && codigo.substring(codigo.length() - 1, codigo.length()).toUpperCase().equals("O")) {
                    correctos += 1;

                } else {
                    incorrectos += 1;
                }

            } else {
                System.out.println("El codigo ingresado debe contener menos de 5 caracteres");
            }

        } while (menu);
        System.out.println("Los codigos correctos ingresados fueron " + correctos);
        System.out.println("Los codigos incorrectos ingresados fueron: " + incorrectos);

    }

}
