package ClasesExtra;

import java.util.Scanner;

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    
    public void calcular_aumento(Scanner sc) {
        double nuevoSalario=0;
        System.out.println("El salario actual es: $"+this.salario);
        nuevoSalario=(this.edad>30) ? this.salario*1.1 : this.salario*1.05;
        System.out.println("El nuevo salario seria de: $" +nuevoSalario);
        System.out.println("Desea actualizar el salario de "+this.nombre+"? s/n");
        String opcion=sc.next();
        if (opcion.equalsIgnoreCase("s")) {
            System.out.println("Ahora el salario de "+this.nombre+" sera $"+nuevoSalario);
            this.salario=nuevoSalario;
            
        }else{
            System.out.println("El salario de "+this.nombre+" se mantendra en $"+this.salario);
        }
    }
    
}
