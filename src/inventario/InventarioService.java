/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

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
        insumos.put(insumo.getNombre().toLowerCase(), insumo);
        System.out.println("Insumo registrado: " + insumo);
        
        listinsumo.add(insumo);
    }
    
    
   public void registrarMovimientoInventario(MovimientoInventario mi){ movimientos.add(mi);System.out.print(mi);}

    // 12. Actualizar cantidad
    public void actualizarCantidad(String nombre, int nuevaCantidad) {
        Insumo i = insumos.get(nombre.toLowerCase());
        if (i != null) {
            i.setCantidad(nuevaCantidad);
            movimientos.add(new MovimientoInventario(nombre, TipoMovimiento.ENTRADA, nuevaCantidad));
            System.out.println("Cantidad actualizada: " + i);
        } else {
            System.out.println("Insumo no encontrado.");
        }
    }

    // 13. Descontar insumos (por pedido)
    public void descontarInsumo(String nombre, int cantidad) {
        Insumo i = insumos.get(nombre.toLowerCase());
        if (i != null) {
            if (i.getCantidad() >= cantidad) {
                i.setCantidad(i.getCantidad() - cantidad);
                movimientos.add(new MovimientoInventario(nombre, TipoMovimiento.SALIDA, cantidad));
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
