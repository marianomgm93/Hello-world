package Entidades;
/**
 * Perro, que tendrá como atributos: nombre, raza, edad y tamaño
 * @author Hammerforce
 */
public class Perro1 {
    private String nombre;
    private Persona1 duegno;
    public Perro1() {
    }

    public Perro1(String nombre) {
        this.nombre = nombre;
        this.duegno=null;
    }

    public Perro1(String nombre, Persona1 duegno) {
        this.nombre = nombre;
        this.duegno = duegno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona1 getDuegno() {
        return duegno;
    }

    public void setDuegno(Persona1 duegno) {
        this.duegno = duegno;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + '}';
    }

}
