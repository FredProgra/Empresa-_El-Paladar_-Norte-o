/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

import Model.MysqlConection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author alfre
 */
public class InventarioService {
     private Map<String, Insumo> insumos = new HashMap<>();
    private List<MovimientoInventario> movimientos = new ArrayList<>();
    private List<Insumo> listinsumo=new ArrayList<>();

    // 11. Registrar insumo
    public void registrarInsumo(Insumo insumo) {
        String cadena="insert into tb_insumo values(?,?,?,?,?)";
        try (Connection cnn=MysqlConection.getConnection(); PreparedStatement ps=cnn.prepareStatement(cadena)){
            ps.setInt(1,insumo.getId());
            ps.setString(2,insumo.getNombre());
            ps.setDouble(3,insumo.getCantidad());
            ps.setString(4,insumo.getUnidadMedida());
            ps.setDouble(5,insumo.getStockMinimo());
            ps.executeUpdate();
             insumos.put(insumo.getNombre().toLowerCase(), insumo);
        System.out.println("Insumo registrado en la base de datos: " + insumo);
        
        listinsumo.add(insumo);
        } catch (Exception e) {System.out.println("Error de registro en la base de datos"+e.getMessage());
        }
       
    }
    
    public void actualizarInsumo(int id,String nombre,double cantidad,String unimedida,double stockminimo){
        
        for (Insumo i: insumos.values()) {
            if(i.getId()==id){
            i.setNombre(nombre);
            i.setCantidad(cantidad);
            i.setUnidadMedida(unimedida);
            i.setStockMinimo(stockminimo);
                System.out.println("Insumo Actualizado"+i);
            }else{System.out.println("id"+id+"No existe");}
            
        }
    
    
    }
    
    
   public void registrarMovimientoInventario(MovimientoInventario mi){
       
       String cadena="insert into tb_inventario values(?,?,?,?,?)";
       try (Connection cnn=MysqlConection.getConnection(); PreparedStatement ps=cnn.prepareStatement(cadena)){
           
           ps.setInt(1,mi.getId());
           ps.setString(2,mi.getInsumo());
           ps.setString(3,mi.getTipo().toString());
           ps.setDouble(4,mi.getCantidad());
           ps.setString(5,mi.getFecha().toString());
           ps.executeUpdate();
           movimientos.add(mi);System.out.print(mi);
           System.out.println("Registro de Insumo a la base de datos");
       } catch (SQLException e) {System.out.println("Error de registro en la base de daros"+e.getMessage());}
       }

    // 12. Actualizar cantidad
    public void actualizarCantidad(int id,String nombre, int nuevaCantidad) {
        Insumo i = insumos.get(nombre.toLowerCase());
        if (i != null) {
            i.setCantidad(nuevaCantidad);
            movimientos.add(new MovimientoInventario(id,nombre, TipoMovimiento.ENTRADA, nuevaCantidad));
            System.out.println("Cantidad actualizada: " + i);
        } else {
            System.out.println("Insumo no encontrado.");
        }
    }

    // 13. Descontar insumos (por pedido)
    public void descontarInsumo(int id,String nombre, int cantidad) {
        Insumo i = insumos.get(nombre.toLowerCase());
        if (i != null) {
            if (i.getCantidad() >= cantidad) {
                i.setCantidad(i.getCantidad() - cantidad);
                movimientos.add(new MovimientoInventario(id,nombre, TipoMovimiento.SALIDA, cantidad));
                System.out.println("Descuento realizado: " + cantidad + " de " + nombre);
                if (i.necesitaReposicion()) {
                    System.out.println("⚠️ Alerta: stock bajo para " + nombre);
                }
            } else {
                System.out.println("❌ No hay suficiente stock de " + nombre);
            }
        } else {
            System.out.println("Insumo no encontrado.");
        }
    }

    // 14. Mostrar alertas de bajo stock
    public void mostrarAlertas() {
        System.out.println("\n--- ALERTAS DE STOCK BAJO ---");
        for (Insumo i : insumos.values()) {
            if (i.necesitaReposicion()) {
                System.out.println("⚠️ " + i.getNombre() + " necesita reposición (Stock: " + i.getCantidad() + ")");
            }
        }
    }

    // 15. Generar reporte de movimientos
    public void generarReporte() {
        System.out.println("\n--- REPORTE DE INVENTARIO ---");
        for (MovimientoInventario m : movimientos) {
            System.out.println(m);
        }
    }

    // Mostrar todos los insumos
    public void listarInsumos() {
        System.out.println("\n--- LISTA DE INSUMOS ---");
        for (Insumo i : insumos.values()) {
            System.out.println(i);
        }
    }
    
    public List<Insumo> ListarInsumo(){
    List<Insumo> filtrada=new ArrayList<>();
    
        for (Insumo insu: listinsumo) {
            filtrada.add(insu);
            
        }
     return filtrada;
    
    
    }
    
    
    public void eliminarInsumo(int id){
        listinsumo.removeIf(i->i.getId()==id);
        System.out.println("Insumo Eliminado");
    
    
    }
    
}
