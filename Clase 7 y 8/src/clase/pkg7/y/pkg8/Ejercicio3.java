package clase.pkg7.y.pkg8;

import java.util.Scanner;

public class Ejercicio3 {
    static Scanner leer=new Scanner(System.in);
    public static void main(String[] args) {
        /*Crea una aplicación que a través de una función nos convierta 
        una cantidad de euros introducida por teclado a otra moneda, estas 
        pueden ser a dólares, yenes o libras. La función tendrá como parámetros, 
        la cantidad de euros y la moneda a convertir que será una cadena, este no 
        devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
        El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €
         */
        System.out.println("Ingrese la cantidad y el tipo de moneda a cambiar");
        cambio(leer.nextDouble(),leer.next());
        
        
    }
    public static void cambio(double cantidad, String moneda){
        if (moneda.equalsIgnoreCase("Libras")) {
            System.out.println("Son "+(cantidad*0.86)+" Libras");
        }else if(moneda.equalsIgnoreCase("Dolares")){
            System.out.println("Son "+(cantidad*1.28611)+" Dolares");
        }else if(moneda.equalsIgnoreCase("Yenes")){
            System.out.println("Son "+(cantidad*129.852)+" Yenes");
        }else{
            System.out.println("La opcion ingresada es incorrecta");
        }
    }
}
