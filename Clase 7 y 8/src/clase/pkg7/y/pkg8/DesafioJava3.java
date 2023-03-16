package clase.pkg7.y.pkg8;

import java.util.Scanner;

public class DesafioJava3 {
    private static Scanner leer=new Scanner(System.in);
    
    public static void main(String[] args) {
    /*Implementar una función que permita obtener un número entero aleatorio 
    comprendido entre dos límites que introduciremos por teclado. El número 
    obtenido se debe mostrar por pantalla.*/
    
    
    
    leer.close();
    }
    
    public static int aleatorioEnIntervalo(int a,int b){
        int resultado;
        
        resultado=(int)Math.random()*10;
        
        
        
        return resultado;
    }

}
