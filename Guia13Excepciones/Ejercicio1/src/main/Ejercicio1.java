package main;
//Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de invocar el
//método esMayorDeEdad() a través de ese objeto. Luego, englobe el código con una cláusula

import Entidades.Persona;
import Servicio.PersonaServicio;

//try-catch para probar la nueva excepción que debe ser controlada.

public class Ejercicio1 {
    public static void main(String[] args) {
        Persona persona =new Persona("Dario", 42, "Todoslosfindes", 105, 1.81);
        PersonaServicio serv=new PersonaServicio();
        persona=null;
        try{
            System.out.println(serv.esMayorDeEdad(persona));
        }catch(NullPointerException e){
            System.out.println("Error: "+e.getMessage() );
            
            System.out.println("Error: "+e.fillInStackTrace());
        }
        
        
    }
    
}
