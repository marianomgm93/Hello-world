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
        List<Autor> autores=em.createQuery("SELECT au FROM Autor au WHERE au.nombre= '"+nombre+"'")
                .getResultList();
            if (!autores.isEmpty()) {
                Autor autor=autores.get(0);
                return autor;
            }else{
                System.out.println("No hay ningun autor con ese nombre");
                return null;
            }
        
        }catch(Exception ex){
            System.out.println("Buscar por nombre de autor error");
            ex.printStackTrace();
            return null;
        }finally{
            desconectar();
        }
    }
    
    public void eliminar(Long id) throws Exception{
        Autor autor=buscarPorId(id);
        autor.setAlta(false);
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
