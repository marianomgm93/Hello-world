package Servicios;

import Entidades.Lavadora;
import java.util.Scanner;

public class LavadoraService extends ElectrodomesticoService {

    public void crearLavadora(Lavadora ele) {
        super.crearElectrodomestico(ele);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese carga");
        int carga = sc.nextInt();
        ele.setCarga(carga);
        precioFinal(ele);
    }

    public void precioFinal(Lavadora lavadora) {
        double precio = lavadora.getPrecio();
        if (lavadora.getCarga() > 30) {
            precio += 500;
        }
        lavadora.setPrecio(precio);
    }
}
