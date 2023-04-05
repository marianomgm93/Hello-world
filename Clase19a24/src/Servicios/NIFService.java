package Servicios;

import Entidades.NIF;
import java.util.Scanner;

public class NIFService {

    public NIF crearNif(Scanner sc){
        System.out.println("Ingrese DNI");
        long dni=sc.nextLong();
        char letra=this.calcularLetra(dni);
        NIF nif=new NIF(dni,letra);
        return nif;
    }
    public char calcularLetra(long dni){
        String codigo="TRWAGMYFPDXBNJZSQVHLCKE";
        return codigo.charAt((int)(dni%23));
    }
    public void mostrar(NIF nif){
        System.out.println(nif.getDni()+"-"+nif.getLetra());
    }
}
