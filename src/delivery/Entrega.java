/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package delivery;

import pedidos.Pedido;
import delivery.Repartidor;
import java.time.Duration;
import java.time.LocalDateTime;

/**
 *
 * @author alfre
 */
public class Entrega {
    private Pedido pedido;
    private Repartidor repartidor;
    private LocalDateTime horaSalida;
    private LocalDateTime horaEntrega;
    private double tiempoMinutos;

    public Entrega(Pedido pedido, Repartidor repartidor) {
        this.pedido = pedido;
        this.repartidor = repartidor;
        this.horaSalida = LocalDateTime.now();
    }

    public void registrarEntrega() {
        this.horaEntrega = LocalDateTime.now();
        this.tiempoMinutos = Duration.between(horaSalida, horaEntrega).toMinutes();
    }

    public Pedido getPedido() { return pedido; }
    public Repartidor getRepartidor() { return repartidor; }
    public double getTiempoMinutos() { return tiempoMinutos; }

    @Override
    public String toString() {
         return "Entrega{" +
                "pedido=" + pedido.getId() +
                ", repartidor='" + repartidor.getNombre() + '\'' +
                ", tiempo=" + tiempoMinutos + " min" +
                '}';// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
