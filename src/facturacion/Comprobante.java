/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturacion;

import facturacion.Pago;
import pedidos.Pedido;
import java.time.LocalDateTime;

/**
 *
 * @author alfre
 */
public class Comprobante {
     private static int contador = 1;
    private int id;
    private String tipo; // Boleta o Factura
    private Pedido pedido;
    private double total;
    private LocalDateTime fechaEmision;
    private Pago pago;

    public Comprobante(String tipo, Pedido pedido, double total, Pago pago) {
        this.id = contador++;
        this.tipo = tipo;
        this.pedido = pedido;
        this.total = total;
        this.fechaEmision = LocalDateTime.now();
        this.pago = pago;
    }

    public int getId() { return id; }
    public String getTipo() { return tipo; }
    public Pedido getPedido() { return pedido; }
    public double getTotal() { return total; }
    public LocalDateTime getFechaEmision() { return fechaEmision; }

    @Override
    public String toString() {
        return "Comprobante{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", total=" + total +
                ", fecha=" + fechaEmision +
                ", pago=" + pago +
                '}'; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
