package Servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaService {

    /*Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
    Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar 
    el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos 
    el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de 
    años entre una y otra (edad del usuario).
     */
    public Date fechaNacimiento(Scanner sc) {
        int aa, mm, dd;
        System.out.println("Ingrese anio de nacimiento (aaaa)");
        aa = sc.nextInt();
        System.out.println("ingrese mes de nacimiento (mm)");
        mm = sc.nextInt();
        System.out.println("ingrese dia de nacimiento (dd)");
        dd = sc.nextInt();
        return new Date(aa-1900, mm-1, dd); //Utilizar -1900 para fechas en 4 digitos
    }

    public Date fechaActual() {
        Date fechaActual = new Date();
        return fechaActual;
    }

    public int diferencia(Date fechaNacimiento,Date fechaActual) {
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();
        if (fechaActual.getMonth()<fechaNacimiento.getMonth()) {
            edad--;
        }else if(fechaActual.getMonth()==fechaNacimiento.getMonth() && fechaActual.getDay()<fechaNacimiento.getDay()){
            edad--;
        }
        return edad;
    }
}
