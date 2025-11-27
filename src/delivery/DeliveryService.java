/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package delivery;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import pedidos.EstadoPedido;
import pedidos.Pedido;

/**
 *
 * @author alfre
 */
public class DeliveryService {
    private List<Repartidor> repartidores = new ArrayList<>();
    private List<Entrega> entregas = new ArrayList<>();
    private int idRepartidor = 1;

    // 22. Registrar repartidor
    public Repartidor registrarRepartidor(String nombre) {
        Repartidor r = new Repartidor(idRepartidor++, nombre);
        repartidores.add(r);
        System.out.println("Repartidor registrado: " + r);
        return r;
    }

    // 23. Asignar pedido a repartidor
    public Entrega asignarPedido(Pedido pedido) {
        Optional<Repartidor> libre = repartidores.stream()
                .filter(Repartidor::isDisponible)
                .findFirst();

        if (libre.isPresent()) {
            Repartidor r = libre.get();
            r.setDisponible(false);
            Entrega entrega = new Entrega(pedido, r);
            entregas.add(entrega);
            pedido.setEstado(EstadoPedido.LISTO);
            System.out.println("Pedido asignado a " + r.getNombre());
            return entrega;
        } else {
            System.out.println("No hay repartidores disponibles.");
            return null;
        }
    }

    // 24. Registrar entrega completada
    public void registrarEntregaCompletada(Entrega entrega) {
        entrega.registrarEntrega();
        entrega.getRepartidor().setDisponible(true);
        entrega.getPedido().setEstado(EstadoPedido.ENTREGADO);
        System.out.println(" Entrega completada: " + entrega);
    }

    // 25. Reporte de entregas
    public void generarReporte() {
        System.out.println("\n---  REPORTE DE ENTREGAS ---");
        entregas.forEach(System.out::println);

        double promedio = entregas.stream()
                .mapToDouble(Entrega::getTiempoMinutos)
                .average()
                .orElse(0);
        System.out.println("️ Tiempo promedio de entrega: " + promedio + " minutos");
    }

    // Mostrar repartidores
    public void listarRepartidores() {
        System.out.println("\n--- REPARTIDORES ---");
        repartidores.forEach(System.out::println);
    }
}
