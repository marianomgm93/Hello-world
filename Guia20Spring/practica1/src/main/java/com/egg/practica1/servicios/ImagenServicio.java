package com.egg.practica1.servicios;

import com.egg.practica1.entidades.Imagen;
import com.egg.practica1.excepciones.MiException;
import com.egg.practica1.repositorios.ImagenRepositorio;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImagenServicio {

    @Autowired
    private ImagenRepositorio imagenRepositorio;

    /**
     * guardar imagen
     *
     * @param archivo
     * @return
     */
    public Imagen guardar(MultipartFile archivo) throws MiException {
        if (archivo != null) {
            try {
                Imagen imagen = new Imagen();
                imagen.setMime(archivo.getContentType());
                imagen.setNombre(archivo.getName());
                imagen.setContenido(archivo.getBytes());
                return imagenRepositorio.save(imagen);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

        }
        return null;
    }

    public Imagen actualizar(MultipartFile archivo, String idImagen) throws MiException {
        try {
            Imagen imagen = new Imagen();
            if (idImagen != null) {
                Optional<Imagen> respuesta= imagenRepositorio.findById(idImagen);
                if (respuesta.isPresent()) {
                    imagen=respuesta.get();
                }
            }
            imagen.setMime(archivo.getContentType());
            imagen.setNombre(archivo.getName());
            imagen.setContenido(archivo.getBytes());
            return imagenRepositorio.save(imagen);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

}
