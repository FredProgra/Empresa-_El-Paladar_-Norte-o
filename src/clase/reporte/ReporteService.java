/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.reporte;

import pedidos.EstadoPedido;
import pedidos.Pedido;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 *
 * @author alfre
 */
public class ReporteService {
    private List<Pedido> pedidos;

    public ReporteService(List<Pedido> pedidos) {
        this.pedidos = pedidos;}
         public void generarReporte(String tipo) {
        switch (tipo.toLowerCase()) {
            case "diario":
                generarReporteDiario();
                break;
            case "semanal":
                generarReporteSemanal();
                break;
            case "mensual":
                generarReporteMensual();
                break;
            default:
                System.out.println("❌ Tipo de reporte no válido. Usa: diario, semanal o mensual.");
        }
    }

    private void generarReporteDiario() {
        LocalDate hoy = LocalDate.now();
        List<Pedido> pedidosDia = filtrarPorFecha(hoy);

        System.out.println("\n📅 REPORTE DIARIO (" + hoy + ")");
        mostrarResumen(pedidosDia);
    }

    private void generarReporteSemanal() {
        LocalDate hoy = LocalDate.now();
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        int semanaActual = hoy.get(weekFields.weekOfWeekBasedYear());

        List<Pedido> pedidosSemana = pedidos.stream()
                .filter(p -> p.getFecha().get(weekFields.weekOfWeekBasedYear()) == semanaActual)
                .collect(Collectors.toList());

        System.out.println("\n🗓️ REPORTE SEMANAL (Semana " + semanaActual + ")");
        mostrarResumen(pedidosSemana);
    }

    private void generarReporteMensual() {
        LocalDate hoy = LocalDate.now();
        int mes = hoy.getMonthValue();
        int anio = hoy.getYear();

        List<Pedido> pedidosMes = pedidos.stream()
                .filter(p -> p.getFecha().getMonthValue() == mes && p.getFecha().getYear() == anio)
                .collect(Collectors.toList());

        System.out.println("\n📆 REPORTE MENSUAL (" + hoy.getMonth() + " " + anio + ")");
        mostrarResumen(pedidosMes);
    }

    private List<Pedido> filtrarPorFecha(LocalDate fecha) {
        return pedidos.stream()
                .filter(p -> p.getFecha().toLocalDate().equals(fecha))
                .collect(Collectors.toList());
    }

    private void mostrarResumen(List<Pedido> lista) {
        double totalVentas = lista.stream()
                .filter(p -> p.getEstado() == EstadoPedido.ENTREGADO)
                .mapToDouble(p -> p.getTotal())
                .sum();

        long pedidosEntregados = lista.stream()
                .filter(p -> p.getEstado() == EstadoPedido.ENTREGADO)
                .count();

        System.out.println("📋 Pedidos procesados: " + lista.size());
        System.out.println("✅ Pedidos entregados: " + pedidosEntregados);
        System.out.println("💰 Total de ventas: S/ " + totalVentas);
    }
}
