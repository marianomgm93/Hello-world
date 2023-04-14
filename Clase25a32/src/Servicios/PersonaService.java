package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {
/*


Método mostrarPersona que muestra la información de la persona deseada.*/
    /**
     * Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. 
    Retornar el objeto Persona creado.
     * @param sc
     * @return 
     */
    public Persona crearPersona(Scanner sc){
        System.out.println("Ingrese el nombre de la persona");  
        String nombre=sc.next();
        Date nacimiento=fechaNacimiento(sc);
        return new Persona(nombre,nacimiento);
    }
    public Date fechaNacimiento(Scanner sc) {
        int aa, mm, dd;
        System.out.println("Ingrese anio de nacimiento (aaaa)");
        aa = sc.nextInt();
        System.out.println("ingrese mes de nacimiento (mm)");
        mm = sc.nextInt();
        System.out.println("ingrese dia de nacimiento (dd)");
        dd = sc.nextInt();
        return new Date(aa-1900, mm-1, dd); //Utilizar -1900 para fechas en 4 digitos
    }
    public Date fechaActual() {
        Date fechaActual = new Date();
        return fechaActual;
    }
/**
 * Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
 * @param fechaNacimiento
 * @param fechaActual
 * @return 
 */
    public int calcularEdad(Date fechaNacimiento,Date fechaActual) {
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();
        if (fechaActual.getMonth()<fechaNacimiento.getMonth()) {
            edad--;
        }else if(fechaActual.getMonth()==fechaNacimiento.getMonth() && fechaActual.getDay()<fechaNacimiento.getDay()){
            edad--;
        }
        return edad;
    }
    /**
     * Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es 
    menor que la edad consultada o false en caso contrario.
     * @param persona
     * @param edad
     * @return 
     */
    public boolean menorQue(Persona persona,int edad){
        
        return calcularEdad(persona.getFechaNacimiento(),fechaActual())<edad;
    }
    public void mostrarPersona(Persona persona){
        System.out.println("Nombre de la persona: "+persona.getNombre()+"\nFecha de nacimiento: "+persona.getFechaNacimiento().getDay()+"/"+persona.getFechaNacimiento().getMonth()+"/"+persona.getFechaNacimiento().getYear());
        ;
    }
}
