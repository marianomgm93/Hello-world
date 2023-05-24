package Entidades;
//Persona con atributos: nombre, apellido, edad, documento y Perro.

import java.util.ArrayList;

public class Persona1 {
    private String nombre;
    private ArrayList<Perro1> perros=new ArrayList();

    public Persona1() {
    }

    public Persona1(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Perro1> getPerros() {
        return perros;
    }
 
    public void setPerros(Perro1 perros) {
        this.perros.add(perros);
    }

    @Override
    public String toString() {
        return "Persona1{" + "nombre=" + nombre + ", perros=" + perros+ '}';
    }




 
    
}
