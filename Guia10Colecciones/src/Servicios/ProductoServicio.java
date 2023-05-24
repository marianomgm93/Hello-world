package Servicios;

import Entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductoServicio {

    private HashMap<String, Double> productos = new HashMap();
    private Scanner sc = new Scanner(System.in);

    public void cargarProducto() {
        String option;
        boolean flag=true;
        do {
            Producto prod = new Producto();
            System.out.println("Ingrese nombre del producto");
            prod.setNombre(sc.next());
            System.out.println("Ingrese precio del producto");
            prod.setPrecio(sc.nextDouble());
            productos.put(prod.getNombre(), prod.getPrecio());
            mostrarProductos();
            System.out.println("Desea ingresar un nuevo producto? s/n");
            option=sc.next();
            if (option.equalsIgnoreCase("n")) {
                System.out.println("......Volviendo al menu principal......");
                flag=false;
            }
        } while (flag);

    }
    private void mostrarProductos(){
        System.out.println("Los productos son: ");
        for (Map.Entry<String,Double> producto : productos.entrySet()) {
            System.out.println("Producto: "+producto.getKey()+" Precio: "+producto.getValue());
        }
    }
    private void cambiarPrecio(){
        Double precio;
        System.out.println("Ingrese el nombre del producto a modificar");
        String nombre=sc.next();
        
        if(productos.containsKey(nombre)){
            System.out.println("Ingrese el precio actualizado");
            precio=sc.nextDouble();
            productos.replace(nombre,precio );
            System.out.println("El precio de "+nombre+" cambio correctamente");
            
        }else{
            System.out.println("El producto no se encuentra en la lista");
        }
        
    }
    private void eliminarProducto(){
        System.out.println("Ingrese el nombre del producto a eliminar");
        String nombre=sc.next();
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("El producto "+nombre+" se elimino correctamente");
        }
    }
    
    public void menu(){
        int var;
        boolean flag=true;
        do {
            System.out.println("1-Cargar nuevo producto\n2-Cambiar Precio\n3-Mostrar productos\n4-Eliminar Producto\n5-Salir");
            var=sc.nextInt();
            switch (var) {
                case 1:
                    cargarProducto();
                    break;
                case 2:
                    cambiarPrecio();
                    break;
                case 3:
                    mostrarProductos();
                    break;
                case 4:
                    eliminarProducto();
                    break;
                case 5:
                    System.out.println(".....Saliendo.....");
                    flag=false;
                    break;
                default:
                    System.out.println("La opcion no se encuentra, intentelo nuevamente");
            }
        } while (flag);
    }
}
