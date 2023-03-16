package clase.pkg7.y.pkg8;

import java.util.Scanner;

public class DesafioJava2 {
    static Scanner leer=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("ingrese valor de A");
        int a=leer.nextInt();
        System.out.println("Ingrese valor de B");
        int b=leer.nextInt();
        b=b*a;
        a=b/a;
        b=b/a;
        System.out.println("a= " +a+ "\nb= " +b);
            

        

    }

}
