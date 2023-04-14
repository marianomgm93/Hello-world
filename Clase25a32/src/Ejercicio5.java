
import Entidades.Persona;
import Servicios.PersonaService;
import java.util.Scanner;

public class Ejercicio5 {
    /*
    Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre 
    y una fecha de nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. 
    Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. 
    Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es 
    menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.
    */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PersonaService serv=new PersonaService();
        Persona juan=serv.crearPersona(sc);
        System.out.println("La edad de "+juan.getNombre()+" es "+serv.calcularEdad(juan.getFechaNacimiento(), serv.fechaActual()));
        System.out.println("La persona es menor de edad? "+serv.menorQue(juan, 18));
        serv.mostrarPersona(juan);
    }

}
