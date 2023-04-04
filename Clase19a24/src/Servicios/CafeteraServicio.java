package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    public void llenarCafetera(Cafetera cafe){
        cafe.setCantidadActual(cafe.getCapacidadMaxima());
        System.out.println("Ahora la cafetera contiene "+cafe.getCantidadActual()+"ml de cafe");
    }
    public void servirTaza(Scanner sc, Cafetera cafe){
        int taza;
        System.out.println("Ingrese la capacidad de la taza a llenar");
        taza=sc.nextInt();
        if (taza>cafe.getCantidadActual()) {
            System.out.println("La taza no se llenó, ahora contiene: "+cafe.getCantidadActual()+" de cafe");
            cafe.setCantidadActual(0);
        }else{
            System.out.println("La taza se lleno exitosamente, disfrute de su cafe");
            cafe.setCantidadActual(cafe.getCantidadActual()-taza);
        }
                
    }
    public void vaciarCafetera(Cafetera cafe){
        cafe.setCantidadActual(0);
        System.out.println("La cafetera ahora se encuentra vacia");
    }
    public void agregarCafe(Scanner sc,Cafetera cafe){
        int agregar;
        System.out.println("Ingrese la cantidad de cafe que desea agregar a la cafetera");
        agregar=sc.nextInt();
        cafe.setCantidadActual(cafe.getCantidadActual()+agregar);
    }
}
