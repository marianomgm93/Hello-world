package Entidades;

public class Yate extends Barco {
    private int potencia;
    private int camarotes;

    public Yate(int potencia, int camarotes, String matricula, double eslora, int fabricacion) {
        super(matricula, eslora, fabricacion);
        this.potencia = potencia;
        this.camarotes = camarotes;
    }


    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
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
        sb.append("Yate{");
        super.toString();
        sb.append("potencia=").append(potencia);
        sb.append(", camarotes=").append(camarotes);
        sb.append('}');
        return sb.toString();
    }
    
}
