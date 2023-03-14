/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosExtra;

/**
 *
 * @author Hammerforce
 */
public class EjercicioExtra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Necesitamos mostrar un contador con 3 dígitos (X-X-X), 
//que muestre los números del 0-0-0 al 9-9-9, con la particularidad que 
//cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
//0-0-0
//0-0-1
//0-0-2
//0-0-E
//0-0-4
//0-1-2
//0-1-E
//Nota: investigar función equals() y como convertir números a String.
//
        String contador;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    contador = i + "-" + j + "-" + k;

                    for (int l = 0; l < contador.length(); l++) {
                        if (Character.toString(contador.charAt(l)).equals("3")) {
                            contador = contador.replace("3", "E");

                        }

                    }
                    System.out.println(contador);

                }
            }
        }
    }

}
