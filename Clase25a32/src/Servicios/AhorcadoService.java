package Servicios;

import Entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoService {

    private static char[] estadoPalabra;

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    /**
     * Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en un índice del vector. Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
     *
     * @return
     */
    private Ahorcado crearJuego() {
        System.out.println("Ingrese la palabra secreta");
        String palabra = sc.next();
        estadoPalabra = new char[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            estadoPalabra[i] = '-';
        }
        return new Ahorcado(palabra);
    }

    /**
     * Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
     *
     * @param ahorcado
     */
    private void longitud(Ahorcado ahorcado) {
        System.out.println("La longitud de la palabra es: " + ahorcado.getPalabra().length);
    }

    /**
     * Método buscar(letra): este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la palabra o no.También informará si la letra estaba o no.
     *
     * @param letra
     * @param ahorcado
     * @return
     */
    private boolean buscar(char letra, Ahorcado ahorcado) {
        int contador = 0;
        for (int i = 0; i < ahorcado.getPalabra().length; i++) {
            if (letra == ahorcado.getPalabra()[i]) {

                estadoPalabra[i] = letra;
                contador++;
            }
        }
        if (contador > 0) {
            System.out.println("Letra encontrada");
            ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas() + contador);
            return true;
        }
        System.out.println("Letra no encontrada");
        return false;
    }

/**
 *     Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han sido encontradas 
    y cuántas le faltan. Este método además deberá devolver true si la letra estaba y false si la letra no estaba, ya que, cada 
    vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
 * @param letra
 * @param ahorcado
 * @return 
 */
    private boolean encontradas(char letra, Ahorcado ahorcado) {
        if (!buscar(letra, ahorcado)) {
            ahorcado.setCantidadJugadasMaxima(ahorcado.getCantidadJugadasMaxima() - 1);
            System.out.println("La letra no se encuentra en la palabra secreta");
            intentos(ahorcado);
            return false;
        }
        System.out.println("Letras encontradas: " + ahorcado.getLetrasEncontradas());
        System.out.println("Letras restantes: " + (ahorcado.getPalabra().length - ahorcado.getLetrasEncontradas()));
        System.out.println(Arrays.toString(estadoPalabra));
        return true;
    }
    /**
     * Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
     * @param ahorcado 
     */
    private void intentos(Ahorcado ahorcado){
        System.out.println("Cantidad de intentos restantes= "+ahorcado.getCantidadJugadasMaxima());
    }

    /**
     *     Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará cuando
    el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.
     */
    public void juego(){
        Ahorcado ahorcado=crearJuego();
        do {
            System.out.println("Ingrese una letra");
          char  letra=sc.next().charAt(0);
            encontradas(letra,ahorcado);
            if (ahorcado.getCantidadJugadasMaxima()==0 || ahorcado.getLetrasEncontradas()==estadoPalabra.length) {
                break;
            }
        } while (true);
        if (ahorcado.getLetrasEncontradas()==estadoPalabra.length) {
            System.out.println("Felicidades has adivinado la palabra!!");
        }else{
            System.out.println("Has perdido, intentalo nuevamente!!");
        }
        
    }
}
