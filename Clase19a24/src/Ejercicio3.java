
import Entidades.Persona;
import Servicios.PersonaServicio;
import java.util.Scanner;

public class Ejercicio3 {

    /*    Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes 
    atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y 
    altura. Si desea añadir algún otro atributo, puede hacerlo. Agregar constructores, getters y setters.
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y 
    después se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba que 
    el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje


Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 
    Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su 
    peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos),
    significa que la persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la 
    fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para 
    cada objeto, deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su 
    peso ideal e indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays), 
    para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso
    ideal y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos 
    menores. Para esto, podemos crear unos métodos adicionales.
     */
    private static Scanner sc = new Scanner(System.in);
    private static PersonaServicio serv = new PersonaServicio();
    private static double[] imc = new double[4];
    private static boolean[] edad = new boolean[4];

    public static void main(String[] args) {
        serv.crearPersona(sc);
        calcularPorcentajes();
    }

    public static void calcularPorcentajes() {
        double menor = 0, ideal = 0, sobrepeso = 0, contador = 0;
        for (int i = 0; i < serv.getPersonas().length; i++) {
            imc[i] = serv.calcularIMC(serv.getPersonas(i));
            edad[i] = serv.esMayorDeEdad(serv.getPersonas(i));
            if (imc[i] < 0) {
                menor++;
            } else if (imc[i] == 0) {
                ideal++;
            } else {
                sobrepeso++;
            }

            if (edad[i] == true) {
                contador++;
            }

        }
        System.out.println("El porcentaje de personas por debajo del peso ideal es de " + (menor * 100 / serv.getPersonas().length));
        System.out.println("El porcentaje de personas en su peso ideal es de " + (ideal * 100 / serv.getPersonas().length));
        System.out.println("El porcentaje de personas con sobrepeso es de " + (sobrepeso * 100 / serv.getPersonas().length));
        System.out.println("El porcentaje de personas mayores " + (contador * 100 / serv.getPersonas().length));
        System.out.println("El porcentaje de personas menores " + ((serv.getPersonas().length-contador) * 100 / serv.getPersonas().length));
    }

}
