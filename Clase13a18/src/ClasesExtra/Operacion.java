package ClasesExtra;

import java.util.Scanner;

public class Operacion {

    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        /**
         * Cambia los valores de los numeros
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero 1");
        numero1 = leer.nextInt();
        System.out.println("Ingrese el numero 2");
        numero2 = leer.nextInt();
    }

    public int sumar() {
        /**
         * devuelve la suma de los numeros
         */
        return numero1 + numero2;
    }

    public int restar(){
        /**
         * devuelve la resta de los numeros
         */
        return numero1-numero2;
    }
    public int multiplicar(){
        return numero1*numero2;
    }
    public double dividir(){
        if (numero2==0) {
            System.out.println("ERROR: La division por 0 no esta definida");
            return 0;
        }else{
            return ((double)numero1)/((double)numero2);
        }
        
    }
}
