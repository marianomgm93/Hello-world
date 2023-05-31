package Servicios;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.BarcoAMotor;
import Entidades.Velero;
import Entidades.Yate;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.Scanner;

public class AlquilerService {
    
    /**
     * Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente multiplicando por 10 los metros de eslora).En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles, en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y el número de camarotes.
     *
     * @return
     */
    public double calcularAlquiler() {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        System.out.println("Ingrese el tipo de barco:\n1_Velero\n2_Barco a motor\n3_Yate");
        Barco barco;
        int opt=sc.nextInt();
        switch (opt) {
            case 1:
                barco=new Velero(3, "matricula", 3, 2023);
                break;
            case 2:
                barco=new BarcoAMotor(500, "matricula", 3, 2023);
                break;
            case 3:
                barco=new Yate(500, 15, "matricula", 3, 2023);
                break;
            default:
                throw new AssertionError();
        }
        
        Alquiler alquiler=new Alquiler("persona","documento", LocalDate.of(2023,5,1), LocalDate.of(2023,5,random.nextInt(20)+1), 1, barco);
        System.out.println("Alquiler: "+alquiler);
        double totalAlquiler;
        long diasTranscurridos = ChronoUnit.DAYS.between(alquiler.getFechaAlquiler(), alquiler.getFechaDevolucion());
        double modulo = 10 * barco.getEslora();
        if (barco instanceof Velero) {
            modulo += ((Velero) barco).getMastiles();
        } else if (barco instanceof BarcoAMotor) {
            modulo += ((BarcoAMotor) barco).getPotencia();
        } else if (barco instanceof Yate) {
            modulo += ((Yate) barco).getCamarotes() + ((Yate) barco).getPotencia();
        }
        totalAlquiler = diasTranscurridos * modulo;
        return totalAlquiler;
    }
}
