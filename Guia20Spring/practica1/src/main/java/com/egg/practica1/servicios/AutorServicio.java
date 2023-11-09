package com.egg.practica1.servicios;

import com.egg.practica1.entidades.Autor;
import com.egg.practica1.excepciones.MiException;
import com.egg.practica1.repositorios.AutorRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServicio {

    
    @Autowired
    AutorRepositorio autorRepositorio;

    @Transactional
    public void crearAutor(String nombre) throws MiException {
        validar(nombre);
        Autor autor = new Autor();
        autor.setNombre(nombre);

        autorRepositorio.save(autor);
    }

    /**
     * Devuelve lista de autores
     *
     * @return
     */
    public List<Autor> listarAutores() {
        List<Autor> autores = new ArrayList();
        autores = autorRepositorio.findAll();
        return autores;
    }

    /**
     * Modificar nombre de autor
     *
     * @param nombre
     * @param id
     */
    public void modificarAutor(String nombre, String id) throws MiException {
        validar(id, nombre);

        Optional<Autor> respuestaAutor = autorRepositorio.findById(id);

        if (respuestaAutor.isPresent()) {
            Autor autor = respuestaAutor.get();

            autor.setNombre(nombre);

            autorRepositorio.save(autor);
        }
    }

    /**
     *
     * @param id
     * @param nombre
     * @throws MiException
     */
    private void validar(String id, String nombre) throws MiException {

        if (id.isEmpty()) {
            throw new MiException("El id del autor no puede ser nulo o estar vacio");
        }
        if (nombre.isEmpty()) {
            throw new MiException("El id del autor no puede ser nulo o estar vacio");
        }
    }
    public Autor getOne(String id){
        return autorRepositorio.getOne(id);
    }
    /**
     *
     * @param nombre
     * @throws MiException
     */
    private void validar(String nombre) throws MiException {
        if (nombre.isEmpty() || nombre==null) {
            throw new MiException("El id del autor no puede ser nulo o estar vacio");
        }
    }

}
