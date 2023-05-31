package Entidades;

public class Barco {
    protected String matricula;
    protected double eslora;
    protected int fabricacion;

    public Barco(String matricula, double eslora, int fabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.fabricacion = fabricacion;
    }

    
    public String getMatricula() {
        return matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public int getFabricacion() {
        return fabricacion;
    }
    
    

}
