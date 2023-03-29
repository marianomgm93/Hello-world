
import ClasesExtra.Cuenta;
import java.util.Scanner;

public class EjercicioExtra5 {
    //Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, 
    //crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta. 
    //Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
    private static Cuenta cuenta=new Cuenta();
    private static Scanner leer=new Scanner(System.in);
    public static void main(String[] args) {
       menu();
    }
    public static void menu() {

        String salir;
        boolean menu = true;
        do {
            System.out.println("1-Realizar deposito\n2-Retirar dinero\n3-Salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    cuenta.depositar_dinero(leer);
                    break;
                case 2:
                    cuenta.retirar_dinero(leer);
                    break;
                case 3:
                    System.out.println("Esta seguro de que desea salir? s/n");
                    salir = leer.next();
                    if (salir.equalsIgnoreCase("s")) {
                        System.out.println("Saliendo");
                        menu=false;
                    }
                    break;
                default:
                    System.out.println("La opcion ingresada no corresponde con el menu");
            }
        } while (menu);

    }

}
