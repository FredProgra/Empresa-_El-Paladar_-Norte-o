/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import Model.MysqlConection;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author alfre
 */
public class MenuService {
     private List<Plato> platos = new ArrayList<>();

    // 6. Registrar nuevos platos
    public void registrarPlato(Plato plato) {
        String cadena="insert into tb_plato values(?,?,?,?,?,?)";
        try( Connection cnn=MysqlConection.getConnection();PreparedStatement ps=cnn.prepareStatement(cadena) ) {
            
            ps.setInt(1,plato.getId());
            ps.setString(2,plato.getNombre());
            ps.setDouble(3,plato.getPrecio());
            ps.setString(4,plato.getEstado());
            ps.setString(5,plato.getCategoria());
            ps.setString(6,plato.getDescripcion());
            ps.executeUpdate();
            platos.add(plato);
        System.out.println("Plato registrado en la base de datos: " + plato.getNombre());
            
        } catch (SQLException e) {System.out.println("Error de registro a la base de datos"+e.getMessage());
        }
        
        
    }

    // 7-8. Actualizar precio y descripción
    public void actualizarPlato(int id,String nombre, double nuevoPrecio,String catogria, String nuevaDescripcion) {
        for (Plato p : platos) {
            if (p.getId()==id) {
                p.setNombre(nombre);
                p.setPrecio(nuevoPrecio);
                p.setCategoria(catogria);
                p.setDescripcion(nuevaDescripcion);
                System.out.println("Plato actualizado: " + p);
                return;
            }
        }
        System.out.println("Plato no encontrado.");
    }

    // 9. Deshabilitar plato
    public void cambiarDisponibilidad(String nombre, String estado) {
        for (Plato p : platos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                p.setEstado(estado);
                System.out.println("Disponibilidad actualizada: " + p.getNombre() + " -> " +estado);
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
    
    public List<Plato> listaplatos(){
        List<Plato> lista=new ArrayList<>();
        String cadena="select  codplato,nomplato,precioplato,estadoplato,catplato,descplato from tb_plato;";
        try (Connection cnn=MysqlConection.getConnection();PreparedStatement ps=cnn.prepareStatement(cadena);ResultSet rs=ps.executeQuery()){
            while (rs.next()) {
                Plato p=new Plato();
                p.setId(rs.getInt("codplato"));
                p.setNombre(rs.getString("nomplato"));
                p.setPrecio(rs.getDouble("precioplato"));
                p.setEstado(rs.getString("estadoplato"));
                p.setCategoria(rs.getString("catplato"));
                p.setDescripcion(rs.getString("descplato"));
                lista.add(p);
                System.out.println("LISTADO DE PLATOS EN LA BASDE DE DATOS");
                
            }
           
            
            
        } catch (SQLException e) { System.out.println("Error de listado en bd"+e.getMessage());
        }
    
    
        
    
    return lista;
    
    }
    
    public void eliminarPlato(int id){
        
        platos.removeIf(p->p.getId()==id);
        System.out.println("Plato eliminado");
    
    
    }
    
    
}
