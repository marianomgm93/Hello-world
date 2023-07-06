package DAO;

import libreria.entidades.Autor;
import java.util.List;

public class AutorDAO extends DAO<Autor> {
    
    @Override
    public void guardar(Autor autor){
        super.guardar(autor);
    }
    public Autor buscarPorId(Long id) throws Exception {
        conectar();
        Autor autor= em.find(Autor.class, id);
        desconectar();
        return autor;
    }
    public Autor buscarPorNombre(String nombre){
        conectar();
        try{
            
        
        List<Autor> autores=em.createQuery("SELECT au FROM autor au WHERE nombre= "+nombre)
                .getResultList();
        Autor autor=autores.get(0);
        desconectar();
        return autor;
        }catch(Exception ex){
            System.out.println("Buscar por nombre error");
            ex.printStackTrace();
            return null;
        }
        
        
        
    }
    
    public void eliminar(Long id) throws Exception{
        Autor autor=buscarPorId(id);
        super.eliminar(autor);
    }
    public void editar(Long id) throws Exception{
        Autor autor=buscarPorId(id);
        super.editar(autor);
    }
    public List<Autor> listarTodo(){
        List<Autor> autores=em.createQuery("SELECT au FROM Autor au")
                .getResultList();
        return autores;
    }

}
