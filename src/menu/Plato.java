/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import java.awt.List;

/**
 *
 * @author alfre
 */
public class Plato {
    private int id;
     private String nombre;
    private String descripcion;
   
    private double precio;
    private  String estado;
    private String categoria;
    

    public Plato() {
    }
    

    public Plato(int id,String nombre, String descripcion, double precio, String categoria) {
        this.nombre = nombre;
        this.id=id;
        this.descripcion = descripcion;
        
        this.precio = precio;
        this.estado ="Disponible"; // Por defecto está disponible
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    

    // Getters y Setters
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    
    public double getPrecio() { return precio; }
    
    public String getCategoria() { return categoria; }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setPrecio(double precio) { this.precio = precio; }
    
    public void setCategoria(String categoria) { this.categoria = categoria; }

    @Override
    public String toString() {
         return "Plato{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                
                ", precio=" + precio +
                ", disponible=" + estado +
                ", categoria=" + categoria +
                '}';
    }
    
    
    
}
