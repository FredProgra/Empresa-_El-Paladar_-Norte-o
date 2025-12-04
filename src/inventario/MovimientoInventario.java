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
    private int id;
     private String insumo;
    private TipoMovimiento tipo;
    private double cantidad;
    private LocalDateTime fecha;

    public MovimientoInventario() {
    }

    public MovimientoInventario(int id,String insumo, TipoMovimiento tipo, double cantidad) {
    this.id=id;
        this.insumo = insumo;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.fecha = LocalDateTime.now();
    }

    public double getCantidad() {
        return cantidad;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public int getId() {
        return id;
    }

    public String getInsumo() {
        return insumo;
    }

    public TipoMovimiento getTipo() {
        return tipo;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setInsumo(String insumo) {
        this.insumo = insumo;
    }

    public void setTipo(TipoMovimiento tipo) {
        this.tipo = tipo;
    }
    

    @Override
    public String toString() {
        return "[" + fecha + "] " + tipo + " - " + insumo + ": " + cantidad; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
