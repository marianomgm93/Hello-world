package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    /*Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter 
    seleccionado por el usuario y mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
     */
    /**
     * Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
     *
     * @param frase
     */
    public void mostrarVocales(Cadena frase) {
        String vocales = "AEIOU";
        int cantVocales = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            for (int j = 0; j < vocales.length(); j++) {
                if (frase.getFrase().substring(i, i + 1).equalsIgnoreCase(vocales.substring(j, j + 1))) {
                    cantVocales++;
                }
            }

        }
        System.out.println("Cantidad de vocales en la frase= " + cantVocales);
    }

    /**
     * Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
     *
     * @param frase
     */
    public void invertirFrase(Cadena frase) {
        String fraseInvertida = "";
        for (int i = 0; i < frase.getFrase().length(); i++) {
            fraseInvertida += frase.getFrase().substring(frase.getFrase().length() - 1 - i, frase.getFrase().length() - i);

        }
        System.out.println(fraseInvertida);
    }

    /**
     * Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo: Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
     *
     * @param frase
     * @param sc
     */
    public void vecesRepetido(Cadena frase, Scanner sc) {
        System.out.println("Ingrese un caracter a buscar en la frase");
        String letra = sc.next();
        int contador = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (letra.equalsIgnoreCase(frase.getFrase().substring(i, i + 1))) {
                contador++;
            }
        }
        System.out.println("El caracter " + letra + " se encuentra " + contador + " veces en la frase");
    }

    /**
     * Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
     *
     * @param frase
     * @param sc
     */
    public void compararLongitud(Cadena frase, Scanner sc) {
        System.out.println("Ingrese una frase para comparar");
        String nuevaFrase = sc.nextLine();
        if (frase.getLongitud() == nuevaFrase.length()) {
            System.out.println("Las frases son igual de largas");
        } else if (frase.getLongitud() < nuevaFrase.length()) {
            System.out.println("La nueva frase es mas larga");
        } else {
            System.out.println("La frase original es mas larga que la frase nueva");
        }
    }

    /**
     * Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
     *
     * @param frase
     * @param sc
     */
    public void unirFrase(Cadena frase, Scanner sc) {
        String nuevaFrase = frase.getFrase();
        System.out.println("Ingrese una frase");
        String nuevaFrase2 = sc.next();
        nuevaFrase += nuevaFrase2;
        System.out.println("La frase quedaria como: \n" + nuevaFrase);
    }

    /**
     * Método reemplazar(String letra) deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
     *
     * @param frase
     * @param letra
     */
    public void reemplazar(Cadena frase, String letra) {
        String nuevaFrase = frase.getFrase();
        System.out.println(nuevaFrase.replace("a", letra));
    }

    /**
     * Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
     *
     * @param frase
     * @param letra
     * @return
     */
    public boolean contiene(Cadena frase, String letra) {
        return frase.getFrase().contains(letra);
    }
}
