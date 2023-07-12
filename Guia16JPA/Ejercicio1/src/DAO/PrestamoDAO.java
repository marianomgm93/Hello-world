package DAO;

import java.util.List;
import libreria.entidades.Prestamo;

public class PrestamoDAO extends DAO<Prestamo>{
    
    public void guardar(Prestamo prestamo){
          super.guardar(prestamo);
    }
    public Prestamo buscarPorId(Integer id){
        try {
            conectar();
            Prestamo prestamo=em.find(Prestamo.class, id);
            if (prestamo!=null) {
                return prestamo;
            }else{
                System.out.println("No existe prestamo para el id= "+id);
                return null;
            }
        } catch (Exception ex) {
            System.out.println("BUSCAR PRESTAMO POR ID ERROR");
            ex.printStackTrace();
            return null;
        } finally {
            desconectar();
        }
    }
    public List<Prestamo> buscarPorLibro(Long idLibro){
        try {
            conectar();
            List<Prestamo> prestamos=em.createQuery("SELECT pr FROM Prestamo pr WHERE pr.libro="+idLibro)
                    .getResultList();
            if (!prestamos.isEmpty()) {
                return prestamos;
            }else{
                System.out.println("No hay ningun prestamo para ese libro");
                return null;
            }
            
        } catch (Exception e) {
            System.out.println("BUSCAR PRESTAMO POR ID LIBRO ERROR");
            e.printStackTrace();
            return null;
        } finally {
            desconectar();
        }
    }
    
    public List<Prestamo> buscarPorCliente(Integer idCliente){
        try {
            conectar();
            List <Prestamo> prestamos=em.createQuery("SELECT pr FROM Prestamo pr WHERE pr.cliente="+idCliente)
                    .getResultList();
            if(!prestamos.isEmpty()){
                return prestamos;
            }else{
                System.out.println("No se encontro prestamo para el cliente id="+idCliente);
                return null;
            }
        } catch (Exception e) {
            System.out.println("BUSCAR PRESTAMO POR CLIENTE ERROR");
            e.printStackTrace();
            return null;
        } finally {
            desconectar();
        }
        
    }
    
    public void editar(Prestamo prestamo){
                super.editar(prestamo);
    }
    public void elimiar(Integer id){
        Prestamo prestamo=buscarPorId(id);
        prestamo.setAlta(false);
        super.eliminar(prestamo);
    }
    

}
