package clase9a11;

public class Ejercicio6 {
    public static void main(String[] args) {
    /*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números 
del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por teclado
y determine si este cuadrado es mágico o no. El programa deberá comprobar que
los números introducidos son correctos, es decir, están entre el 1 y el 9.*/
    int [][] matriz={{2,7,6},{9,5,1},{4,3,8}};
    
    print(3,3,matriz);
    esMagica(matriz);
    
    

    }
    public static void print(int filas, int columnas, int[][] matriz) {
        System.out.println("Matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("  " + matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static boolean esMagica(int[][] matriz) {
        boolean resultado=false;
        int sumaDP=0;
        int sumaFila=0;
        int sumaColumna=0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i==j) {
                    sumaDP+=matriz[i][j];
                }
                if (i==1) {
                    sumaFila+=matriz[i][j];
                }
                if (j==0) {
                    sumaColumna+=matriz[i][j];
                }
                
            }
        }
        if (sumaDP==sumaFila&&sumaDP==sumaColumna) {
            resultado=true;
            System.out.println("La Matriz es magica!!");
        }else{
            System.out.println("La Matriz no es magica, una pena");
        }
        
        
        return resultado;
    }
    
}
