package Servicios;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import java.util.Scanner;

public class LavadoraService extends ElectrodomesticoService{
    
    public Lavadora crearLavadora(){
        Electrodomestico ele=crearElectrodomestico();
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese carga");
        int carga=sc.nextInt();
        Lavadora lava=new Lavadora(carga, ele.getPrecio(), ele.getColor(), ele.getConsumo(), ele.getPeso());
        precioFinal(lava);
        return lava;
    }
    public void precioFinal(Lavadora lavadora){
        double precio=lavadora.getPrecio();
        if (lavadora.getCarga()>30) {
            precio+=500;
        }
        lavadora.setPrecio(precio);
    }
}
