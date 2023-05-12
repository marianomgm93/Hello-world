package Entidades;

public class Carta {
    private int numero;
    private String palo;

    public Carta() {
    }

    
    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Carta{");
        sb.append("numero=").append(numero);
        sb.append(", palo=").append(palo);
        sb.append('}');
        return sb.toString();
    }
    
}
