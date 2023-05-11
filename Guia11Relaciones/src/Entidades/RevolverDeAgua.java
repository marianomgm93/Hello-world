package Entidades;
//Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
//del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
//tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
//Métodos:
//• 
//• 
//• 

public class RevolverDeAgua {

    private int posicionActual;
    private int posicionAgua;

    /**
     * llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores deben ser aleatorios.
     */
    public RevolverDeAgua() {
        siguienteChorro();
        llenarRevolver();

    }

    public void llenarRevolver() {
        this.posicionAgua = (int) (Math.random() * 7);
    }

    /**
     * mojar(): devuelve true si la posición del agua coincide con la posición actual
     *
     * @return
     */
    public boolean mojar() {
        if (this.posicionActual == this.posicionAgua) {
            return true;
        }
        return false;
    }

    /**
     * siguienteChorro(): cambia a la siguiente posición del tambor
     */
    public void siguienteChorro() {
        int posicion=0;
        for (int i = 0; i < 10; i++) {
            posicion= (int) (Math.random() * 7);
        }
        this.posicionActual =posicion;
        System.out.println("La posicion actual es: " + this.posicionActual);
    }

    /**
     * toString(): muestra información del revolver (posición actual y donde está el agua)
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RevolverDeAgua{");
        sb.append("posicionActual=").append(posicionActual);
        sb.append(", posicionAgua=").append(posicionAgua);
        sb.append('}');
        return sb.toString();
    }

}
