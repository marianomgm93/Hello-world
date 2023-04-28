package Servicios;

import Entidades.Pais;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PaisServicio {

    Scanner sc = new Scanner(System.in);
    HashSet<Pais> paises = new HashSet();

    public void cargarPais() {
        String pais, opcion;
        boolean flag = true;

        do {
            System.out.println("Ingrese nombre del pais");
            pais = sc.next();
            paises.add(new Pais(pais));

            System.out.println("Desea ingresar otro pais? s/n");
            opcion = sc.next();
            if (opcion.equalsIgnoreCase("n")) {
                mostrarConjuntoOrdenado();
                flag = false;
            }
        } while (flag);
    }

    public void mostrarConjuntoOrdenado() {
        ArrayList<Pais> paisesArray = new ArrayList(this.paises);
        paisesArray.sort(Pais.compararNombre);
        for (Pais pais : paisesArray) {
            System.out.println(pais.getNombre());
        }
    }

    public void eliminarPais() {
        Iterator<Pais> it = paises.iterator();
        String pais;
        boolean flag=false;
        System.out.println("Ingrese un pais para ELIMINARLO!");
        pais = sc.next();
        while (it.hasNext()) {
            if (it.next().getNombre().equalsIgnoreCase(pais)) {
                it.remove();
                System.out.println(pais + " ELIMINADO!");
                System.out.println("Ahora los paises son: ");
                mostrarConjuntoOrdenado();
                flag=true;
                break;
            }
        }
        if (!flag) {
            System.out.println("El pais elegido no forma parte de nuestros enemigos... Por ahora...");
        }

    }

}
