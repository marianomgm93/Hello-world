package DAO;

import libreria.entidades.Libro;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LibroDAO extends DAO<Libro> {
// Esta clase hereda de la clase padre DAO y vemos que
// se especifica la generalización (<T>) como Direccion
// esto permite que los métodos heredados donde se solicita
// una parámetro T, en esta clase serán de tipo Dirección

    @Override
    public void guardar(Libro libro) {
        super.guardar(libro);
    }

    public void eliminar(Long id) throws Exception {
        Libro libro = buscarPorId(id);
        libro.setAlta(false);
        super.eliminar(libro);
    }
//    public Libro buscarPorNombre(String nombre){
//        conectar();
//        Libro libro=em.find(Libro.class, nombre);
//        return libro;
//    }

    @Override
    public void editar(Libro libro) {
        super.editar(libro);
    }

    public Libro buscarPorId(Long id) throws Exception {
        conectar();
        Libro libro = em.find(Libro.class, id);
        desconectar();
        return libro;
    }

    public Libro buscarPorTitulo(String nombre) throws Exception {
        conectar();
        try {

            List<Libro> libros = em.createQuery("SELECT li FROM Libro li WHERE li.titulo= '" + nombre+"'").getResultList();
            if (!libros.isEmpty()) {
                Libro libro = libros.get(0);
                return libro;
            } else {
                System.out.println("No hay ningun libro con el nombre: " + nombre);
                return null;
            }
        } catch (Exception ex) {
            System.out.println("Buscar por nombre error");
            ex.printStackTrace();
            return null;
        } finally {
            desconectar();
        }
    }

    public List<Libro> buscarPorAutor(String nombre) throws Exception {
        try{
            conectar();
        List<Libro> libros = em.createQuery("SELECT li FROM Libro li WHERE li.autor= '" + nombre+"'")
                .getResultList();
        if(!libros.isEmpty()){
            return libros;
        }else{
            System.out.println("No se encontraron libros de esa editorial");
            return null;
        }
        }catch(Exception ex){
            System.out.println("BUSCAR POR EDITORIAL ERROR");
            ex.printStackTrace();
            return null;
        }finally{
            desconectar();
        }
    }

    public List<Libro> buscarPorEditorial(String nombre) throws Exception {
        try{
             conectar();
        List<Libro> libros = em.createQuery("SELECT li FROM Libro li WHERE li.editorial= '" + nombre+"'")
                .getResultList();
        if(!libros.isEmpty()){
            return libros;
        }else{
            System.out.println("No se encontraron libros de esa editorial");
            return null;
        }
        }catch(Exception ex){
            System.out.println("BUSCAR POR EDITORIAL ERROR");
            ex.printStackTrace();
            return null;
        }finally{
            desconectar();
        }
    }

    public Libro buscarPorIsbn(Long isbn) throws Exception {
        try {
            conectar();
            List<Libro> libros = em.createQuery("SELECT li FROM Libro li WHERE li.isbn= " + isbn)
                    .getResultList();
            if (!libros.isEmpty()) {
                Libro libro = libros.get(0);
                return libro;
            } else {
                System.out.println("No hay ningun libro con el codigo: " + isbn);
                return null;
            }

        } catch (Exception ex) {
            System.out.println("Buscar libro por ISBN ERROR");
            ex.printStackTrace();
            return null;
        } finally {
            desconectar();
        }

    }

    public List<Libro> listarTodos() throws Exception {
        conectar();
        List<Libro> libros = em.createQuery("SELECT li FROM Libro li")
                .getResultList();
        desconectar();
        return libros;
    }
    
    public void prestarLibro(Long id){
        try {
            Libro libro = buscarPorIsbn(id);

        if (libro.getEjemplaresRestantes()>0) {
            libro.setEjemplaresPrestados(libro.getEjemplaresPrestados()+1);
            libro.setEjemplaresRestantes(libro.getEjemplaresRestantes()-1);
            editar(libro);
        }else{
            System.out.println("SIN STOCK");
        }
        } catch (Exception ex) {
            System.out.println("PRESTAR LIBRO ERROR");
            ex.printStackTrace();
        }
        
    }
}
