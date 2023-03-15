
package clase.pkg7.y.pkg8;


import java.util.Scanner;

public class Ejercicio1 {
    static Scanner leer= new Scanner(System.in);
    public static void main(String[] args) {
        
        /*Crea una aplicación que le pida dos números al usuario y 
        este pueda elegir entre sumar, restar, multiplicar y dividir. 
        La aplicación debe tener una función para cada operación matemática 
        y deben devolver sus resultados para imprimirlos en el main. 
        */
        
        calculadora();
        
        
        
        
        
    }
    public static void calculadora(){
        System.out.println("Ingrese dos numeros");
        int num1=leer.nextInt(),num2=leer.nextInt();
        
        boolean menu=true;
        do {
            System.out.println("INGRESE UNA DE LAS OPCIONES \n1_SUMAR \n 2_RESTAR \n 3_MULTIPLICAR \n 4_DIVIDIR \n 5_SALIR");
             switch (leer.nextInt()) {
            case 1:
                System.out.println("La suma de los numeros es: " + (num1+num2));
                break;
            case 2:
                System.out.println("La resta de los numeros es: " + (num1-num2));
                break;
            case 3:
                System.out.println("El producto de los numeros es: " +(num1*num2));
                break;
            case 4:
                System.out.println("El cociente de los numeros es: "+ ((float)num1/(float)num2));
                break;
            case 5:
                System.out.println("Saliendo");
                menu=false;
                break;
            default:
                System.out.println("Por favor ingrese un numero del 1 al 5");
        }
        } while (menu);
        
      
        
        
    }
}
