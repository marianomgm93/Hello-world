package Servicios;

import Entidades.Electrodomestico;
import Entidades.Televisor;
import java.util.Scanner;

public class TelevisorService extends ElectrodomesticoService {
  
    public Televisor crearTelevisor(){
        Scanner sc=new Scanner(System.in);
        Electrodomestico ele=crearElectrodomestico();
        System.out.println("Ingrese resolucion en pulgadas");
        int pulgadas=sc.nextInt();
        System.out.println("Sintonizador tdt? s/n ");
        String opt=sc.next();
        boolean tdt;
        if (opt.equalsIgnoreCase("s")) {
            tdt=true;
        }else{
            tdt=false;
        }
        Televisor tv=new Televisor(pulgadas, tdt, ele.getPrecio(), ele.getColor(), ele.getConsumo(), ele.getPeso());
        precioFinal(tv);
        return tv;
    }
    
    private void precioFinal(Televisor tv){
        double precio=tv.getPrecio();
        if (tv.getResolucion()>40) {
            precio=precio*1.3;
        }
        if(tv.isTdt()){
            precio+=500;
        }
        tv.setPrecio(precio);
    }
}
