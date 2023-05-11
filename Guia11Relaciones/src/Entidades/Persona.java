package Entidades;
//Persona con atributos: nombre, apellido, edad, documento y Perro.
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int documento;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, int documento, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", edad=").append(edad);
        sb.append(", documento=").append(documento);
        sb.append(", perro=").append(perro.toString());
        sb.append('}');
        return sb.toString();
    }
    
}
