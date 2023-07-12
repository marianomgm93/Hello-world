package libreria.servicios;

import DAO.ClienteDAO;
import java.util.List;
import java.util.Scanner;
import libreria.entidades.Cliente;

public class ClienteServicio {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private ClienteDAO cdao = new ClienteDAO();

    public void crearCliente() {
        Cliente cliente = new Cliente();
        System.out.println("Ingrese documento del cliente");
        Long dni = sc.nextLong();
        cliente.setDoc(dni);
        System.out.println("Ingrese nombre del cliente");
        String nombre = sc.next();
        cliente.setNombre(nombre);
        System.out.println("Ingrese apellido del cliente");
        String apellido = sc.next();
        cliente.setApellido(apellido);
        System.out.println("Ingrese telefono del cliente");
        String telefono = sc.next();
        cliente.setTelefono(telefono);
        cdao.guardar(cliente);
    }
        public Cliente crearCliente(Long dni) {
        Cliente cliente = new Cliente();
        cliente.setDoc(dni);
        System.out.println("Ingrese nombre del cliente");
        String nombre = sc.next();
        cliente.setNombre(nombre);
        System.out.println("Ingrese apellido del cliente");
        String apellido = sc.next();
        cliente.setApellido(apellido);
        System.out.println("Ingrese telefono del cliente");
        String telefono = sc.next();
        cliente.setTelefono(telefono);
        cdao.guardar(cliente);
        return cliente;
    }

    public void editar() {
        try {
            System.out.println("Ingrese id de cliente");
            Integer id = sc.nextInt();
            Cliente cliente = cdao.buscarPorId(id);
            if (cliente != null) {
                System.out.println("Ingrese nombre del cliente");
                String nombre = sc.next();
                cliente.setNombre(nombre);
                System.out.println("Ingrese apellido del cliente");
                String apellido = sc.next();
                cliente.setApellido(apellido);
                System.out.println("Ingrese telefono del cliente");
                String telefono = sc.next();
                cliente.setTelefono(telefono);
                cdao.editar(cliente);
            } else {
                System.out.println("No existe cliente con ese id");
            }
        } catch (Exception ex) {
            System.out.println("ERROR SERVICIO: EDITAR CLIENTE");
            ex.printStackTrace();
        }
    }

    public Cliente buscarPorDNI() {
        System.out.println("Ingrese DNI del cliente");
        Long dni=sc.nextLong();
        Cliente cliente=cdao.buscarPorDNI(dni);
        System.out.println(cliente);
        return cliente;
    }
        public Cliente buscarPorDNI(Long dni) {
        Cliente cliente=cdao.buscarPorDNI(dni);
        System.out.println(cliente);
        return cliente;
    }
    
    public void buscarPN(){
        System.out.println("Ingrese nombre del cliente");
        String nombre=sc.next();
        System.out.println("Ingrese apellido del cliente");
        String apellido=sc.next();
        List<Cliente> clientes=cdao.buscarPorNombre(nombre, apellido);
        System.out.println("Los clientes con ese nombre son: ");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
        
    }

}
