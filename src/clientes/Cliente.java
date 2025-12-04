/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientes;

/**
 *
 * @author alfre
 */
public class Cliente {
    private int id;
     private String nombre;
     private String apellido;
    private String dni;
    private String telefono;
    private String correo;

    public Cliente(int id,String nombre,String apellido, String dni, String telefono, String correo) {
        this.id=id;
        this.nombre = nombre;
        this.apellido=apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.correo = correo;
    }

    public Cliente() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public String getTelefono() { return telefono; }
    public String getCorreo() { return correo; }

    public String getApellido() {
        return apellido;
    }
    

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public void setCorreo(String correo) { this.correo = correo; }
    
    

    @Override
    public String toString() {
         return "Cliente{" + "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' + '}';// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
