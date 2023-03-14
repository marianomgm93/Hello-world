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
public class EjercicioExtra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        float num, num1, resultado, usuario;
        num1=(float)Math.random()*10;
        num = (float)Math.random()*10;
        
        resultado = num * num1;
        resultado = Math.round(resultado);
        System.out.println("resultado = " + resultado);
        do {
            System.out.println("Ingrese el resultado de la multiplicacion: ");
            usuario = leer.nextInt();
            if(usuario != resultado){
                System.out.println("Resultado incorrecto.");
            }
        }while(usuario != resultado);
        System.out.println("Resultado correcto");
        
        
        
        
            
    }
    
}

