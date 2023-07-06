package Tienda.Servicios;

import Tienda.Entidades.Fabricante;
import Tienda.Persistencia.FabricanteDAO;
import java.util.Scanner;

public class FabricanteService {
    private FabricanteDAO fDAO=new FabricanteDAO();
    
    public void crearFabricante() throws Exception{
         Fabricante fab=new Fabricante();
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese nombre del fabricante");
        String nombre=sc.next();
        fab.setNombre(nombre);
        fDAO.guardarFabricante(fab);
    }
}
