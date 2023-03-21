
package clase9a11;

public class Ejercicio1 {

    public static void main(String[] args) {
        int[] vector= new int[100];
        
        for (int i =0 ; i < vector.length; i++) {
            
            vector[i]=99-i;
            
        }
        for (int i : vector) {
            System.out.print(" "+vector[i]);
        }
            
        
    }
    
}
