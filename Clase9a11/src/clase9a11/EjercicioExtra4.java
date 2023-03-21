package clase9a11;

import java.util.Scanner;

public class EjercicioExtra4 {

    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de alumnos");
        int n=leer.nextInt();
        double[] nota=new double[n];
        int aprobados=0;
        int desaprobados=0;
        /*Los profesores del curso de programación de Egg necesitan llevar un registro de 
    las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados 
    y desaprobados. Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos 
    prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
    Primer trabajo práctico evaluativo 10%
    Segundo trabajo práctico evaluativo 15%
    Primer Integrador 25%
    Segundo integrador 50%
    Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
    Al final del programa los profesores necesitan obtener por pantalla la cantidad de 
    aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio 
    mayor o igual al 7 de sus notas del curso.*/

        for (int i = 0; i < nota.length; i++) {
            double notaFinal= calcularNota();
            
            System.out.println("nota del alumno: " + (i+1) +" es: "+ notaFinal );
            nota[i]=notaFinal;
            //SUMAR Y PROMEDIAR ALUMNOS APROBADOS Y DESAPROBADOS
            if (nota[i]>=7) {
                aprobados++;
                
            }else{
                desaprobados++;
            }
            
        }
        System.out.println("Los alumnos aprobados son: " + aprobados+ "\nlos alumnos desaprobados son: " + desaprobados); 
    }

    public static double calcularNota() {
        double[] notas = new double[4];
        double resultado = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota para ");
            switch (i) {
                case 0:
                    System.out.println("Primer trabajo practico evaluativo");
                    notas[i] = (leer.nextFloat()) * 0.1;
                    break;
                case 1:
                    System.out.println("Segundo trabajo practico evaluativo");
                    notas[i] = (leer.nextFloat()) * 0.15;
                    break;
                case 2:
                    System.out.println("Primer integrador");
                    notas[i] = (leer.nextFloat()) * 0.25;
                    break;
                case 3:
                    System.out.println("Segundo integrador");
                    notas[i] = (leer.nextFloat()) * 0.5;
                    break;
            }
            System.out.println(notas[i]);
            
            resultado+=notas[i];
        }
        
        return resultado;

    }

}
