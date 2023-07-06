package libreria.servicios;

import DAO.*;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import java.util.Scanner;

public class LibroServicio {
    private Scanner sc=new Scanner(System.in);
    private AutorServicio aServ=new AutorServicio();
    private EditorialServicio eServ=new EditorialServicio();
    private AutorDAO adao=new AutorDAO();
    private EditorialDAO edao=new EditorialDAO();
    private LibroDAO ldao=new LibroDAO();
    
    public void guardarLibro(){
        try{
        Libro libro=new Libro();
        System.out.println("Ingrese titulo del libro");
        String titulo=sc.nextLine();
        libro.setTitulo(titulo);
        System.out.println("Ingrese autor del libro");
        Autor autor =adao.buscarPorNombre(sc.nextLine());
        if (autor==null) {
            autor=aServ.guardarAutor();
        }
        libro.setAutor(autor);
        System.out.println("Ingrese el anio");
        libro.setAnio(sc.nextInt());
        System.out.println("ingrese editorial");
        Editorial editorial=edao.buscarPorNombre(sc.nextLine());
        if(editorial==null){
            editorial=eServ.guardarEditorial();
        }
        libro.setEditorial(editorial);
        System.out.println("Ingrese ejemplares");
        int ejemplares=sc.nextInt();
        libro.setEjemplares(ejemplares);
        libro.setEjemplaresRestantes(ejemplares);
        System.out.println("Ingrese ISBN");
        libro.setIsbn(sc.nextLong());
        ldao.guardar(libro);
        }catch(Exception ex){
            System.out.println("Error libro servicio");
            ex.printStackTrace();
        }
    }
}
