/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos;



import pedidos.EstadoPedido;
import menu.Plato;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author alfre
 */
public class Pedido {
      private int id;
    private String cliente;
    private TipoPedido tipo;
    private EstadoPedido estado;
  
    private List<Plato> platos;
    
    private LocalDateTime fecha;
    private String motivoCancelacion;
     private double total;

    public Pedido() {
    }
     

    public Pedido(int id, String cliente, TipoPedido tipo,List<Plato> platos) {
        this.id = id;
        this.cliente = cliente;
        this.tipo = tipo;
        this.platos = new ArrayList<>(platos);
        this.estado = EstadoPedido.EN_PREPARACION;
        this.fecha = LocalDateTime.now();
        this.motivoCancelacion = "";
        this.total = platos.stream()
                .mapToDouble(p -> p.getPrecio())
                .sum();
    }
    public Pedido(int id, String cliente, TipoPedido tipo) {
    this.id = id;
    this.cliente = cliente;
    this.tipo = tipo;
    this.platos = new ArrayList<>();
    this.fecha = LocalDateTime.now();
    this.estado = EstadoPedido.EN_PREPARACION;
    this.total = 0;
}


    public int getId() { return id; }
    public String getCliente() { return cliente; }
    public TipoPedido getTipo() { return tipo; }
    public EstadoPedido getEstado() { return estado; }
    
    public List<Plato> getPlatos() { return platos;}
     public void recalcularTotal() {
        this.total = platos.stream()
                .mapToDouble(p -> p.getPrecio())
                .sum();
    }

    public double getTotal() {
        return total;
    }
     

    public LocalDateTime getFecha() {
        return fecha;
    }
    
    
    
    
    public String getMotivoCancelacion() { return motivoCancelacion; }

    public void agregarPlato(Plato p) { platos.add(p); }
    public void eliminarPlato(String nombre) {
        platos.removeIf(p -> p.getNombre().equalsIgnoreCase(nombre));
    }

    public void setEstado(EstadoPedido estado) { this.estado = estado; }
    public void cancelar(String motivo) {
        this.estado = EstadoPedido.CANCELADO;
        this.motivoCancelacion = motivo;
    }

    public double calcularTotal() {
        return platos.stream().mapToDouble(Plato::getPrecio).sum();
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente='" + cliente + '\'' +
                ", tipo=" + tipo +
                ", estado=" + estado +
                ", platos=" + platos.size() +
                ", total=" + calcularTotal() +
                ", fecha=" + fecha +
                (estado == EstadoPedido.CANCELADO ? ", motivo='" + motivoCancelacion + '\'' : "") +
                '}'; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
