package Tienda.Servicios;

import Tienda.Entidades.Producto;
import Tienda.Persistencia.ProductoDAO;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductoService {

    private ProductoDAO pDAO = new ProductoDAO();

    public void crearProducto() {
        try {
            Scanner sc = new Scanner(System.in);
            Producto prod = new Producto();
            System.out.println("Ingrese nombre del Producto");
            prod.setNombre(sc.next());
            System.out.println("Ingrese Precio del producto");
            prod.setPrecio(sc.nextDouble());
            sc.nextLine();
            System.out.println("Ingrese Codigo de fabricante");
            prod.setCodigoFabricante(sc.nextInt());
            pDAO.guardarProducto(prod);
            System.out.println(prod);
        } catch (Exception ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarProducto()  {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el nombre del producto");
            Producto prod = pDAO.buscarPorNombre(sc.next());
            sc.nextLine();
            System.out.println(prod);
            System.out.println("Ingrese nombre");
            prod.setNombre(sc.next());
            sc.nextLine();
            System.out.println("Ingrese precio");
            prod.setPrecio(sc.nextDouble());
            pDAO.modificarProducto(prod);
            System.out.println(prod);
            System.out.println("El producto se ha modificado correctamente");
        } catch (Exception ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void listarProductos(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Listar productos por:\n1_Precio entre 120 y 202\n2_Nombre\n3_Precio y nombre\n4_Portatiles\n5_Mas barato");
            int var = sc.nextInt();
            ArrayList<Producto> productos;
            ArrayList<String> nombres;
            
            
            switch (var) {
                case 1:
                    productos = pDAO.listarProductoEntre();
                    for (Producto producto : productos) {
                        System.out.println(producto);
                    }
                    break;
                case 2:
                    nombres = pDAO.listarProductoN();
                    for (String nombre : nombres) {
                        System.out.println(nombre);
                    }
                    
                    break;
                case 3:
                    productos = pDAO.listarProductoPN();
                    for (Producto producto : productos) {
                        System.out.println(producto);
                    }
                    break;
                case 4:
                    productos = pDAO.listarProductoPortatil();
                    for (Producto producto : productos) {
                        System.out.println(producto);
                    }
                    break;
                case 5:
                    Producto prod = pDAO.mostrarMasBarato();
                    System.out.println(prod);
                    break;
                default:
                    throw new AssertionError();
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
