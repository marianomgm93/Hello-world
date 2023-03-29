
import ClasesExtra.Cocina;
import java.util.Scanner;

public class EjercicioExtra4 {

    /**
     * Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego, crea métodos para agregar 
     * nuevas recetas a la lista, para buscar una receta por nombre y para obtener la lista de recetas que se pueden 
     * preparar con los ingredientes disponibles en la cocina.
     *
     */
    private static Cocina cocina = new Cocina();
    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {

        String salir;
        boolean menu = true;
        do {
            System.out.println("1-Buscar receta\n2-Agregar nueva receta\n3-Ver recetas\n4-Salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    cocina.buscarReceta(leer);
                    break;
                case 2:
                    cocina.nuevaReceta(leer);
                    break;
                case 3:
                    System.out.println(cocina.getRecetas());
                    break;
                case 4:
                    System.out.println("Esta seguro de que desea salir? s/n");
                    salir = leer.next();
                    if (salir.equalsIgnoreCase("s")) {
                        System.out.println("Saliendo");
                        menu=false;
                    }
                    break;
                default:
                    System.out.println("La opcion ingresada no corresponde con el menu");
            }
        } while (menu);

    }
}
