/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturacion;

/**
 *
 * @author alfre
 */
public class Pago {
     private TipoPago tipoPago;
    private double montoPagado;

    public Pago(TipoPago tipoPago, double montoPagado) {
        this.tipoPago = tipoPago;
        this.montoPagado = montoPagado;
    }

    public TipoPago getTipoPago() { return tipoPago; }
    public double getMontoPagado() { return montoPagado; }

    @Override
    public String toString() {
         return "Pago{" +
                "tipoPago=" + tipoPago +
                ", montoPagado=" + montoPagado +
                '}';
    }
    
}
