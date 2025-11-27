/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturacion;

import java.util.ArrayList;
import java.util.List;
import pedidos.Pedido;
import menu.Plato;

/**
 *
 * @author alfre
 */
public class FacturacionService {
     private List<Comprobante> comprobantes = new ArrayList<>();

    // 26. Calcular total automáticamente
    public double calcularTotal(Pedido pedido) {
        return pedido.getPlatos().stream()
                .mapToDouble(Plato::getPrecio)
                .sum();
    }

    // 27. Aplicar descuentos o promociones
    public double aplicarDescuento(double total, double porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) return total;
        return total - (total * (porcentaje / 100.0));
    }

    // 28–29. Registrar pago y generar comprobante
    public Comprobante generarComprobante(Pedido pedido, String tipo, TipoPago tipoPago,
                                          double descuentoPorcentaje) {
        double total = calcularTotal(pedido);
        total = aplicarDescuento(total, descuentoPorcentaje);

        Pago pago = new Pago(tipoPago, total);
        Comprobante comp = new Comprobante(tipo, pedido, total, pago);
        comprobantes.add(comp);

        System.out.println("" + tipo + " generada con total: S/ " + total);
        return comp;
    }

    // 30. Consultar comprobantes
    public void listarComprobantes() {
        System.out.println("\n---HISTORIAL DE COMPROBANTES ---");
        comprobantes.forEach(System.out::println);
    }
}
