
import Entidades.Cafetera;
import Servicios.CafeteraServicio;
import java.util.Scanner;


public class Ejercicio2 {
    private static Scanner sc=new Scanner(System.in);
    private static Cafetera cafe=new Cafetera();
    private static CafeteraServicio serv=new CafeteraServicio();
    public static void main(String[] args) {
        /*Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos capacidadMáxima 
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera). 
Agregar constructor vacío y con parámetros así como setters y getters. Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la acción de servir la taza 
con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El método le informará 
al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
         */
        menu();
        
    }
    
    public static void menu() {
        boolean salir=false;
        do {
            System.out.println("Ingrese la opcion\n1-llenar cafetera\n2-servir taza\n3-vaciar cafetera\n4-agregar cafe\n5-Salir");
            int opcion=sc.nextInt();
            switch (opcion) {
                case 1:
                    serv.llenarCafetera(cafe);
                    break;
                case 2:
                    serv.servirTaza(sc, cafe);
                    break;
                case 3:
                    serv.vaciarCafetera(cafe);
                    break;
                case 4:
                    serv.agregarCafe(sc, cafe);
                    break;
                default:
                    salir=true;
            }
        } while (!salir);
        
    }
    
}
