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
public class JavaEjercicio8 {

    /**
     Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
     * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese las dimensiones del cuadrado");
        int dimension=leer.nextInt();
        
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                
                if (j==0) {
                    System.out.print("*");
                    
                }else if (j==dimension-1){
                    System.out.println("*");
                }else if(i==0||i==dimension-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            
        }
        
                
        
    }
    
}
