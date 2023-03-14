
package EjerciciosExtra;

import java.util.Scanner;

public class EjercicioExtra13 {

    public static void main(String[] args) {
     /*Crear un programa que dibuje una escalera de números, donde cada línea de números 
        comience en uno y termine en el número de la línea. Solicitar la altura de la escalera 
        al usuario al comenzar. Ejemplo: si se ingresa el número 3:
    1
    12
    123
    */
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingresar tamanho");
        int n=leer.nextInt();
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                if (i==j) {
                    System.out.println(j);
                }
                else if(i>j){
                    System.out.print(j);
                }
            }
            
        }
     
     
    }
    
}
