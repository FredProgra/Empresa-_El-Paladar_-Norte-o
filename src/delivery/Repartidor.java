/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package delivery;

/**
 *
 * @author alfre
 */
public class Repartidor {
     private int id;
    private String nombre;
    private boolean disponible;

    public Repartidor(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.disponible = true;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public boolean isDisponible() { return disponible; }

    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    @Override
    public String toString() {
        return "Repartidor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", disponible=" + (disponible ? "Sí" : "No") +
                '}'; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
