package libreria;

import libreria.servicios.LibroServicio;
import libreria.servicios.PrestamoServicio;
import org.eclipse.persistence.config.PersistenceUnitProperties;

public class Main {
   
    
    public static void main(String[] args) {
        LibroServicio lserv=new LibroServicio();
        PrestamoServicio pserv=new PrestamoServicio();
        
        pserv.crearPrestamo();
        //System.setProperty(PersistenceUnitProperties.ECLIPSELINK_PERSISTENCE_XML,"main/cis-db-sync-0.0.1-SNAPSHOT.jar!/META-INF/persistence.xml");
        //lserv.guardarLibro();
        
        //lserv.editarLibro();
        //lserv.modificarAlta();
    }
}
