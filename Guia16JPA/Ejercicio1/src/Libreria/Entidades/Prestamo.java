package libreria.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Prestamo implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    
    @Temporal(TemporalType.DATE)
    private Date fechaDePrestamo;
    @Temporal(TemporalType.DATE)
    private Date fechaDeDevolucion;
    @OneToOne
    private Libro libro;
    @OneToOne
    private Cliente cliente;
    private boolean alta=true;
    
    public Prestamo() {
    }

    public Prestamo(Date fechaDePrestamo, Date fechaDeDevolucion, Libro libro, Cliente cliente) {
        this.fechaDePrestamo = fechaDePrestamo;
        this.fechaDeDevolucion = fechaDeDevolucion;
        this.libro = libro;
        this.cliente = cliente;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaDePrestamo() {
        return fechaDePrestamo;
    }

    public void setFechaDePrestamo(Date fechaDePrestamo) {
        this.fechaDePrestamo = fechaDePrestamo;
    }

    public Date getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }

    public void setFechaDeDevolucion(Date fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }
    
    
}
