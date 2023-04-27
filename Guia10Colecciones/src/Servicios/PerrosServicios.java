package Servicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class PerrosServicios {

    private ArrayList<String> razas = new ArrayList();
    private Scanner sc = new Scanner(System.in);
    public void cargarRaza() {
        boolean seguir = true;
        String raza;
        String opcion;
        do {
            System.out.println("Ingrese la raza a agregar");
            raza = sc.next();
            if (razas.contains(raza)) {
                System.out.println("Esa raza ya se encuentra registrada");
            } else {
                razas.add(raza);
            }
            System.out.println("desea seguir agregando razas? s/n");
            opcion = sc.next();
            if (opcion.equalsIgnoreCase("n")) {
                System.out.println("Las razas agregadas son las siguientes");
                System.out.println(razas.toString());
                System.out.println("...Saliendo.....");
                seguir = false;
            }
        } while (seguir);
    }

    public void eliminarRaza() {
        String raza;
        Iterator<String> it=razas.iterator();
        System.out.println(razas.toString());
        System.out.println("Ingrese la raza a eliminar");
        
        raza = sc.next();
        while(it.hasNext()){
            if (it.next().equals(raza)) {
                it.remove();
                continue;
            }
        }
        Collections.sort(razas);
        System.out.println("Razas: "+razas.toString());
    }
}
