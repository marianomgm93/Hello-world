package Principal;
//Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
//tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a

import Entidades.Perro1;
import Entidades.Persona1;
import Servicios.Persona1Servicios;

//cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
//al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
//persona.
//Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
//personas con sus respectivos perros.
public class EjercicioExtra1 {

    public static void main(String[] args) {
        Persona1Servicios serv= new Persona1Servicios();
        Perro1 perro1=new Perro1("cachito");
        Perro1 perro2=new Perro1("bandido");
        Perro1 perro3=new Perro1("boby");
        Persona1 persona1=new Persona1("mariano");
        Persona1 persona2=new Persona1("barbara");
        serv.adoptar(persona2, perro2);
        serv.adoptar(persona1, perro2);
        serv.adoptar(persona1,perro1);
        serv.adoptar(persona2, perro3);
        serv.mostrarDatos(persona2);
        serv.mostrarDatos(persona1);
    }
    
}
