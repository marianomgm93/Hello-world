
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
//números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
//para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
//una división con los dos numeros y mostrar el resultado.
    Scanner xd = new Scanner(System.in);
        try{
        System.out.println("Ingrese un numero: ");
        String a = xd.next();
        System.out.println("Ingese el segundo: ");
        String b = xd.next();
        int d = Integer.parseInt(a);
        int e = Integer.parseInt(b);
        
            System.out.println(d/e);
        }catch(ArithmeticException f){
            System.out.println("NO ESISTIS " + f.fillInStackTrace() );
        }catch(NumberFormatException g){
            System.out.println("NUMEROS MAMERTO, NO LETRAS " + g.toString());
            System.out.println(g.getMessage());
        }
        
    }


}
