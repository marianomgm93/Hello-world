
import ClasesExtra.Producto;
import java.util.Scanner;

public class EjercicioExtraProfeCaro {

    /**
     * Crear una clase llamada Producto que contenga los siguientes atributos: nombre, código, stock y precio . 
     * A continuación crear los siguientes métodos: - Método constructor vacio y constructor con todos los atributos 
     * pasados por parámetro - Método get y set para cada atributo - Método crearProducto(): pide los datos al usuario y 
     * lo guarda en los diferentes atributos - Método venderProducto(): pide al usuario que ingrese una cantidad del producto y 
     * lo mismo se debe restar del atributo stock - Método cambiarPrecio(): pide al usuario un nuevo precio y lo asigna al atributo - 
     * Método mostrarProducto(): mostrar el nombre, código, stock y precio del producto
     *
     */
    private static Scanner leer = new Scanner(System.in);
        private static Producto prod = new Producto();
        private static Producto queso = new Producto("Gruyere", "QUES1T0", 2, 2000);
        private static Producto birra = new Producto("Corona", "BIRR41", 18, 500);
    public static void main(String[] args) {
        menu();
        


        
    }
    
    public static void menu() {
        boolean menu=true;
        do {
            System.out.println("1-Crear nuevo producto\n2-vender producto\n3-cambiar precio\n4-mostrar producto\n5-Salir");
            System.out.println("Ingrese la opcion deseada");
            int opcion=leer.nextInt();
            if (opcion>0&&opcion<=5) {
                switch (opcion) {
                    case 1:
                        System.out.println("crear nuevo producto");
                        prod.crearProducto(leer);
                        break;
                    case 2:
                        System.out.println("ingrese 1 para comprar "+prod.getNombre()+"\ningrese 2 para comprar "+queso.getNombre()+"\ningrese 3 para comprar "+birra.getNombre());
                        int compra=leer.nextInt();
                        switch (compra) {
                            case 1:
                                prod.venderProducto(leer);
                                break;
                            case 2:
                                queso.venderProducto(leer);
                                break;
                            case 3:
                                birra.venderProducto(leer);
                                break;
                            default:
                                System.out.println("El numero ingresado es invalido, por favor intentelo nuevamente");
                                
                        }
                        break;
                    case 3:
                        System.out.println("ingrese 1 para cambiar precio a  "+prod.getNombre()+"\ningrese 2 cambiar precio a "+queso.getNombre()+"\ningrese 3 cambiar precio a "+birra.getNombre());
                        int nuevoPrecio=leer.nextInt();
                        switch (nuevoPrecio) {
                            case 1:
                                prod.cambiarPrecio(leer);
                                break;
                            case 2:
                                queso.cambiarPrecio(leer);
                                break;
                            case 3:
                                birra.cambiarPrecio(leer);
                                break;
                            default:
                                System.out.println("El numero ingresado es invalido, por favor intentelo nuevamente");
                                
                        }
                        break;
                    case 4:
                        System.out.println("ingrese 1 para mostrar "+prod.getNombre()+"\ningrese 2 para mostrar "+queso.getNombre()+"\ningrese 3 para mostrar "+birra.getNombre());
                        int producto=leer.nextInt();
                        switch (producto) {
                            case 1:
                                prod.mostrarProducto();
                                break;
                            case 2:
                                queso.mostrarProducto();
                                break;
                            case 3:
                                birra.mostrarProducto();
                                break;
                            default:
                                System.out.println("El numero ingresado es invalido, por favor intentelo nuevamente");
                                
                        }
                        break;
                    case 5:
                        System.out.println("Esta seguro de salir? s/n");
                        String verificacion=leer.next();
                        if (verificacion.equalsIgnoreCase("s")) {
                            menu=false;
                            
                        }else if(verificacion.equalsIgnoreCase("n")){
                            System.out.println("Volviendo al menu principal");
                        }else{
                            System.out.println("ERROR, EL CARACTER INGRESADO ES INCORRECTO, POR FAVOR VUELVA A INTENTARLO");
                        }
                        break;
                    default:
                        System.out.println("El numero ingresado es invalido, por favor intentelo nuevamente");
                }
            }
        } while (menu);
        
        
    }

}
