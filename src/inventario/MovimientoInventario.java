/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

import inventario.TipoMovimiento;
import java.time.LocalDateTime;

/**
 *
 * @author alfre
 */
public class MovimientoInventario {
     private String insumo;
    private TipoMovimiento tipo;
    private double cantidad;
    private LocalDateTime fecha;

    public MovimientoInventario() {
    }

    public MovimientoInventario(String insumo, TipoMovimiento tipo, double cantidad) {
        this.insumo = insumo;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.fecha = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "[" + fecha + "] " + tipo + " - " + insumo + ": " + cantidad; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
