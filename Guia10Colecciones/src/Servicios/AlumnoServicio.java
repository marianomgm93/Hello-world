package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoServicio {

    private ArrayList<Alumno> alumnos = new ArrayList();
    private final Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void crearAlumnos() {
        boolean flag = true;
        String nombre;

        String opcion;
        int nota;
        do {
            ArrayList<Integer> notas = new ArrayList();
            System.out.println("Ingrese nombre del alumno");
            nombre = sc.next();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota nº" + (i + 1));
                nota = sc.nextInt();
                notas.add(nota);
            }
            alumnos.add(new Alumno(nombre, notas));
            System.out.println("Ahora los alumnos son: ");
            for (Alumno alumno : alumnos) {
                System.out.println(alumno.getNombre());
            }
            System.out.println("Desea agregar otro alumno? s/n");
            opcion = sc.next();

            if (opcion.equalsIgnoreCase("n")) {
                System.out.println("...Saliendo..");
                flag = false;
            }

        } while (flag);
    }

    private double calcularNotaFinal(Alumno alumno) {
        double notaFinal = 0;
        for (Integer nota : alumno.getNotas()) {
            notaFinal += nota;
        }
        notaFinal /= 3;
        return notaFinal;
    }

    public void notaFinal() {
        String nombre;

        Iterator<Alumno> it = alumnos.iterator();
        System.out.println("Ingrese nombre del alumno para ver su nota final");
        nombre = sc.next();
        while (it.hasNext()) {
            Alumno alumno = it.next();
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                
                System.out.println("La nota final del alumno " + alumno.getNombre() + " es: " + calcularNotaFinal(alumno));
                break;
            }

        }

    }
}
