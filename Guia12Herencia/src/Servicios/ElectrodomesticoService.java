package Servicios;

import Entidades.Electrodomestico;
import java.util.Scanner;

public class ElectrodomesticoService {

    /**
     * Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el objeto y no será visible.
     *
     * @param letra
     * @return
     */
    public char comprobarConsumoEnergetico(char letra) {
        if (!(letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F')) {
            return 'F';
        } else {
            return letra;
        }
    }

    /**
     * Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es, usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en minúsculas. Este método se invocará al crear el objeto y no será visible.
     *
     * @param color
     * @return
     */
    public String comprobarColor(String color) {
        if (!(color.equalsIgnoreCase("Blanco") || color.equalsIgnoreCase("Negro") || color.equalsIgnoreCase("Rojo") || color.equalsIgnoreCase("Azul") || color.equalsIgnoreCase("Gris"))) {
            return "Blanco";
        } else {
            return color;
        }
    }

    /**
     * Metodo crearElectrodomestico(): le pide la información al usuario y llena el electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al precio se le da un valor base de $1000.
     */
    public Electrodomestico crearElectrodomestico() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese color");
        String color = comprobarColor(sc.next());
        System.out.println("Ingrese consumo");
        char consumo = comprobarConsumoEnergetico(sc.next().toUpperCase().charAt(0));
        System.out.println("Ingrese peso");
        double peso = sc.nextDouble();
        Electrodomestico ele=new Electrodomestico(1000, color, consumo, peso);
        precioFinal(ele);
        return ele;
    }
//    Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
//precio. Esta es la lista de precios:
//    LETRA PRECIO
//A $1000
//B $800
//C $600
//D $500
//E $300
//F $100
//
//PESO PRECIO
//Entre 1 y 19 kg $100
//Entre 20 y 49 kg $500
//Entre 50 y 79 kg $800
//Mayor que 80 kg $1000

    protected void precioFinal(Electrodomestico ele) {

        double precioFinal = 0;
            
        switch (ele.getConsumo()) {
            case 'A':
                precioFinal += 1000;
                break;
            case 'B':
                precioFinal += 800;
                break;
            case 'C':
                precioFinal += 600;
                break;
            case 'D':
                precioFinal += 500;
                break;
            case 'E':
                precioFinal += 300;
                break;
            case 'F':
                precioFinal += 100;
                break;

        }
        if (ele.getPeso()<20) {
            precioFinal+=100;
        }else if(ele.getPeso()<50){
            precioFinal+=500;
        }else if(ele.getPeso()<80){
            precioFinal+=800;
        }else if(ele.getPeso()>=80){
            precioFinal+=1000;
        }
        ele.setPrecio(precioFinal);
    }
    
}
