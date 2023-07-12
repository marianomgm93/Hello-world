package DAO;

import libreria.entidades.Editorial;
import java.util.List;

public class EditorialDAO extends DAO<Editorial> {

    @Override
    public void guardar(Editorial editorial) {
        super.guardar(editorial);
    }

    public void editar(Long id) throws Exception {
        Editorial editorial = buscarPorId(id);
        super.editar(editorial);
    }

    public Editorial buscarPorId(Long id) throws Exception {
        conectar();
        Editorial editorial = em.find(Editorial.class, id);
        desconectar();
        return editorial;
    }

    public Editorial buscarPorNombre(String nombre) {
        conectar();
        try {
            
            List<Editorial> editoriales = em.createQuery("SELECT ed FROM Editorial ed WHERE ed.nombre= '" + nombre + "'")
                    .getResultList();
            if (!editoriales.isEmpty()) {
                Editorial editorial = editoriales.get(0);
                 desconectar();
                return editorial;
            }else{
                System.out.println("No hay ningun editor con el nombre");
                 desconectar();
                return null;
            }
        } catch (Exception ex) {
            System.out.println("Buscar por nombre error");
            ex.printStackTrace();
            return null;
        }
    }

    public void eliminar(Long id) throws Exception {
        Editorial editorial = buscarPorId(id);
        editorial.setAlta(false);
        super.eliminar(editorial);
    }

    public List<Editorial> listarTodo() {
        conectar();
        List<Editorial> editoriales = em.createQuery("SELECT ed FROM Editorial ed")
                .getResultList();
        desconectar();
        return editoriales;
    }
}
