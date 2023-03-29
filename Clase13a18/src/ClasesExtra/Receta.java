package ClasesExtra;

import java.util.ArrayList;
import java.util.Scanner;
public class Receta {
   private String nombre;
   private ArrayList<String> ingredientes=new ArrayList();
    
    public Receta() {
    }

    public Receta(String nombre) {
        this.nombre = nombre;
    }
    public void agregarIngrediente(Scanner sc){
        System.out.println("Ingrese la cantidad de ingredientes");
        int cantidad=sc.nextInt();
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese ingrediente");
            String ingrediente=sc.next();
            this.ingredientes.add(ingrediente);
            
        }
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    @Override
    public String toString() {
        return "Receta{" + "nombre=" + nombre + ", ingredientes=" + ingredientes + '}';
    }
    
    
}
