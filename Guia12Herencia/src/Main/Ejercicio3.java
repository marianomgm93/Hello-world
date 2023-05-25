package Main;


import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import Servicios.ElectrodomesticoService;
import Servicios.LavadoraService;
import Servicios.TelevisorService;
import java.util.ArrayList;
import java.util.Scanner;
//Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
//para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
//Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
//deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
//televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
//precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
//2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
//electrodomésticos, 2000 para lavadora y 5000 para televisor.
public class Ejercicio3 {
    public static void main(String[] args) {
        LavadoraService lavaSv=new LavadoraService();
        ElectrodomesticoService eleSv=new ElectrodomesticoService();
        TelevisorService tvSv=new TelevisorService();
        Electrodomestico lavadora=new Lavadora();
        Electrodomestico tv=new Televisor();
        Scanner sc=new Scanner(System.in);
        ArrayList<Electrodomestico> electrodomesticos=new ArrayList();
        for (int i = 0; i <4; i++) {
            System.out.println("1_Crear lavadora\n2_Crear televisor");
            int opt=sc.nextInt();
            switch (opt) {
                case 1:
                    lavaSv.crearLavadora((Lavadora)lavadora);
                    electrodomesticos.add(lavadora);
                    System.out.println("------Lavadora creada correctamente------");
                    
                    break;
                case 2:
                    tvSv.crearTelevisor((Televisor)tv);
                    electrodomesticos.add(tv);
                    System.out.println("------Televisor creado correctamente------");
                    break;
                default:
                    throw new AssertionError();
            }
                
            }
        double sumaLavadoras=0;
        double sumaTelevisores=0;
        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico instanceof Lavadora) {
                sumaLavadoras+=electrodomestico.getPrecio();
                
            }else{
                sumaTelevisores+=electrodomestico.getPrecio();
            }
            
        }
        System.out.println("El precio total de lavadoras es: "+sumaLavadoras );
        System.out.println("El precio total de televisores es: "+sumaTelevisores);
        System.out.println("El total es: "+(sumaLavadoras+sumaTelevisores));
    }

}
