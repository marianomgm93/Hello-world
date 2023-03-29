package ClasesExtra;

import java.util.ArrayList;
import java.util.Scanner;

public class Cocina {
    ArrayList<Receta> recetas=new ArrayList();

    public Cocina() {
    }

    public ArrayList<Receta> getRecetas() {
        return recetas;
    }
    
    public void nuevaReceta(Scanner sc){
        
        System.out.println("Ingrese nombre de la receta");
        String nombre=sc.next();
        Receta receta=new Receta(nombre);
        receta.agregarIngrediente(sc);
        this.recetas.add(receta);
       
    }
    public void buscarReceta(Scanner sc){
        System.out.println("Ingrese el nombre de la receta a buscar");
        String nombre=sc.next();
        for (Receta receta : recetas) {
            if (receta.getNombre().equals(nombre)) {
                System.out.println("La receta "+nombre+" se encuentra en nuestra base de datos!");
                System.out.println("ingredientes: " +receta.getIngredientes());
            }

       
        }
    }
    
}
