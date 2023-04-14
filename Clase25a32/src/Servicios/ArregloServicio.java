package Servicios;

import java.util.Arrays;

public class ArregloServicio {

    /**
     * Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
     * @param a 
     */
        public void inicializarA(double[] a){
            for (int i = 0; i < a.length; i++) {
                a[i]=Math.random()*10;
            }
        
    }
        /**
         * Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
         * @param a 
         */
        public String mostrar(double[] a){
            return Arrays.toString(a);
        }
        
        /**
         * Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
         * @param arreglo
         */
        public void ordenar(double[] arreglo) {
        Arrays.sort(arreglo);
        for (int i = 0; i < arreglo.length / 2; i++) {
            double temp = arreglo[i];
            arreglo[i] = arreglo[arreglo.length - i - 1];
            arreglo[arreglo.length - i - 1] = temp;
        }
    }
        
    /**
     * Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 
    posiciones del arreglo B con 0.5.
     * @param a 
     */
    public void inicializarB(double[] b,double[] a){
        for (int i = 0; i < 10; i++) {
            b[i]=a[i];
        }
        Arrays.fill(b, 10, b.length, 0.5);
    }
        
}
