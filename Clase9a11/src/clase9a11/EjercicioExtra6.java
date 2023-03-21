package clase9a11;

import java.util.Scanner;

public class EjercicioExtra6 {

    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        String[][] matriz = new String[20][20];
        /*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, 
a medida que el usuario las va ingresando, construya una “sopa de letras para niños” 
de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal 
en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación 
de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. 
Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), Length() y Math.random().*/
        sopaDeLetras(matriz);
        print(matriz);
    }

    public static void sopaDeLetras(String[][] matriz) {
        contornear(matriz);
        int contador = 0;
        int fila=0;
        int[] contadorFilas = new int[5];
        boolean repetido;
        do {
            System.out.println("Ingrese una palabra de entre 3 y 5 letras");
            String palabra = leer.nextLine();
            repetido=true;
            if (palabra.length() < 3 || palabra.length() > 5) {
                System.out.println("Por favor ingrese una palabra de entre 3 y 5 letras");
            } else {
                System.out.println("Buscando fila");
                
                while (repetido == true) {
                    fila = (int) (Math.random()*10);
                    

                    for (int i = 0; i < 5; i++) {
                        if (contadorFilas[i] == fila) {
                            repetido = true;
                            break;
                        } else {
                            repetido = false;
                        }

                    }
                }
                contadorFilas[contador] = fila;
                contador++;
                System.out.println("fila=" +fila);
                llenarMatriz(palabra,matriz,fila);
            }
        } while (contador < 5);

    }

    public static void llenarMatriz(String palabra, String[][] matriz, int fila) {
        int contador=0;
        int columna=(int)(Math.random()*(matriz.length-palabra.length()));
        System.out.println("columna= "+columna);
        for (int j = columna; j < (columna+palabra.length()); j++) {
            matriz[fila][j] = palabra.substring(contador,contador+1);
            contador++;
        }

    }
    public static void print(String[][] matriz) {
        System.out.println("Matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("  " + matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void contornear(String[][] matriz) {
        String num="";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]=num+(int)(Math.random()*10);
            }
        }
    }


}
