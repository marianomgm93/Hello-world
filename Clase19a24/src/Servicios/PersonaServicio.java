package Servicios;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {

    private Persona[] personas = new Persona[4];

    public Persona getPersonas(int i) {
        return personas[i];
    }

    public Persona[] getPersonas() {
        return personas;
    }

    public boolean esMayorDeEdad(Persona p) {
        if (p.getEdad() < 18) {
            return false;
        } else {
            return true;
        }

    }

    public void crearPersona(Scanner sc) {
        for (int i = 0; i < this.personas.length; i++) {
            String nombre;
            int edad;
            String sexo;
            double peso;
            double altura;
            boolean menu = true;
            System.out.println("Ingrese el nombre de la Persona");
            nombre = sc.next();
            System.out.println("Ingrese edad de la persona");
            edad = sc.nextInt();
            do {
                System.out.println("ingrese sexo de la persona M(mujer)/H(hombre)/O(otro)");
                sexo = sc.next();
                if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("H") || sexo.equalsIgnoreCase("O")) {
                    menu = false;
                } else {
                    System.out.println("El caracter ingresado es invalido, intentelo nuevamente");
                }
            } while (menu);

            System.out.println("ingrese peso de la persona");
            peso = sc.nextDouble();
            System.out.println("Ingrese altura de la persona");
            altura = sc.nextDouble();
            personas[i]=new Persona();
            personas[i].setNombre(nombre);
            personas[i].setEdad(edad);
            personas[i].setSexo(sexo);
            personas[i].setAltura(altura);
            personas[i].setPeso(peso);

            System.out.println("Se ha creado correctamente la persona " + personas[i].getNombre());
        }

    }

    public int calcularIMC(Persona p) {
        double imc = (p.getPeso() / Math.pow(p.getAltura(), 2));
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }

    }
}
