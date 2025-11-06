/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alfre
 */
public class ClienteService {
    
    
      private List<Cliente> clientes = new ArrayList<>();

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void actualizarCliente(String dni, String nuevoTelefono, String nuevoCorreo) {
        for (Cliente c : clientes) {
            if (c.getDni().equals(dni)) {
                c.setTelefono(nuevoTelefono);
                c.setCorreo(nuevoCorreo);
                System.out.println("Cliente actualizado: " + c);
                return;
            }
        }
        System.out.println("Cliente no encontrado.");
    }

    public void eliminarCliente(String dni) {
        clientes.removeIf(c -> c.getDni().equals(dni));
    }

    public Cliente buscarCliente(String dato) {
        for (Cliente c : clientes) {
            if (c.getNombre().equalsIgnoreCase(dato) ||
                c.getDni().equals(dato) ||
                c.getTelefono().equals(dato)) {
                return c;
            }
        }
        return null;
    }
    
    public List<Cliente> listarclienteXfiltro(String filtro){
    
     if (filtro == null || filtro.isEmpty()) {
            return new ArrayList<>(clientes);
        }

        List<Cliente> filtrada = new ArrayList<>();
        for (Cliente c : clientes) {
            if (c.getNombre().equalsIgnoreCase(filtro)) {
                filtrada.add(c);
            }
        }
        return filtrada;
    }

    public void listarClientes() {
        clientes.forEach(System.out::println);
    }
}
