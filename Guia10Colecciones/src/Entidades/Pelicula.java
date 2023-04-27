package Entidades;

import java.util.Comparator;

public class Pelicula {

    private String titulo;
    private String director;
    private int duracion;

    public static Comparator<Pelicula> compararDuracionMenorAMayor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return Integer.compare(p2.getDuracion(), p1.getDuracion());
        }
    };
    public static Comparator<Pelicula> compararDuracionMayorAMenor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return Integer.compare(p1.getDuracion(), p2.getDuracion());
        }
    };
    public static Comparator<Pelicula> compararTitulo = new Comparator<Pelicula>() {
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getTitulo().compareTo(p2.getTitulo());
        }

    };
    
    public static Comparator <Pelicula> compararDirector= new Comparator <Pelicula>(){
      public int compare(Pelicula p1, Pelicula p2){
          return p1.getDirector().compareTo(p2.getDirector());
      }  
    };
    


    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

}
