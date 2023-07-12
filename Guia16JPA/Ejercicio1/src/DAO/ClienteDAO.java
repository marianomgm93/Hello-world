package DAO;

import java.util.List;
import libreria.entidades.Cliente;

public class ClienteDAO extends DAO<Cliente>{
    
    public void guardar(Cliente cliente){
        super.guardar(cliente);
    }
    
    public Cliente buscarPorId(Integer id){
        try{
            conectar();
            Cliente cliente=em.find(Cliente.class, id);
            if (cliente==null) {
                System.out.println("No hay ningun cliente con ese ID");
                return null; 
            }else{
                return cliente;
            }
            
        }catch(Exception ex){
            System.out.println("Error en buscar por id CLIENTE");
            ex.printStackTrace();
            return null;
        }finally{
            desconectar();
        }
    }
    
    public List<Cliente> buscarPorNombre(String nombre, String apellido){
        try{
            conectar();
            List<Cliente> clientes=em.createQuery("SELECT cl FROM Cliente cl WHERE cl.nombre='"+nombre+"' and cl.apellido ='"+apellido+"'")
                    .getResultList();
            if (clientes.isEmpty()) {
                System.out.println("No se encontro ningun cliente con ese nombre");
                return null;
            }else{
                return clientes;
            }
        }catch(Exception ex){
            System.out.println("ERROR EN BUSCAR CLIENTE POR NOMBRE ");
            ex.printStackTrace();
            return null;
        }finally{
            desconectar();
        }
    }
        public Cliente buscarPorDNI(Long dni){
        try{
            conectar();
            List<Cliente> clientes=em.createQuery("SELECT cl FROM Cliente cl WHERE cl.doc="+dni)
                    .getResultList();
            if (clientes.isEmpty()) {
                System.out.println("No se encontro ningun cliente con ese DNI");
                return null;
            }else{
                return clientes.get(0);
            }
        }catch(Exception ex){
            System.out.println("ERROR EN BUSCAR CLIENTE POR DNI ");
            ex.printStackTrace();
            return null;
        }finally{
            desconectar();
        }
    }
    
    public void eliminar(Integer id){
        Cliente cliente=buscarPorId(id);
        cliente.setAlta(false);
        super.eliminar(cliente);
    }
    public void editar(Cliente cliente){
                super.editar(cliente);
    }
    
}
