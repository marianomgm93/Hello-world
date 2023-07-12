package libreria.servicios;

import DAO.*;
import java.util.List;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import java.util.Scanner;
public class LibroServicio {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private AutorServicio aServ = new AutorServicio();
    private EditorialServicio eServ = new EditorialServicio();
    private AutorDAO adao = new AutorDAO();
    private EditorialDAO edao = new EditorialDAO();
    private LibroDAO ldao = new LibroDAO();

    public void guardarLibro() {
        try {
            Libro libro = new Libro();
            System.out.println("Ingrese titulo del libro");
            String titulo = sc.next();
            if (ldao.buscarPorTitulo(titulo)!=null) {
                libro=ldao.buscarPorTitulo(titulo);
                libro.setEjemplares(libro.getEjemplares()+1);
                ldao.editar(libro);
            }else{
            libro.setTitulo(titulo);
            System.out.println("Ingrese autor del libro");
            String nombre = sc.next();
            Autor autor = adao.buscarPorNombre(nombre);
            if (autor == null) {
                autor = aServ.guardarAutor(nombre);
            }
            libro.setAutor(autor);
            System.out.println("Ingrese el anio");
            libro.setAnio(sc.nextInt());
            System.out.println("ingrese editorial");
            String editor = sc.next();
            Editorial editorial = edao.buscarPorNombre(editor);
            if (editorial == null) {
                editorial = eServ.guardarEditorial(editor);
            }
            libro.setEditorial(editorial);
            System.out.println("Ingrese ejemplares");
            int ejemplares = sc.nextInt();
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresRestantes(ejemplares);
            System.out.println("Ingrese ISBN");
            libro.setIsbn(sc.nextLong());
            ldao.guardar(libro);
            }
        } catch (Exception ex) {
            System.out.println("Error libro servicio");
            ex.printStackTrace();
        }
    }

    public void editarLibro(){
        try {
            
            Libro libro = buscarLibro();
            System.out.println("Ingrese titulo del libro");
            String titulo = sc.next();
            libro.setTitulo(titulo);
            System.out.println("Ingrese autor del libro");
            String nombre = sc.next();
            Autor autor = adao.buscarPorNombre(nombre);
            if (autor == null) {
                autor = aServ.guardarAutor(nombre);
            }
            libro.setAutor(autor);
            System.out.println("Ingrese el anio");
            libro.setAnio(sc.nextInt());
            System.out.println("ingrese editorial");
            String editor = sc.next();
            Editorial editorial = edao.buscarPorNombre(editor);
            if (editorial == null) {
                editorial = eServ.guardarEditorial(editor);
            }
            libro.setEditorial(editorial);
            System.out.println("Ingrese ejemplares");
            int ejemplares = sc.nextInt();
            if(ejemplares<0){
                ejemplares=0;
                throw new Exception("No puede haber ejemplares negativos!!");
            }
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresRestantes(ejemplares);
            ldao.editar(libro);
            
        } catch (Exception ex) {
            System.out.println("Error libro servicio");
            ex.printStackTrace();
        }

    }

    public Libro buscarLibro() throws Exception {
        System.out.println("Ingrese ISBN del libro");
        Long isbn = sc.nextLong();
        return ldao.buscarPorId(isbn);

    }
    public void modificarAlta(){
        try {
            Libro libro=buscarLibro();
            if(libro.isAlta()){
                libro.setAlta(false);
                
            }else{
                libro.setAlta(true);
            }
            ldao.editar(libro);
            System.out.println("Ahora el alta del libro: "+libro.getTitulo()+" es ="+libro.isAlta());
        } catch (Exception ex) {
            System.out.println("Modificar alta error");
            ex.printStackTrace();
        }
    }
    public void verLibros() throws Exception{
        System.out.println("Mostrando todos los libros en posesion:");
        List<Libro> libros=ldao.listarTodos();
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

}
