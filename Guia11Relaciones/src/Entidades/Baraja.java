package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Baraja {

    private ArrayList<Carta> cartas = new ArrayList();
    private ArrayList<Carta> monton = new ArrayList();

    public void armarMazo() {

        String palo = "";
        for (int j = 0; j < 4; j++) {
            for (int i = 1; i < 13; i++) {
                if (i != 8 && i != 9) {
                    switch (j) {
                        case 0:
                            palo = "oro";
                            break;
                        case 1:
                            palo = "espada";
                            break;
                        case 2:
                            palo = "basto";
                            break;
                        case 3:
                            palo = "copa";
                            break;
                    }
                    this.cartas.add(new Carta(i, palo));
                }
            }

        }

    }

    /**
     * barajar(): cambia de posición todas las cartas aleatoriamente.
     */
    public void barajar() {
        Collections.shuffle(cartas);
    }

    /**
     * siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o se haya llegado al final, se indica al usuario que no hay más cartas.
     *
     * @return
     */
    public Carta siguienteCarta() {
        Iterator<Carta> it = this.cartas.iterator();
        Carta cartaActual = null;
        if (it.hasNext()) {
            cartaActual = it.next();
            this.monton.add(cartaActual);
            it.remove();
        }
        return cartaActual;

    }

    /**
     * cartasDisponibles(): indica el número de cartas que aún se puede repartir.
     */
    public void cartasDisponibles() {
        System.out.println(this.cartas.size());
    }

    /**
     * darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero debemos indicárselo al usuario.
     */
    public void darCartas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de cartas a dar");
        int cantidad = sc.nextInt();
        Carta carta;
        Iterator<Carta> it = cartas.iterator();

        if (this.cartas.size() < cantidad) {
            System.out.println("No hay cartas suficientes, quedan: " + this.cartas.size());
        } else {
            for (int i = 0; i < cantidad; i++) {
                carta = siguienteCarta();
                System.out.println(carta.toString());
            }
        }
    }

    /**
     * cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna indicárselo al usuario
     */
    public void cartasMonton() {
        System.out.println("Las cartas descartadas son: \n" + this.monton.toString());
    }

    /**
     * mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y luego se llama al método, este no mostrara esa primera carta.
     */
    public void mostrarBaraja() {
        System.out.println("Las cartas restantes son: \n" + this.cartas.toString());
    }

}
