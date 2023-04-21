package Servicios;

import Entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoServicio {

    String letrasEncontradas="";
    String[] estadoPalabra;
    int cantLetrasEncontradas=0;

    /**
     * Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el valor que ingresó el usuario y encontradas en 0.
     *
     * @param sc
     * @return
     */
    public Ahorcado crearJuego(Scanner sc) {
        System.out.println("Ingrese la palabra secreta");
        String palabra = sc.next();
        System.out.println("Ingrese la cantidad de jugadas maxima");
        int cantJugadasMaximas = sc.nextInt();
        Ahorcado ahorcado = new Ahorcado();
        String[] palabraArray = new String[palabra.length()];
        this.estadoPalabra= new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            palabraArray[i] = Character.toString(palabra.charAt(i));
            this.estadoPalabra[i] = "-";
        }
        ahorcado.setPalabra(palabraArray);
        ahorcado.setCantJugadasMaximas(cantJugadasMaximas);
        
        return ahorcado;
    }

    /**
     * Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
     *
     * @param ahorcado
     * @return
     */
    public int longitud(Ahorcado ahorcado) {

        return ahorcado.getPalabra().length;
    }

    /**
     * Método buscar(letra): este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
     *
     * @param letra
     * @param ahorcado
     */
    public void buscar(String letra, Ahorcado ahorcado) {
        String[] palabra = ahorcado.getPalabra();
        boolean resultado=false;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].equalsIgnoreCase(letra)) {
                resultado=true;
            }
        }
        if (resultado) {
            System.out.println("La letra ingresada se encuentra en la palabra secreta");
            if (encontradas(letra, ahorcado)) {
                System.out.println("La letra" + letra + "ya estaba registrada");
            } else {
                System.out.println("La letra" + letra + "aun no estaba registrada");
                this.letrasEncontradas += letra;
                this.cantLetrasEncontradas += 1;
                for (int i = 0; i < ahorcado.getPalabra().length; i++) {
                    if (letra.equalsIgnoreCase(palabra[i])) {
                        this.estadoPalabra[i] = letra;
                    }
                }
            }

        } else {
            System.out.println("La letra ingresada no forma parte de la palabra secreta");
            ahorcado.setCantJugadasMaximas(ahorcado.getCantJugadasMaximas() - 1);
        }
        System.out.print("Progreso de palabra actual: ");
        mostrar();
    }

    /**
     * Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
     *
     * @param letra
     * @param ahorcado
     * @return
     */
    public boolean encontradas(String letra, Ahorcado ahorcado) {
        System.out.println("Se han encontrado " + this.letrasEncontradas.length());
        for (int i = 0; i < ahorcado.getPalabra().length; i++) {
            System.out.println(this.letrasEncontradas.charAt(i));

        }
        for (int i = 0; i < this.letrasEncontradas.length(); i++) {
            if (letra.equalsIgnoreCase("" + this.letrasEncontradas.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    /**
     * Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
     *
     * @param ahorcado
     */
    public void intentos(Ahorcado ahorcado) {
        System.out.println(ahorcado.getCantJugadasMaximas());
    }

    /**
     * Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará cuando el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.
     *
     * @param ahorcado
     * @param sc
     */
    public void juego(Scanner sc) {
        boolean funcion = true;
        System.out.println("Creando nueva partida");
        Ahorcado ahorcado = crearJuego(sc);
        do {

            System.out.println("Ahora la cantidad de intentos es de: " + ahorcado.getCantJugadasMaximas() + "\nIngrese una letra");
            String letra = sc.next();
            buscar(letra, ahorcado);
            if (ahorcado.getCantJugadasMaximas() == 0) {
                System.out.println("Te has quedado sin intentos! buena suerte la proxima vez!!");
                funcion = false;
            }
        } while (funcion);
    }

    public void mostrar() {
        for (int i = 0; i < this.estadoPalabra.length; i++) {
            System.out.print("[ " + this.estadoPalabra[i] + " ] ");
        }
    }

}
