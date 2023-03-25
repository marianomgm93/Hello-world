
import ClasesExtra.Cancion;
import java.util.Scanner;

public class EjercicioExtra1 {
    public static void main(String[] args) {
     /**
      * Desarrollar una clase Cancion con los siguientes atributos: título y autor. Se deberá́ definir además 
      * dos constructores: uno vacío que inicializa el título y el autor a cadenas vacías y otro que reciba como 
      * parámetros el título y el autor de la canción. Se deberán además definir los métodos getters y setters correspondientes.
      */
     Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el nombre de la cancion");
     String nombre=leer.nextLine();
        System.out.println("ingrese el artista");
        String artista=leer.nextLine();
     Cancion tema=new Cancion(nombre, artista);
        System.out.println(tema.toString());
     
    }

}
