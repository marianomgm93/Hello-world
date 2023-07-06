package Tienda.Persistencia;

import Tienda.Entidades.Producto;
import java.util.ArrayList;

public final class ProductoDAO extends DAO {

    public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe ingresar un producto<3");
            }
            String sql = "INSERT INTO producto (nombre,precio,codigo_fabricante) " + "VALUES ('"
                    + producto.getNombre() + "','"
                    + producto.getPrecio() + "','"
                    + producto.getCodigoFabricante()
                    + "');";
            insModDel(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            disconnect();
        }
    }

    public void modificarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe ingresar el producto a modificar");
            }
            String sql = "UPDATE producto SET "
           + "nombre= '" + producto.getNombre() + "', "
           + "precio= " + producto.getPrecio() + ", "
           + "codigo_fabricante= " + producto.getCodigoFabricante()
           + " WHERE codigo= " + producto.getCodigo() + ";";
            insModDel(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            disconnect();
        }
    }

    public void eliminarProducto(String nombre) throws Exception {
        try {
            if (nombre == null) {
                throw new Exception("Debe ingresar el nombre de un producto");
            }
            String sql = "DELETE FROM  producto WHERE nombre='" + nombre + "';";
            insModDel(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            disconnect();
        }
    }
/**
 * 
 * @return
 * @throws Exception 
 */
    public ArrayList<Producto> listarProductoPN() throws Exception {
        try {
            String sql = "SELECT precio,nombre FROM producto;";
            consultar(sql);
            ArrayList<Producto> productos = new ArrayList();
            while (resultado.next()) {
                Producto prod = new Producto();
                prod.setNombre(resultado.getString("nombre"));
                prod.setPrecio(resultado.getDouble("precio"));
                productos.add(prod);
            }
            return productos;
        } catch (Exception e) {
            throw e;
        } finally {
            disconnect();
        }
    }
/**
 * 
 * @return
 * @throws Exception 
 */
    public ArrayList<String> listarProductoN() throws Exception {
        try {
            String sql = "SELECT nombre FROM producto;";
            consultar(sql);
            ArrayList<String> productos = new ArrayList();
            while (resultado.next()) {
                String prod;
                prod = resultado.getString("nombre");
                productos.add(prod);
            }
            return productos;
        } catch (Exception e) {
            throw e;
        } finally {
            disconnect();
        }
    }
/**
 * 
 * @return
 * @throws Exception 
 */
    public ArrayList<Producto> listarProductoEntre() throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE precio BETWEEN 120 AND 202;";
            consultar(sql);
            ArrayList<Producto> productos = new ArrayList();
            while (resultado.next()) {
                Producto prod = new Producto();
                prod.setNombre(resultado.getString("nombre"));
                prod.setPrecio(resultado.getDouble("precio"));
                prod.setCodigoFabricante(resultado.getInt("codigo_fabricante"));
                prod.setCodigo(resultado.getInt("codigo"));
                productos.add(prod);
            }
            return productos;
        } catch (Exception e) {
            throw e;
        } finally {
            disconnect();
        }
    }
/**
 * 
 * @return
 * @throws Exception 
 */
    public ArrayList<Producto> listarProductoPortatil() throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE nombre LIKE '%portatil%';";
            consultar(sql);
            ArrayList<Producto> productos = new ArrayList();
            while (resultado.next()) {
                Producto prod = new Producto();
                prod.setNombre(resultado.getString("nombre"));
                prod.setPrecio(resultado.getDouble("precio"));
                prod.setCodigoFabricante(resultado.getInt("codigo_fabricante"));
                prod.setCodigo(resultado.getInt("codigo"));
                productos.add(prod);
            }
            return productos;
        } catch (Exception e) {
            throw e;
        } finally {
            disconnect();
        }
    }

    public Producto mostrarMasBarato() throws Exception {
        try {
            String sql = "SELECT * FROM producto ORDER BY precio asc LIMIT 1;";
            consultar(sql);
            Producto prod = new Producto();
            resultado.next();
            prod.setNombre(resultado.getString("nombre"));
            prod.setPrecio(resultado.getDouble("precio"));
            prod.setCodigoFabricante(resultado.getInt("codigo_fabricante"));
            prod.setCodigo(resultado.getInt("codigo"));
            return prod;
        } catch (Exception e) {
            throw e;
        } finally {
            disconnect();
        }
    }
        public Producto buscarPorNombre(String nombre) throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE nombre='"+nombre+"'";
            consultar(sql);
            Producto prod = new Producto();
            resultado.next();
            prod.setNombre(resultado.getString("nombre"));
            prod.setPrecio(resultado.getDouble("precio"));
            prod.setCodigoFabricante(resultado.getInt("codigo_fabricante"));
            prod.setCodigo(resultado.getInt("codigo"));
            return prod;
        } catch (Exception e) {
            throw e;
        } finally {
            disconnect();
        }
    }
}
