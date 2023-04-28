package guia10colecciones;

import Servicios.PaisServicio;

public class Ejercicio5 {
    public static void main(String[] args) {
        PaisServicio serv=new PaisServicio();
        serv.cargarPais();
        serv.eliminarPais();
    }

}
