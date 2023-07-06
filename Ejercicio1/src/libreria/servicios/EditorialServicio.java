package libreria.servicios;

import DAO.EditorialDAO;
import libreria.entidades.Editorial;
import java.util.Scanner;

public class EditorialServicio {
    private Scanner sc=new Scanner(System.in);
    private EditorialDAO edao=new EditorialDAO();
    
    
 public Editorial guardarEditorial(){
        System.out.println("Ingrese nombre del editorial");
        String nombre=sc.next();
        Editorial editorial=new Editorial(nombre);
        edao.guardar(editorial);
        return editorial;
    }
    public void editarEditorial(){
        try {
            System.out.println("Ingrese nombre de editorial");
            String nombre=sc.nextLine();
            Editorial editorial=edao.buscarPorNombre(nombre);
            System.out.println("Ingrese nuevo nombre del editorial= "+editorial);
            nombre=sc.nextLine();
            editorial.setNombre(nombre);
            edao.editar(editorial.getId());
        } catch (Exception ex) {
            System.out.println("No se pudo editar el editorial");
            ex.printStackTrace();
        }
    }
    

    public void consultarEditorial() throws Exception {
        System.out.println("Ingrese el id del editorial");
        Long id = sc.nextLong();
        try {
            if (id == null) {
                throw new Exception("Debe ingresar un valor!");
            }
            Editorial editorial = edao.buscarPorId(id);
            System.out.println(editorial);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("No se encontro el editorial");
        }
    }

    public void consultarEditorialPorNombre() {
        System.out.println("Ingrese el nombre del editorial");
        String nombre = sc.next();
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe ingresar un valor!");
            }
            System.out.println(edao.buscarPorNombre(nombre)); 

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("No se encontro el editorial, ni bosta---Dario \"The Dark Knight\"");
        }
    }
    
}
