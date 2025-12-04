/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos;

import Model.MysqlConection;
import inventario.InventarioService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import menu.Plato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author alfre
 */
public class PedidoService extends Pedido{
     private Map<Integer, Pedido> pedidos = new HashMap<>();
    private InventarioService inventario;
    private List<Plato> platosTemp = new ArrayList<>(); // Lista temporal
    private int contadorId = 1;
    
    
    
 public void agregarPlatoTemporal(Plato plato) {
        platosTemp.add(plato);
    }

    public List<Plato> getPlatosTemporales() {
        return platosTemp;
    }

    public void limpiarPlatosTemporales() {
        platosTemp.clear();
    }

    public Pedido registrarNuevoPedido(String cliente, TipoPedido tipo) {
        Pedido pedido = new Pedido(contadorId++, cliente, tipo, new ArrayList<>(platosTemp));
        pedidos.put(pedido.getId(), pedido);
        limpiarPlatosTemporales(); // Limpia después de crear el pedido
        return pedido;
    }


    /*public PedidoService(InventarioService inventario) {
        this.inventario = inventario;
    }*/

    // 16-18. Registrar pedido
    public Pedido registrarPedido(String cliente, TipoPedido tipo, List<Plato> platos) {
        Pedido pedido = new Pedido(contadorId++, cliente, tipo);
        String cadena="insert into tb_pedido values(?,?,?,?,?,?,?)";
        try(Connection cnn=MysqlConection.getConnection();PreparedStatement ps=cnn.prepareStatement(cadena)) {
            
        for (Plato p : platos) {
            pedido.agregarPlato(p);
        }
        pedidos.put(pedido.getId(), pedido);
            
            ps.setInt(1,pedido.getId());
            ps.setString(2,cliente);
            ps.setString(3,tipo.toString());
            ps.setString(4,pedido.getEstado().toString());
            ps.setInt(5, pedido.getPlatos().size());
            ps.setDouble(6,pedido.calcularTotal());
            ps.setString(7,pedido.getFecha().toString());
            ps.executeUpdate();
            
            System.out.println("✅ Pedido registrado en la base de datos: " + pedido);
        
            
        } catch (SQLException e) {System.out.println("✅ Error Pedido registrado en la base de datos: " + e.getMessage());
        }
        
        // Descontar insumos simuladamente
        /*for (Plato p : platos) {
            // Aquí podrías integrar con un mapa de ingredientes reales
            inventario.descontarInsumo("Pescado", 1);
            inventario.descontarInsumo("Limón", 2);
        }*/
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
    public List<Pedido> listarPedido(){
    List<Pedido>filtrada=new ArrayList<>();
        for (Pedido pedido :pedidos.values()) {
            filtrada.add(pedido);
            System.out.println(""+filtrada.toString());
        }
        return filtrada;
        
    
    }
    
    public Pedido buscarPedido(int id){
       for (Pedido p : pedidos.values()) {
        if (p.getId() == id) {
            System.out.println(""+p.toString());
            return p;
        }
    }
    return null;

    
    }
}
