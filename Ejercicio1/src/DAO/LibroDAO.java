package DAO;

import libreria.entidades.Libro;
import java.util.List;

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
        super.eliminar(libro);
    }
//    public Libro buscarPorNombre(String nombre){
//        conectar();
//        Libro libro=em.find(Libro.class, nombre);
//        return libro;
//    }

    public void editar(Long id) throws Exception {
        Libro libro = buscarPorId(id);
        super.editar(libro);
    }

    public Libro buscarPorId(Long id) throws Exception {
        conectar();
        Libro libro = em.find(Libro.class, id);
        desconectar();
        return libro;
    }

    public List<Libro> buscarPorTitulo(String nombre) throws Exception{
        conectar();
        List<Libro> libros = em.createQuery("SELECT li FROM Libro li WHERE titulo= " + nombre)
                .getResultList();
        desconectar();
        return libros;
    }

    public List<Libro> buscarPorAutor(String nombre) throws Exception {
        conectar();
        List<Libro> libros = em.createQuery("SELECT li FROM Libro li WHERE autor= " + nombre)
                .getResultList();
        desconectar();
        return libros;
    }

    public List<Libro> buscarPorEditorial(String nombre) throws Exception {
        conectar();
        List<Libro> libros = em.createQuery("SELECT li FROM Libro li WHERE editorial= " + nombre)
                .getResultList();
        desconectar();
        return libros;
    }

    public List<Libro> buscarPorIsbn(Long isbn) throws Exception {
        conectar();
        List<Libro> libros = em.createQuery("SELECT li FROM Libro li WHERE isbn= " + isbn)
                .getResultList();
        desconectar();
        return libros;
    }

    public List<Libro> listarTodos() throws Exception {
        conectar();
        List<Libro> libros = em.createQuery("SELECT li FROM Libro li")
                .getResultList();
        desconectar();
        return libros;
    }

}
