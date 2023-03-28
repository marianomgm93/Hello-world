package ClasesExtra;

import java.util.Scanner;

/**
 Crear una clase llamada Producto que contenga los siguientes atributos: nombre, código, stock y precio. 
 A continuación crear los siguientes métodos:
- Método constructor vacio y constructor con todos los atributos pasados por parámetro
- Método get y set para cada atributo
- Método crearProducto(): pide los datos al usuario y lo guarda en los diferentes atributos
- Método venderProducto(): pide al usuario que ingrese una cantidad del producto y lo mismo se debe 
*restar del atributo stock
- Método cambiarPrecio(): pide al usuario un nuevo precio y lo asigna al atributo
- Método mostrarProducto(): mostrar el nombre, código, stock y precio del producto
 
 */

public class Producto {
    private String nombre;
    private String codigo;
    private int stock;
    private double precio;

    public Producto() {
    }

    public Producto(String nombre, String codigo, int stock, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.stock = stock;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void crearProducto(Scanner sc){
        System.out.println("Ingrese nombre del producto");
        this.nombre=sc.next();
        
        System.out.println("Ingrese codigo del producto");
        this.codigo=sc.next();
        System.out.println("Ingrese la cantidad de productos en stock");
        this.stock=sc.nextInt();
        System.out.println("Ingrese el precio del producto");
        this.precio=sc.nextDouble();
        System.out.println("Producto "+this.nombre+" creado correctamente");
    }
    public void venderProducto(Scanner sc){
        System.out.println("Ingrese la cantidad vendida del producto " +this.nombre);
        int vendidos=sc.nextInt();
        if (this.stock>vendidos) {
            this.stock-=vendidos;
            System.out.println("Quedan "+this.stock+" unidades del producto " +this.nombre);
        }else{
            System.out.println("No hay stock suficiente del producto "+this.nombre+ " como para realizar la venta");
        }
    }
    public void cambiarPrecio(Scanner sc){
        System.out.println("Ingrese el nuevo precio para el producto "+this.nombre);
        this.precio=sc.nextDouble();
        System.out.println("El precio cambio correctamente a "+this.precio);
    }

    
    public void mostrarProducto () {
        System.out.println("Producto{" + "nombre=" + this.nombre + "\ncodigo=" + this.codigo + "\nstock=" + this.stock + "\nprecio=" + this.precio + '}'); 
    }
    
}
