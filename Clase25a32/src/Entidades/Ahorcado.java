package Entidades;

public class Ahorcado {
    private char [] palabra;
    private int letrasEncontradas=0;
    private int cantidadJugadasMaxima=5;

    public Ahorcado(String palabra) {
        this.palabra=new char[palabra.length()];
        for (int i = 0; i < this.palabra.length; i++) {
            this.palabra[i]=palabra.charAt(i);
        }
    }

    public char[] getPalabra() {
        return palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public int getCantidadJugadasMaxima() {
        return cantidadJugadasMaxima;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public void setCantidadJugadasMaxima(int cantidadJugadasMaxima) {
        this.cantidadJugadasMaxima = cantidadJugadasMaxima;
    }
    
}
