package Tienda;

import Tienda.Servicios.FabricanteService;
import Tienda.Servicios.ProductoService;

public class Main {
    public static void main(String[] args) {
        ProductoService serv=new ProductoService();
        FabricanteService fServ=new FabricanteService();
        serv.listarProductos();
        System.out.println("-------CREAR PRODUCTO-------");
        serv.crearProducto();
        System.out.println("-------MODIFICAR PRODUCTO-------");
        serv.modificarProducto();
    }

}
