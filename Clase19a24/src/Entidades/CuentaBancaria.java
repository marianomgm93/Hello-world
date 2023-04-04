package Entidades;

public class CuentaBancaria {
    private int numeroCuenta;
    private int dniCuenta;
    private double saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, int dniCuenta, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCuenta = dniCuenta;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getDniCuenta() {
        return dniCuenta;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDniCuenta(int dniCuenta) {
        this.dniCuenta = dniCuenta;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", dniCuenta=" + dniCuenta + ", saldoActual=" + saldoActual + '}';
    }


}
