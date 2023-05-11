package Entidades;
/**
 * Perro, que tendrá como atributos: nombre, raza, edad y tamaño
 * @author Hammerforce
 */
public class Perro {
    private String nombre;
    private String Raza;
    private int edad;
    private String size;

    public Perro() {
    }

    public Perro(String nombre, String Raza, int edad, String size) {
        this.nombre = nombre;
        this.Raza = Raza;
        this.edad = edad;
        this.size = size;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Perro{");
        sb.append("nombre=").append(nombre);
        sb.append(", Raza=").append(Raza);
        sb.append(", edad=").append(edad);
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
