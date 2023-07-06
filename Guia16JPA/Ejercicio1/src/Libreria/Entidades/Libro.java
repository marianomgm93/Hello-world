package Libreria.Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Libro {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String titulo;
    
    private Integer anio;
    private Integer ejemplares;
    private Integer ejemplaresPrestados;
    private Integer ejemplaresRestantes;
    private long isbn;
    private boolean alta=true;
    @OneToOne
    private Autor autor;
    @OneToOne
    private Editorial editorial;

    public Libro() {
    }

    public Libro(String titulo, Integer anio, Integer ejemplares, long isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.anio = anio;
        this.ejemplares = ejemplares;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Integer getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(Integer ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public Integer getEjemplaresRestantes() {
        return ejemplaresRestantes;
    }

    public void setEjemplaresRestantes(Integer ejemplaresRestantes) {
        this.ejemplaresRestantes = ejemplaresRestantes;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    
    
}
