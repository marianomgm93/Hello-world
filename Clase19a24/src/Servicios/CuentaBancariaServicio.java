package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {

    public CuentaBancaria crearCuenta(Scanner sc) {
        System.out.println("Ingrese numero de cuenta");
        int numeroCuenta = sc.nextInt();
        System.out.println("Ingrese Dni");
        int dniCliente = sc.nextInt();
        System.out.println("Ingrese el Saldo actual");
        double saldoActual = sc.nextDouble();

        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
        return cuenta;
    }

    public void retirar(Scanner sc, CuentaBancaria cuenta) {

        System.out.println("Ingrese el monto a retirar");
        double valor = sc.nextDouble();

        if (cuenta.getSaldoActual() < valor) {
            System.out.println("El saldo es insuficiente para realizar el retiro, expulsando el total de dinero en la cuenta $" + cuenta.getSaldoActual());
            cuenta.setSaldoActual(0);
        } else {
            double saldo = cuenta.getSaldoActual();
            cuenta.setSaldoActual(saldo - valor);
            System.out.println("Ha retirado satisfactoriamente la cantidad de $" + valor + "\nAhora tiene $" + cuenta.getSaldoActual() + " en su cuenta");

        }

    }

    public void extraccionRapida(Scanner sc, CuentaBancaria cuenta) {
        boolean menu = true;
        do {
            System.out.println("Ingrese el monto a retirar, este no debe exceder el valor de $" + (cuenta.getSaldoActual() * 0.2));
            double valor = sc.nextDouble();
            if (valor <= (cuenta.getSaldoActual() * 0.2)) {
                cuenta.setSaldoActual(cuenta.getSaldoActual() - valor);
                System.out.println("Se ha retirado correctamente el monto de $" + valor);
                menu = false;
            } else {
                System.out.println("El monto a retirar excede el tope de " + cuenta.getSaldoActual() * 0.2 + " Intentar nuevamente? s/n");
                String salir = sc.next();
                if (salir.equalsIgnoreCase("s")) {
                    menu = false;
                }
            }
        } while (menu);
    }

    public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("Su saldo actual es de " + cuenta.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("Los datos de su cuenta son: \n" + cuenta.toString());
    }

    public void menu(Scanner sc, CuentaBancariaServicio serv, CuentaBancaria cuenta) {
        boolean menu=true;
        do {
            System.out.println("1-Retirar\n2-Extraccion rapida\n3-Consultar Saldo\n4-Consultar datos\n5-Salir");
            int val = sc.nextInt();
            switch (val) {
                case 1:
                    serv.retirar(sc, cuenta);
                    break;
                case 2:
                    serv.extraccionRapida(sc, cuenta);
                    break;
                case 3:
                    serv.consultarSaldo(cuenta);
                    break;
                case 4:
                    serv.consultarDatos(cuenta);
                    break;
                case 5:
                    System.out.println("Saliendo!");
                    menu=false;
                    break;
                    
                default:
                    System.out.println("El numero ingresado no corresponde a ninguna opcion, intentelo nuevamente");
            }
        } while (menu);

    }
}
