package Servicios;

import Entidades.Raices;

public class RaicesServicio {

    /**
     * Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
     *
     * @param root
     * @return
     */
    public double getDiscriminante(Raices root) {

        return Math.pow(root.getB(), 2) - 4 * root.getA() * root.getC();
    }

    /**
     * Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
     *
     * @param root
     * @return
     */
    public boolean tieneRaices(Raices root) {

        return this.getDiscriminante(root) > 0;
    }

    /**
     * Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
     *
     * @param root
     * @return
     */
    public boolean tieneRaiz(Raices root) {

        return this.getDiscriminante(root) == 0;
    }

    /**
     * Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
     *
     * @param root
     */
    public void obtenerRaices(Raices root) {
        if (this.tieneRaices(root) == true) {
            System.out.println((-root.getB() + Math.sqrt((Math.pow(root.getB(), 2) - (4 * root.getA() * root.getC()))) / (2 * root.getA())));
            System.out.println((-root.getB() - Math.sqrt((Math.pow(root.getB(), 2) - (4 * root.getA() * root.getC()))) / (2 * root.getA())));
        } else {
            System.out.println("El polinomio no tiene raices");
        }
    }

    /**
     * Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
     *
     * @param root
     */
    public void obtenerRaiz(Raices root) {
        if (this.tieneRaiz(root)) {
            System.out.println((-root.getB() + Math.sqrt((Math.pow(root.getB(), 2) - (4 * root.getA() * root.getC()))) / (2 * root.getA())));
        } else {
            System.out.println("El Polinomio no tiene Raices");
        }
    }

    /**
     * Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
     *
     * @param root
     */
    public void calcular(Raices root) {
        if (this.tieneRaices(root)) {
            this.obtenerRaices(root);
        } else if (this.tieneRaiz(root)) {
            this.obtenerRaiz(root);
        } else {
            System.out.println("El Polinomio no tiene raices");
        }
    }
}
