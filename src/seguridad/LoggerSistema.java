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
public class LoggerSistema {
    public static void registrarAccion(Usuario usuario, String accion) {
        System.out.println("🕒 [" + LocalDateTime.now() + "] "
                + usuario.getUsername() + " (" + usuario.getRol() + "): " + accion);
    }
    
}
