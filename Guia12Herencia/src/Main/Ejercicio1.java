package Main;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

public class Ejercicio1 {
    public static void main(String[] args) {

    Animal perro1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
    perro1.alimentarse();
    //Declaracion de otro objeto Perro
    Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
    perro2.alimentarse();
    //Declaración del objeto Gato
    Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
    gato1.alimentarse();
    //Declaración del objeto Caballo
    Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
    caballo1.alimentarse();
    }

}
