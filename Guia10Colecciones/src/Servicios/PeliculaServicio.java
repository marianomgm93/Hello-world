package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaServicio {

    private ArrayList<Pelicula> peliculas = new ArrayList();
    private final Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void nuevaPelicula() {
        String titulo;
        String director;
        int duracion;
        boolean flag=true;
        String opcion;
        do {
            System.out.println("Ingrese titulo");
            titulo = sc.next();
            System.out.println("Ingrese director");
            director = sc.next();
            System.out.println("Ingrese duracion");
            duracion = sc.nextInt();
            peliculas.add(new Pelicula(titulo,director,duracion));
            
            System.out.println("Desea agregar otra pelicula?s/n");
            opcion=sc.next();
            if (opcion.equalsIgnoreCase("n")) {
                flag=false;
            }
            
        } while (flag);
        System.out.println("Peliculas agregadas: ");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.getTitulo());
        }
        System.out.println("Peliculas que duran mas de una hora: ");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion()>1) {
                System.out.println(pelicula.getTitulo());
            }
        }
        System.out.println("Peliculas ordenadas por duracion (de mayor a menor): ");
        peliculas.sort(Pelicula.compararDuracionMayorAMenor);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.getTitulo()+" duracion: "+pelicula.getDuracion());
        }
        System.out.println("Peliculas ordenadas por duracion (de menor a mayor");
                peliculas.sort(Pelicula.compararDuracionMenorAMayor);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.getTitulo()+" duracion: "+pelicula.getDuracion());
        }
        System.out.println("Peliculas ordenadas por titulo");
            peliculas.sort(Pelicula.compararTitulo);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.getTitulo());
        }
        System.out.println("Peliculas ordenadas por director");
            peliculas.sort(Pelicula.compararDirector);
            for (Pelicula pelicula : peliculas) {
                System.out.println(pelicula.getTitulo()+" director: "+pelicula.getDirector());
        }
    }

}
