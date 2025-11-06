/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguridad;

import java.time.LocalDateTime;

/**
 *
 * @author alfre
 */
public class Usuario {
    private String username;
    private String password;
    private Rol rol;
    private LocalDateTime fechaRegistro;

    public Usuario(String username, String password, Rol rol) {
        this.username = username;
        this.password = password; // (En producción, usar cifrado)
        this.rol = rol;
        this.fechaRegistro = LocalDateTime.now();
    }

    public String getUsername() { return username; }
    public Rol getRol() { return rol; }

    public boolean verificarPassword(String password) {
        return this.password.equals(password);
    }

    @Override
    public String toString() {
         return "Usuario{" +
                "username='" + username + '\'' +
                ", rol=" + rol +
                ", registrado=" + fechaRegistro +
                '}';// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
