package libreria.servicios;

import DAO.LibroDAO;
import DAO.PrestamoDAO;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;
import libreria.entidades.Cliente;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;

public class PrestamoServicio {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private ClienteServicio cserv = new ClienteServicio();
    private LibroServicio lserv = new LibroServicio();
    private PrestamoDAO pdao=new PrestamoDAO();
    private LibroDAO ldao=new LibroDAO();

    public void crearPrestamo() {
        try {
            Prestamo prestamo = new Prestamo();
            Cliente cliente;
            do {
                System.out.println("Ingrese DNI del cliente");
                Long dni=sc.nextLong();
                cliente = cserv.buscarPorDNI(dni);
                if (cliente == null) {
                    System.out.println("El cliente aun no existe en la base de datos\n....Creando nuevo cliente....");
                    cserv.crearCliente(dni);
                }
            } while (cliente == null);
            prestamo.setCliente(cliente);

            boolean flag = true;
            Libro libro;
            do {
                libro = lserv.buscarLibro();

                if (libro == null||libro.getEjemplaresRestantes()<1) {
                    
                    System.out.println("El libro solicitado no existe o no esta en stock");
                    System.out.println("Desea ingresar otro libro? s/n");
                    String opt = sc.next();
                    if (!opt.equalsIgnoreCase("S")) {
                        throw new Exception("No se pudo alquilar ningun libro");
                    } else {
                        lserv.verLibros();
                    }
                } else {
                    ldao.prestarLibro(libro.getIsbn());
                    flag = false;
                }
            } while (flag);
            prestamo.setLibro(libro);
            LocalDate fechaDePrestamo = LocalDate.now();
            prestamo.setFechaDePrestamo(Date.valueOf(fechaDePrestamo));
            prestamo.setFechaDeDevolucion(Date.valueOf(fechaDePrestamo.plusDays(15)));
            pdao.guardar(prestamo);
            
        } catch (Exception ex) {
            System.out.println("CREAR PRESTAMO SERVICIO ERROR");
            ex.printStackTrace();
        }
    }
    
    public void finalizarPrestamo(){
        
    }
}
