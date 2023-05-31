package Entidades;

import Interfaces.calculosFormas;

public class Circulo implements calculosFormas{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea(){
        return PI*(Math.pow(this.radio,2));
    }
    @Override
    public double calcularPerimetro(){
        return PI*this.radio*2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Circulo{");
        sb.append("radio=").append(radio);
        sb.append('}');
        return sb.toString();
    }
    
}
