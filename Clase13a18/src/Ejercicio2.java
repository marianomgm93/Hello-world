
import ClasesExtra.Circunferencia;
import java.util.Scanner;

public class Ejercicio2 {
    private static Circunferencia nuevaCircunferencia= new Circunferencia();
    private static Scanner leer=new Scanner(System.in);
    public static void main(String[] args) {
/**Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
 A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
**/
    crearCircunferencia();
    


    }
    public static void crearCircunferencia(){
        System.out.println("Por favor ingrese el radio de la circunferencia");
        nuevaCircunferencia.setRadio(leer.nextDouble());
        
        System.out.println("El area es : " +nuevaCircunferencia.area()+"\n El Perimetro es: "+nuevaCircunferencia.perimetro());
        
        
    }
    
}
