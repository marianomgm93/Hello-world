package Servicios;

import Entidades.ParDeNumeros;

public class ParDeNumerosService {

    /**
     * Método mostrarValores que muestra cuáles son los dos números guardados.
     * @param par 
     */
    public void mostrarValores(ParDeNumeros par){
        System.out.println("numero 1= "+par.getNum1()+"\nnumero 2= "+par.getNum2());
    }
    /**
     * Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
     * @param par
     * @return 
     */
    public int devolverMayor(ParDeNumeros par){
        
        if (Integer.compare(par.getNum1(), par.getNum2())>0) {
            return par.getNum1();
        }else if(Integer.compare(par.getNum1(), par.getNum2())<0){
            return par.getNum2();
        }else{
            return 0;
        }
                
    }
    /**
     * Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. 
    Previamente se deben redondear ambos valores.
     * @param par 
     */
    public void calcularPotencia(ParDeNumeros par){
        if (devolverMayor(par)>par.getNum1()) {
            System.out.println("Potencia= "+Math.pow(par.getNum1(), devolverMayor(par)));
        }else{
            System.out.println("Potencia= "+Math.pow(par.getNum2(), devolverMayor(par)));
        }
    }
    /**
     * Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz 
    cuadrada se debe obtener el valor absoluto del número.
     * @param par 
     */
    public void calculaRaiz(ParDeNumeros par){
         if (devolverMayor(par)>par.getNum1()) {
            System.out.println("Raiz cuadrada= "+Math.sqrt(Math.sqrt(Math.pow(par.getNum1(), 2))));
        }else{
             System.out.println("Raiz cuadrada= "+Math.sqrt(Math.sqrt(Math.pow(par.getNum2(), 2))));
        }
    }
}
