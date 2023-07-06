package libreria;

import libreria.servicios.LibroServicio;
import org.eclipse.persistence.config.PersistenceUnitProperties;

public class Main {
    private static LibroServicio lserv=new LibroServicio();
    public static void main(String[] args) {
        System.setProperty(PersistenceUnitProperties.ECLIPSELINK_PERSISTENCE_XML,"main/cis-db-sync-0.0.1-SNAPSHOT.jar!/META-INF/persistence.xml");
        lserv.guardarLibro();
        
    }
}
