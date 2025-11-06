/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alfre
 */
public class MenuService {
     private List<Plato> platos = new ArrayList<>();

    // 6. Registrar nuevos platos
    public void registrarPlato(Plato plato) {
        platos.add(plato);
        System.out.println("Plato registrado: " + plato.getNombre());
    }

    // 7-8. Actualizar precio y descripción
    public void actualizarPlato(String nombre, double nuevoPrecio, String nuevaDescripcion) {
        for (Plato p : platos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                p.setPrecio(nuevoPrecio);
                p.setDescripcion(nuevaDescripcion);
                System.out.println("Plato actualizado: " + p);
                return;
            }
        }
        System.out.println("Plato no encontrado.");
    }

    // 9. Deshabilitar plato
    public void cambiarDisponibilidad(String nombre, boolean disponible) {
        for (Plato p : platos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                p.setDisponible(disponible);
                System.out.println("Disponibilidad actualizada: " + p.getNombre() + " -> " + (disponible ? "Disponible" : "No disponible"));
                return;
            }
        }
        System.out.println("Plato no encontrado.");
    }

    // 10. Listar platos por categoría
    public void listarPorCategoria(String categoria) {
        System.out.println("\n--- Platos en la categoría: " + categoria + " ---");
        for (Plato p : platos) {
            if (p.getCategoria() == categoria) {
                System.out.println(p);
            }
        }
    }

    // Mostrar todo el menú
    public void listarMenuCompleto() {
        System.out.println("\n--- MENÚ COMPLETO ---");
        for (Plato plato : platos) {
            System.out.println(plato.toString());
            
        }
        platos.forEach(System.out::println);
    }
}
