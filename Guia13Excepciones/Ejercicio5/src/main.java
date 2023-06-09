
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Random rd = new Random();
        Scanner xd = new Scanner(System.in);
        int a = rd.nextInt(500);
        int b = 0;
        int contador = 0;

        do {

            System.out.println("Ingrese un numero entre 1 y 500: ");
            try {
                b = xd.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Numero ingresa, no letras jaja");
                xd.nextLine(); // Descartar entrada incorrecta
                continue; // Volver al inicio del bucle
            }
                if (a == b) {
                    System.out.println("Acerto");
                    contador++;
                } else if (a > b) {
                    contador++;
                    System.out.println("El numero es mas grande");
                } else {
                    System.out.println("El numero es mas chico");
                    contador++;
                }


        } while (a != b);

        System.out.println("La cantidad de intentos son: " + contador);

    }

}
