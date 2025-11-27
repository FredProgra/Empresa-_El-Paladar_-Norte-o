/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mesas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pedidos.Pedido;
/**
 *
 * @author alfre
 */
public class MesaService {
    private List<Mesa> mesas = new ArrayList<>();
    private Map<Integer, Pedido> asignaciones = new HashMap<>();

    // 31. Registrar mesa
    public void registrarMesa(Mesa mesa) {
        mesas.add(mesa);
        System.out.println(" Mesa registrada: " + mesa);
    }

    // 32. Asignar mesa a pedido
    public boolean asignarMesa(int numeroMesa, Pedido pedido) {
        Mesa mesa = buscarMesa(numeroMesa);
        if (mesa == null) {
            System.out.println("Mesa no encontrada.");
            return false;
        }

        if (mesa.getEstado() != EstadoMesa.LIBRE) {
            System.out.println("La mesa " + numeroMesa + " no está disponible.");
            return false;
        }

        mesa.setEstado(EstadoMesa.OCUPADA);
        asignaciones.put(numeroMesa, pedido);
        System.out.println(" Pedido asignado a la mesa " + numeroMesa);
        return true;
    }

    // 33. Cambiar estado manualmente (ej. Reservada)
    public void cambiarEstadoMesa(int numeroMesa, EstadoMesa nuevoEstado) {
        Mesa mesa = buscarMesa(numeroMesa);
        if (mesa != null) {
            mesa.setEstado(nuevoEstado);
            System.out.println("🔄 Mesa " + numeroMesa + " ahora está " + nuevoEstado);
        }
    }

    // 34. Liberar mesa tras pago o cierre de pedido
    public void liberarMesa(int numeroMesa) {
        Mesa mesa = buscarMesa(numeroMesa);
        if (mesa != null) {
            mesa.setEstado(EstadoMesa.LIBRE);
            asignaciones.remove(numeroMesa);
            System.out.println(" Mesa " + numeroMesa + " liberada y lista para nuevos clientes.");
        }
    }

    // Utilidades
    public Mesa buscarMesa(int numero) {
        return mesas.stream()
                .filter(m -> m.getNumero() == numero)
                .findFirst()
                .orElse(null);
    }

    public void listarMesas() {
        System.out.println("\n--- ESTADO DE MESAS ---");
        mesas.forEach(System.out::println);
    }
}
