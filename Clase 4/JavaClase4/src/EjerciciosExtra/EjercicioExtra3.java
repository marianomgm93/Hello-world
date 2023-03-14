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
public class EjercicioExtra3 {

    /**
     Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
     Caso contrario mostrar un mensaje. 
     Nota: investigar la función equals() de la clase String.

     */
    public static void main(String[] args) {
    
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra=leer.next();
        if (letra.toLowerCase().equals("a")||letra.toLowerCase().equals("e")||letra.toLowerCase().equals("i")||letra.toLowerCase().equals("o")||letra.toLowerCase().equals("u")) {
            System.out.println("La letra ingresada es una vocal");
        }else if(letra.length()>1){
            System.out.println("Debe ingresar solamente una letra");
            
        }else{
            System.out.println("La Letra ingresada no es una vocal");
        }
                
        
        
    }
    
}
