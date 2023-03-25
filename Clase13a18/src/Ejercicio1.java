
import ClasesExtra.Libro;
import java.util.Scanner;

public class Ejercicio1 {
    private static Scanner leer=new Scanner(System.in);
    private static Libro name = new Libro();
    public static void main(String[] args) {
        /*Crear una clase llamada Libro que contenga los siguientes atributos: 
    ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos 
    pasados por parámetro y un constructor vacío. Crear un método para cargar un libro 
    pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN,
    el título, el autor del libro y el número de páginas.*/

        cargarLibro();
        verLibro();

    }

    public static void cargarLibro() {
   /*     int code;
        String tittle;
        String escritor;
        int pages;*/
        
        System.out.println("Ingrese ISBN del libro");
        name.setIsbn(leer.nextInt());
        System.out.println("Ingrese titulo");
        
        name.setTitulo(leer.next());
        
        System.out.println("Ingrese nombre del autor");
        
        name.setAutor(leer.next());
        
        System.out.println("Ingrese numero de paginas");
        name.setNumeroPaginas(leer.nextInt());
        
        
    }
    public static void verLibro() {
       // System.out.println(name.toString());
        System.out.println("El ISBN del libro es: "+name.getIsbn()+"\n El titulo del libro es: "+name.getTitulo()+"\n El autor del libro es: "+
                name.getAutor()+"\n Tiene " +name.getNumeroPaginas()+" paginas");
    }
}
