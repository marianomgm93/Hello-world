package DAO;

import libreria.entidades.Editorial;
import java.util.List;

public class EditorialDAO extends DAO<Editorial>{
    
    @Override
    public void guardar(Editorial editorial){
        super.guardar(editorial);
    }
    public void editar(Long id) throws Exception{
        Editorial editorial=buscarPorId(id);
        super.editar(editorial);
    }
//    public Editorial buscarPorNombre(String nombre){
//        conectar();
//        Editorial editorial= em.find(Editorial.class, nombre);
//        desconectar();
//        return editorial;
//    }
        public Editorial buscarPorId(Long id) throws Exception {
        conectar();
        Editorial editorial = em.find(Editorial.class, id);
        desconectar();
        return editorial;
    }
            public Editorial buscarPorNombre(String nombre){
        conectar();
        List<Editorial> editoriales=em.createQuery("SELECT ed FROM editorial ed WHERE nombre= "+nombre)
                .getResultList();
        Editorial editorial=editoriales.get(0);
        desconectar();
        return editorial;
    }
    public void eliminar(Long id) throws Exception{
        Editorial editorial=buscarPorId(id);
        super.eliminar(editorial);
    }
    public List<Editorial> listarTodo(){
        conectar();
        List<Editorial>editoriales= em.createQuery("SELECT ed FROM Editorial ed")
                .getResultList();
        desconectar();
        return editoriales;
    }
}
