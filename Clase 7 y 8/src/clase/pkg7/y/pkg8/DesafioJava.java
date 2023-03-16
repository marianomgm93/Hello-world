package clase.pkg7.y.pkg8;

import java.util.Scanner;

public class DesafioJava {
    static Scanner leer=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese dos numeros para compararlos");
        int a=leer.nextInt(),b=leer.nextInt();
        comparar(a,b);
        
    }
    public static void comparar(int a,int b){
        int c=a;
        int d=b;
        do {
            c++;
            d++;
               
            if (a==b){
                System.out.println("Los numeros son iguales");
                break;
            }else if (c==b) {
                System.out.println("A es menor que B");
                break;
            }if(d==a){
                System.out.println("B es menor que A");
                break;
            }
            
            
            
            
        } while (c!=b&&d!=a);
        
    }
    
}
