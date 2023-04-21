package Servicios;

import Entidades.Curso;
import java.util.Scanner;

public class CursoService {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    /*



     */
    /**
     * Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases. Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el nombre de cada alumno.
     *
     * @param curso
     */
    private void cargarAlumnos(Curso curso) {
        String[] alumnos = curso.getAlumnos();
        for (int i = 0; i < curso.getAlumnos().length; i++) {
            System.out.println("Ingrese el nombre del alumno nº" + (i + 1));
            alumnos[i] = sc.nextLine();

        }
        curso.setAlumnos(alumnos);
        System.out.println("Los alumnos se cargaron correctamente");
    }

    /**
     * Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Curso. En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
     *
     * @return
     */
    public Curso crearCurso() {
        Curso curso = new Curso();
        System.out.println("Ingrese el nombre del curso");
        String nombre = sc.nextLine();
        curso.setNombreCurso(nombre);
        System.out.println("Ingrese cantidad de horas por dia");
        int cantidadHorasPorDia = sc.nextInt();
        sc.nextLine();
        curso.setCantidadHorasPorDia(cantidadHorasPorDia);
        System.out.println("Ingrese cantidad de dias por semana");
        int cantidadHorasPorSemana = sc.nextInt();
        sc.nextLine();
        curso.setCantidadDiasPorSemana(cantidadHorasPorSemana);

        System.out.println("Ingrese el turno");
        String turno = sc.next();
        curso.setTurno(turno);
        System.out.println("Ingrese el precio por hora");
        double precioPorHora = sc.nextDouble();
        sc.nextLine();
        curso.setPrecioPorHora(precioPorHora);
        System.out.println("Cargando configuracion de alumnos...");
        this.cargarAlumnos(curso);
        
        System.out.println(curso.toString());
        System.out.println("La ganancia semanal que deja este curso es de: $" + calcularGananciaSemanal(curso));

        return curso;
    }

    /**
     * Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.
     *
     * @param curso
     */
    private double calcularGananciaSemanal(Curso curso) {
        double gananciaSemanal;
        gananciaSemanal = curso.getCantidadHorasPorDia() * curso.getPrecioPorHora() * curso.getCantidadDiasPorSemana() * curso.getAlumnos().length;
        return gananciaSemanal;
    }
}
