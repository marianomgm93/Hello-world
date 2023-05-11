package Principal;

import Entidades.Perro;
import Entidades.Persona;

public class Ejercicio1 {
//Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
//clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
//atributos: nombre, apellido, edad, documento y Perro.
//Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
//pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
//la clase Persona, la información del Perro y de la Persona.
    public static void main(String[] args) {
        Perro perro1=new Perro("cachito", "labrador", 10, "mediano");
        Perro perro2=new Perro("bandido", "bulldog", 5, "chico" );
        Persona persona1=new Persona("mariano", "gonzalez", 29, 12345678, perro1);
        Persona persona2=new Persona("barbara", "jimenez", 25, 12345687, perro2);
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
    }

}
