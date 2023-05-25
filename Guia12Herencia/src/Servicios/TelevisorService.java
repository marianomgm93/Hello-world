package Servicios;

import Entidades.Electrodomestico;
import Entidades.Televisor;
import java.util.Scanner;

public class TelevisorService extends ElectrodomesticoService {
  
    public void crearTelevisor(Televisor ele){
        Scanner sc=new Scanner(System.in);
        super.crearElectrodomestico(ele);
        System.out.println("Ingrese resolucion en pulgadas");
        int pulgadas=sc.nextInt();
        ele.setResolucion(pulgadas);
        System.out.println("Sintonizador tdt? s/n ");
        String opt=sc.next();
        boolean tdt;
        if (opt.equalsIgnoreCase("s")) {
            tdt=true;
        }else{
            tdt=false;
        }
        ele.setTdt(tdt);
        precioFinal(ele);
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
