package ClasesExtra;

import java.util.Scanner;

/**
 * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza de números. 
 * El primer jugador elige un número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un número limitado de intentos 
 * y recibe una pista de "más alto" o "más bajo" después de cada intento. El juego termina cuando el segundo jugador adivina el número
 * o se queda sin intentos. Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
 */
public class Juego {

    private int num;

    public Juego() {
    }

    public void iniciar_juego() {
        Scanner sc = new Scanner(System.in);
        boolean juego=true;
        int numJugador2;
        int intentos=5;
        String jugador1, jugador2;
        System.out.println("Bienvenido!!\nHas iniciado una nueva partida!");
        System.out.println("Ingrese el nombre del jugador 1");
        jugador1=sc.next();
        System.out.println("Ingrese el nombre del jugador 2");
        jugador2=sc.next();
        System.out.println(jugador1+" ingrese un numero");
            this.num=sc.nextInt();
            
        do {
            
            System.out.println(jugador2+" Intente adivinar el numero!\nIntentos restantes: "+intentos);
            intentos--;
            numJugador2=sc.nextInt();
            
            if (this.num>numJugador2) {
                System.out.println("Mas alto!!");
                
            }else if(this.num<numJugador2){
                System.out.println("Mas bajo!!");
                
            }else if(this.num==numJugador2){
                System.out.println("Felicitaciones "+jugador2+ " has ganado! el numero era: "+this.num);
                juego=false;
            }
            if (intentos==0) {
                System.out.println(jugador2 +" ha perdido! Felicitaciones " +jugador1+" has ganado!");
                juego=false;
            }
            
            
        } while (juego);
        

    }

}
