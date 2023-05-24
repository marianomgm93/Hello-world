package Servicios;

import Entidades.Perro1;
import Entidades.Persona1;

public class Persona1Servicios {

    public void adoptar(Persona1 persona, Perro1 perro){
        if (perro.getDuegno()==null) {
            persona.setPerros(perro);
            perro.setDuegno(persona);
        }else{
            System.out.println("El perro "+perro.getNombre()+" ya tiene dueño");
        }
    }
    public void mostrarDatos(Persona1 persona){
        System.out.println("Nombre: "+persona.getNombre()+"\n"+persona.getPerros().toString());
    }
}
