package Entidades;
//Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
//jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
//si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
//debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
//Métodos:
//

public class Jugador {

    private int id;
    private String nombre;
    private boolean mojado = false;

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método devuelve true, sino false.
     *
     * @param r
     * @return
     */
    public boolean disparo(RevolverDeAgua r) {
        boolean flag = false;

        System.out.println(this.nombre + " se prepara para disparar.......\n-----------------------------------\n......Apuntando a la 100.....\n-----------------------------------\n");

        if (r.mojar()) {
            this.mojado = true;
            System.out.println("EL REVOLVER HA DISPARADO\nEl jugador " + id + " debera volver empapado a su casa\n");

            flag = true;
        } else {
            System.out.println("CLACK, el revolver no ha disparado....\nEsta vez te salvaste\n");
            flag = false;
            r.siguienteChorro();
        }

        return flag;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

}
