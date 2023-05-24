package Entidades;

public class Lavadora extends Electrodomestico{
    private int carga;

    public Lavadora() {
    }

    public Lavadora(double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
    }
    

    public Lavadora(int carga, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{ precio="+super.precio+" peso="+super.peso+" consumo="+super.consumo+" color= "+super.color+ " carga=" + carga + '}';
    }

    

    
}
