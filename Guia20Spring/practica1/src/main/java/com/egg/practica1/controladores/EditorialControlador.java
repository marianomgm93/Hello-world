package com.egg.practica1.controladores;

import com.egg.practica1.entidades.Editorial;
import com.egg.practica1.excepciones.MiException;
import com.egg.practica1.servicios.EditorialServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/editorial")
public class EditorialControlador {
    @Autowired
    private EditorialServicio editorialServicio;
    
    @GetMapping("/registrar")
    public String registrar(){
        return "editorial_form.html";
    }
    
    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, ModelMap modelo){
        try {
            editorialServicio.crearEditorial(nombre);
            modelo.put("exito","La editorial se ha creado correctamente");
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
        }
        return "editorial_form.html";
    }
    
    @GetMapping("/lista")
    public String listar(ModelMap modelo){
        List<Editorial> editoriales=editorialServicio.listarEditoriales();
        modelo.addAttribute("editoriales",editoriales);
        return "editorial_list.html";
    }
    @GetMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, ModelMap modelo){
        modelo.put("editorial",editorialServicio.getOne(id));
        return "editorial_modificar.html";
    }
    @PostMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, String nombre,ModelMap modelo){
        try {
            editorialServicio.modificarEditorial(id, nombre);
            return "redirect:../lista";
        } catch (MiException ex) {
            modelo.put("error",ex.getMessage());
            return "editorial_modificar.html";
        }
    }
}
