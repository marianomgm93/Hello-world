package Entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
//Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
//Revolver
//Métodos:
//• 
//
//10
//• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.

public class Juego {

    ArrayList<Jugador> jugadores;
    RevolverDeAgua revolver;

    /**
     * llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores y el revolver para guardarlos en los atributos del juego.
     *
     * @param jugadores
     * @param r
     */
    private void llenarJuego(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
        this.revolver = new RevolverDeAgua();
        System.out.println(revolver);
    }

    private boolean ronda(int numeroRonda) {
        Iterator<Jugador> it = jugadores.iterator();
        System.out.println("\n-------- RONDA "+numeroRonda+ " --------\n");
        
        while (it.hasNext()) {
            Jugador next = it.next();
            next.disparo(revolver);
            if (next.isMojado()) {
                System.out.println("El jugador " + next.getNombre() + " esta mojado!");
                return true;
            }
        }
        return false;
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        boolean fin=false;
        ArrayList<Jugador> jugadores=new ArrayList();
        int id = 1;
        int rondas=0;
        do {
            System.out.println("Ingrese nombre del jugador " + id);
            String nombre = sc.next();
            jugadores.add(new Jugador(id, nombre));
            id++;
            System.out.println("Desea agregar otro jugador?s/n");
            String option = sc.next();
            if (option.equalsIgnoreCase("n")) {
                break;
            }
        } while (id < 7);
        llenarJuego(jugadores);
        do {
            fin=ronda(rondas);
            rondas++;
        } while (!fin);
        
    }
}
