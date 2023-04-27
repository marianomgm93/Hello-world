package Servicios;

import Entidades.Estudiante;
import java.util.Arrays;
import java.util.Scanner;
    
public class EstudianteServicio {
    private Scanner sc=new Scanner(System.in);
    private Estudiante[] listaEstudiantes=new Estudiante[8];
    /**
     * Carga el array de estudiantes
     */
    public void crearEstudiantes(){
        String nombre;
        double nota;
        for (int i = 0; i < listaEstudiantes.length; i++) {
            System.out.println("Ingrese nombre del estudiante nº"+i);
            nombre=sc.next();
            System.out.println("Ingrese nota del estudiante nº"+i+" ("+nombre+")");
            nota=sc.nextDouble();
            listaEstudiantes[i]=new Estudiante(nombre,nota);
            
        }
        System.out.println("El promedio del curso es de: "+calcularPromedio());
    }
    /**
     * Calcula el promedio de las notas del estudiante
     * @return 
     */
    private double calcularPromedio(){
        double totalNotas=0;
        double promedio;
        for (int i = 0; i < listaEstudiantes.length; i++) {
            totalNotas+=listaEstudiantes[i].getNota();
        }
        promedio=totalNotas/listaEstudiantes.length;
        return promedio;
    }
    /**
     * Devuelve un arreglo de tipo String, que contiene los nombres de los estudiantes con notas por encima del promedio
     * @return 
     */
   public String notasEncimaDelPromedio(){
       int contador=0;
       int contador2=0;
       for (int i = 0; i < listaEstudiantes.length; i++) {
           if (listaEstudiantes[i].getNota()>calcularPromedio()) {
               contador++;
           }
       }
       String[] estudiantesPorEncimaDelPromedio=new String[contador];
       for (int i = 0; i < listaEstudiantes.length; i++) {
           if (listaEstudiantes[i].getNota()>calcularPromedio()) {
               estudiantesPorEncimaDelPromedio[contador2]=listaEstudiantes[i].getNombre();
               contador2++;
           }
       }
       return Arrays.toString(estudiantesPorEncimaDelPromedio);
   }
}
