package Entidades;

public class BarcoAMotor extends Barco {
    private int potencia;

    public BarcoAMotor(int potencia, String matricula, double eslora, int fabricacion) {
        super(matricula, eslora, fabricacion);
        this.potencia = potencia;
    }


    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(int fabricacion) {
        this.fabricacion = fabricacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BarcoAMotor{");
        super.toString();
        sb.append("potencia=").append(potencia);
        sb.append('}');
        return sb.toString();
    }
    
}
