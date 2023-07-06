package Tienda.Persistencia;

import Tienda.Entidades.Fabricante;

public final class FabricanteDAO extends DAO {
    
    public void guardarFabricante(Fabricante fabricante) throws Exception{
        try {
            if (fabricante==null) {
                throw new Exception("Debe ingresar un fabricante<3");
            }
            String sql="INSERT INTO fabricante (nombre) "+"VALUES ('"+fabricante.getNombre()+"');";
            
            insModDel(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            disconnect();
        }
    }
    
}
