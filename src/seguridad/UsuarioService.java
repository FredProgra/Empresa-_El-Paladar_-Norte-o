/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguridad;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alfre
 */
public class UsuarioService {
    private List<Usuario> usuarios = new ArrayList<>();
    private Usuario usuarioActivo;

    // 35. Crear usuario
    public void registrarUsuario(String username, String password, Rol rol) {
        if (buscarUsuario(username) != null) {
            System.out.println("❌ El usuario ya existe.");
            return;
        }
        usuarios.add(new Usuario(username, password, rol));
        System.out.println("✅ Usuario creado correctamente: " + username + " (" + rol + ")");
    }

    // 36. Iniciar sesión
    public boolean iniciarSesion(String username, String password) {
        Usuario u = buscarUsuario(username);
        if (u != null && u.verificarPassword(password)) {
            usuarioActivo = u;
            System.out.println("🔓 Sesión iniciada como " + u.getRol() + ": " + u.getUsername());
            LoggerSistema.registrarAccion(u, "Inicio de sesión");
            return true;
        } else {
            System.out.println("❌ Usuario o contraseña incorrectos.");
            return false;
        }
    }

    // 37. Restricción por rol
    public boolean tienePermiso(Rol requerido) {
        if (usuarioActivo == null) {
            System.out.println("⚠️ No hay usuario autenticado.");
            return false;
        }
        if (usuarioActivo.getRol() == Rol.ADMIN || usuarioActivo.getRol() == requerido) {
            return true;
        } else {
            System.out.println("⛔ Acceso denegado para el rol " + usuarioActivo.getRol());
            return false;
        }
    }

    // Cerrar sesión
    public void cerrarSesion() {
        if (usuarioActivo != null) {
            LoggerSistema.registrarAccion(usuarioActivo, "Cierre de sesión");
            System.out.println("🔒 Sesión cerrada para: " + usuarioActivo.getUsername());
            usuarioActivo = null;
        }
    }

    private Usuario buscarUsuario(String username) {
        return usuarios.stream()
                .filter(u -> u.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }

    public Usuario getUsuarioActivo() {
        return usuarioActivo;
    }
}
