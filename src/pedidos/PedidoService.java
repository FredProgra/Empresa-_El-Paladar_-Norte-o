/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos;

import inventario.InventarioService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import menu.Plato;

/**
 *
 * @author alfre
 */
public class PedidoService {
     private Map<Integer, Pedido> pedidos = new HashMap<>();
    private InventarioService inventario;
    private int contadorId = 1;

    public PedidoService(InventarioService inventario) {
        this.inventario = inventario;
    }

    // 16-18. Registrar pedido
    public Pedido registrarPedido(String cliente, TipoPedido tipo, List<Plato> platos) {
        Pedido pedido = new Pedido(contadorId++, cliente, tipo);
        for (Plato p : platos) {
            pedido.agregarPlato(p);
        }
        pedidos.put(pedido.getId(), pedido);

        // Descontar insumos simuladamente
        for (Plato p : platos) {
            // Aquí podrías integrar con un mapa de ingredientes reales
            inventario.descontarInsumo("Pescado", 1);
            inventario.descontarInsumo("Limón", 2);
        }

        System.out.println("✅ Pedido registrado: " + pedido);
        return pedido;
    }

    // 19. Cambiar estado
    public void cambiarEstado(int id, EstadoPedido nuevoEstado) {
        Pedido p = pedidos.get(id);
        if (p != null) {
            p.setEstado(nuevoEstado);
            System.out.println("Estado actualizado: " + p);
        } else {
            System.out.println("Pedido no encontrado.");
        }
    }

    // 20. Modificar antes de preparar
    public void modificarPedido(int id, Plato nuevoPlato) {
        Pedido p = pedidos.get(id);
        if (p != null && p.getEstado() == EstadoPedido.EN_PREPARACION) {
            p.agregarPlato(nuevoPlato);
            System.out.println("Plato agregado al pedido: " + p);
        } else {
            System.out.println("❌ No se puede modificar un pedido ya preparado o entregado.");
        }
    }

    // 21. Cancelar pedido
    public void cancelarPedido(int id, String motivo) {
        Pedido p = pedidos.get(id);
        if (p != null) {
            p.cancelar(motivo);
            System.out.println("❌ Pedido cancelado: " + p);
        } else {
            System.out.println("Pedido no encontrado.");
        }
    }

    // Mostrar pedidos
    public void listarPedidos() {
        System.out.println("\n--- LISTA DE PEDIDOS ---");
        pedidos.values().forEach(System.out::println);
    }
}
