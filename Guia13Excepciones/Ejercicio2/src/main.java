
public class main {
//    Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
//generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
//de rango).

    public static void main(String[] args) {
        int[] numeros = new int[3];
        try {
            for (int i = 0; i < 5; i++) {
                numeros[i] = i;
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("error: "+e.getMessage());
        }

    }

}
