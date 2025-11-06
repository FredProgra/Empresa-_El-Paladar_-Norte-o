/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

/**
 *
 * @author alfre
 */
public class Insumo {
     private String nombre;
    private double cantidad;
    private String unidadMedida;
    private double stockMinimo;

    public Insumo(String nombre, double cantidad, String unidadMedida, double stockMinimo) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidadMedida = unidadMedida;
        this.stockMinimo = stockMinimo;
    }

    public String getNombre() { return nombre; }
    public double getCantidad() { return cantidad; }
    public String getUnidadMedida() { return unidadMedida; }
    public double getStockMinimo() { return stockMinimo; }

    public void setCantidad(double cantidad) { this.cantidad = cantidad; }
    public void setStockMinimo(double stockMinimo) { this.stockMinimo = stockMinimo; }

    public boolean necesitaReposicion() {
        return cantidad <= stockMinimo;
    }

    @Override
    public String toString() {
        return "Insumo{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", unidad='" + unidadMedida + '\'' +
                ", stockMinimo=" + stockMinimo +
                '}'; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
 
    
}
