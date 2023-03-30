
import ClasesExtra.Empleado;
import java.util.Scanner;

public class EjercicioExtra6 {
    //Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario".
    //Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en función de su edad y
    //salario actual. El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
    public static void main(String[] args) {
        Empleado jorge=new Empleado("Jorge",35,100000);
        Empleado juan=new Empleado("Juan",25,80000);
        Scanner sc=new Scanner(System.in);
        
        jorge.calcular_aumento(sc);
        juan.calcular_aumento(sc);
    }

}
