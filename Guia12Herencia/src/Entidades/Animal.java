package Entidades;
//Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
//La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
//Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
//mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
//siguiente:
//public static void main(String[]
//                                  args)
//    //Declaración del objeto Perro
//    Animal perrol = new Perro("Stich", "Carnivoro", 15, "Doberman");
//    perrol.Alimentarse();
//    //Declaracion de otro objeto Perro
//    Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
//    perro2.Alimentarse();
//    //Declaración del objeto Gato
//    Animal gatol = nea Gato("Pelusa", "Galletas", 15, "Siamés");
//    gato1.Alimentarse();
//    //Declaración del objeto Caballo
//    Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
//    caballo.Alinentarse();
// ]
//
public class Animal {
     protected String nombre;
     protected String alimento;
     protected int edad;
     protected String raza;
    


    protected Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
        public void alimentarse(){
        System.out.println("ñam ñam");
    }
}
