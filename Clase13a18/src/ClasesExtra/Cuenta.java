package ClasesExtra;

import java.util.Scanner;

public class Cuenta {

    private String titular;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void retirar_dinero(Scanner sc) {

        boolean salir = false;
        String transaccion;
        do {
            System.out.println("Cuanto dinero desea retirar?");
            double retiro = sc.nextDouble();
            if (retiro <= this.saldo) {
                this.saldo -= retiro;
                System.out.println("Ahora quedan $" + this.saldo + " en tu cuenta");
                System.out.println("Desea realizar otro retiro? s/n");
                transaccion = sc.next();
                if (transaccion.equalsIgnoreCase("n")) {
                    salir = true;

                }
            } else {
                System.out.println("EL SALDO ES INSUFICIENTE PARA REALIZAR LA TRANSACCION, INTENTE CON OTRO MONTO");
            }

        } while (!salir);

    }
        public void depositar_dinero(Scanner sc) {

        boolean salir = false;
        String transaccion;
        do {
            System.out.println("Cuanto dinero desea depositar?");
            double deposito = sc.nextDouble();
                this.saldo += deposito;
                System.out.println("Ahora quedan $" + this.saldo + " en tu cuenta");
                System.out.println("Desea realizar otro deposito? s/n");
                transaccion = sc.next();
                if (transaccion.equalsIgnoreCase("n")) {
                    salir = true;
                }


        } while (!salir);

    }
}
