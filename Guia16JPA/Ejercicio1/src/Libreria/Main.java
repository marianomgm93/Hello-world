package libreria;

import java.util.Scanner;
import libreria.servicios.AutorServicio;
import libreria.servicios.ClienteServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;
import libreria.servicios.PrestamoServicio;
import org.eclipse.persistence.config.PersistenceUnitProperties;

public class Main {
   
    
    public static void main(String[] args) throws Exception {
        //LibroServicio ls=new LibroServicio();
        //PrestamoServicio pserv=new PrestamoServicio();
         Scanner leer = new Scanner(System.in).useDelimiter("\n");

        AutorServicio as = new AutorServicio();
        EditorialServicio es = new EditorialServicio();
        LibroServicio ls = new LibroServicio();
        ClienteServicio cs = new ClienteServicio();
        PrestamoServicio ps = new PrestamoServicio();

        boolean menu = true;
        do {

            System.out.println("1.  Agregar autor, editorial, libro o cliente.");
            System.out.println("2.  Editar autor, editorial, libro o cliente.");
            System.out.println("3.  Buscar Autor por nombre");
            System.out.println("4.  Buscar libro");
            System.out.println("5.  Registrar préstamo de libro");
            System.out.println("6.  Cargar devolución de libro");
            System.out.println("7. Buscar préstamos por cliente");
            System.out.println("8. Salir");

            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("1. Autor");
                    System.out.println("2. Editorial");
                    System.out.println("3. Libro");
                    System.out.println("4. Cliente");
                    opcion = leer.nextInt();
                    switch (opcion) {
                        case 1:
                            as.guardarAutor();
                            break;
                        case 2:
                            es.guardarEditorial();
                            break;
                        case 3:
                            ls.guardarLibro();
                            break;
                        case 4:
                            cs.crearCliente();
                            break;
                        default:
                            System.out.println("Opción no reconocida.");
                    }
                    break;
                case 2:
                    System.out.println("1. Autor");
                    System.out.println("2. Editorial");
                    System.out.println("3. Libro");
                    System.out.println("4. Cliente");
                    opcion = leer.nextInt();

                    switch (opcion) {
                        case 1:
                            as.editarAutor();
                            break;
                        case 2:
                            es.editarEditorial();
                            break;
                        case 3:
                            ls.editarLibro();
                            break;
                        case 4:
                            cs.editar();
                            break;
                        default:
                            System.out.println("Opción no reconocida.");
                    }
                    break;
                case 3:
                    as.consultarAutorPorNombre();
                    break;
                case 4:
                    ls.buscarLibroMenu();
                    break;
                case 5:
                    ps.crearPrestamo();
                    break;
                    
                case 6:
                    ps.finalizarPrestamo();
                    break;
                case 7:
                    cs.buscarPorDNI();
                    break;
                case 8:
                    menu = false;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Ingrese una opción válida");
            }
        } while (menu);

    }
       // pserv.crearPrestamo();
        //System.setProperty(PersistenceUnitProperties.ECLIPSELINK_PERSISTENCE_XML,"main/cis-db-sync-0.0.1-SNAPSHOT.jar!/META-INF/persistence.xml");
        //lserv.guardarLibro();
        
        //lserv.editarLibro();
        //lserv.modificarAlta();
    
}
