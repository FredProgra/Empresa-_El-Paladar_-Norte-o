/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mesas;

/**
 *
 * @author alfre
 */
public class Mesa {
    private int numero;
    private int capacidad;
    private EstadoMesa estado;

    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.estado = EstadoMesa.LIBRE;
    }

    public int getNumero() { return numero; }
    public int getCapacidad() { return capacidad; }
    public EstadoMesa getEstado() { return estado; }

    public void setEstado(EstadoMesa estado) { this.estado = estado; }

    @Override
    public String toString() {
         return "Mesa{" +
                "numero=" + numero +
                ", capacidad=" + capacidad +
                ", estado=" + estado +
                '}';// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
