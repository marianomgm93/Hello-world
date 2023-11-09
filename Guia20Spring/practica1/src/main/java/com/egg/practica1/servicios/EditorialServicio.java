package com.egg.practica1.servicios;

import com.egg.practica1.entidades.Editorial;
import com.egg.practica1.excepciones.MiException;
import com.egg.practica1.repositorios.EditorialRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditorialServicio {
    
    @Autowired
    EditorialRepositorio editorialRepositorio;
    
    @Transactional
    public void crearEditorial(String nombre) throws MiException{
        validar(nombre);
        Editorial editorial=new Editorial();
        
        editorial.setNombre(nombre);
        
        editorialRepositorio.save(editorial);
        
    }
    /**
     * Lista todas las editoriales.
     * @return 
     */
    public List<Editorial> listarEditoriales(){
        List<Editorial> editoriales=new ArrayList();
        editoriales=editorialRepositorio.findAll();
        return editoriales;
    }
    /**
     * Modifica el nombre de la editorial.
     * @param id
     * @param nombre 
     */
    public void modificarEditorial(String id, String nombre) throws MiException{
        validar(id, nombre);
        Optional<Editorial> respuestaEditorial=editorialRepositorio.findById(id);
        
        if (respuestaEditorial.isPresent()) {
            Editorial editorial=respuestaEditorial.get();
            editorial.setNombre(nombre);
            
            editorialRepositorio.save(editorial);
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
    public Editorial getOne(String id){
        return editorialRepositorio.getOne(id);
    }
    /**
     *
     * @param nombre
     * @throws MiException
     */
        private void validar(String nombre) throws MiException {
        if (nombre.isEmpty()) {
            throw new MiException("El id del autor no puede ser nulo o estar vacio");
        }
    }
}
