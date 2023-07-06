package libreria.servicios;

import DAO.AutorDAO;
import libreria.entidades.Autor;
import java.util.Scanner;

public class AutorServicio {

    private AutorDAO adao = new AutorDAO();
    private Scanner sc = new Scanner(System.in);
    
    public Autor guardarAutor(){
        System.out.println("Ingrese nombre del autor");
        String nombre=sc.next();
        Autor autor=new Autor(nombre);
        adao.guardar(autor);
        return autor;
    }
    public void editarAutor(){
        try {
            System.out.println("Ingrese nombre de autor");
            String nombre=sc.nextLine();
            Autor autor=adao.buscarPorNombre(nombre);
            System.out.println("Ingrese nuevo nombre del autor= "+autor);
            nombre=sc.nextLine();
            autor.setNombre(nombre);
            adao.editar(autor.getId());
        } catch (Exception ex) {
            System.out.println("No se pudo editar el autor");
        }
    }
    

    public void consultarAutor() throws Exception {
        System.out.println("Ingrese el id del autor");
        Long id = sc.nextLong();
        try {
            if (id == null) {
                throw new Exception("Debe ingresar un valor!");
            }
            Autor autor = adao.buscarPorId(id);
            System.out.println(autor);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("No se encontro el autor");
        }
    }

    public void consultarAutorPorNombre() {
        System.out.println("Ingrese el nombre del autor");
        String nombre = sc.next();
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe ingresar un valor!");
            }
            System.out.println(adao.buscarPorNombre(nombre)); 

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("No se encontro el autor, ni bosta---Dario \"The Dark Knight\"");
        }
    }
    
    

}
