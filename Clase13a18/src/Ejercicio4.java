
import ClasesExtra.Rectangulo;
import java.util.Scanner;

public class Ejercicio4 {

    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        /**
         * Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. 
         * La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un 
         * método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último, tendremos un 
         * método que dibujará el rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir los métodos getters, 
         * setters y constructores correspondientes. Superficie = base * altura / Perímetro = (base + altura) * 2.
         */
        double base;
        double altura;
        System.out.println("Ingrese la base del rectangulo");
        base = leer.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        altura=leer.nextDouble();
        Rectangulo poligono = new Rectangulo(base,altura);
        
        System.out.println("El perimetro es: "+poligono.calcularPerimetro());
        System.out.println("La superficie es: "+poligono.calcularSuperficie());
        poligono.dibujarRectangulo();
    }

}
