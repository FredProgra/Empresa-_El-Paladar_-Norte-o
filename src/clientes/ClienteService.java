/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientes;

import Model.MysqlConection;
import java.sql.PreparedStatement;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author alfre
 */
public class ClienteService {
    
    
      private List<Cliente> clientes = new ArrayList<>();

    public void registrarCliente(Cliente cliente) {
        String cadena="insert into tb_cliente values(?,?,?,?,?,?)";
      
            
            try ( Connection cnn=MysqlConection.getConnection();
            PreparedStatement ps=cnn.prepareStatement(cadena)){

  ps.setInt(1, cliente.getId());
            ps.setString(2,cliente.getNombre());
            ps.setString(3,cliente.getApellido());
            ps.setString(4,cliente.getDni());
            ps.setString(5,cliente.getCorreo());
            ps.setString(6,cliente.getTelefono());
            ps.executeUpdate();
             clientes.add(cliente);
                System.out.println("registro existoso");

}catch(SQLException e){ System.out.println("Error al registrar cliente"+e.getMessage());}
            
            
          
                
            
           
            
            
           
       
            
        
        
    }

    public void actualizarCliente(int id,String nombre,String apellido,String dni, String correo, String numero) {
        String cadena="update tb_cliente set nomcliente=?,apelcliente=?,dnicliente=?,correocliente=?,telcliente=? where codcliente=?;";
        try(Connection cnn=MysqlConection.getConnection();PreparedStatement ps=cnn.prepareStatement(cadena)) {
            ps.setString(1,nombre);
            ps.setString(2,apellido);
            ps.setString(3,dni);
            ps.setString(4,correo);
            ps.setString(5,numero);
            ps.setInt(6, id);
            ps.executeUpdate();
            for (Cliente c : clientes) {
            if (c.getId()==id) {
                c.setNombre(nombre);
                c.setApellido(apellido);
                c.setDni(dni);
                c.setTelefono(numero);
                c.setCorreo(correo);
                System.out.println("Cliente actualizado: " + c);
                return;
            }
        }
            
            
        } catch (SQLException e) {System.out.println("Error de actualizar"+e.getMessage());
        }
        
        System.out.println("Cliente no encontrado.");
    }

    public void eliminarCliente(String dni) {
        clientes.removeIf(c -> c.getDni().equals(dni));
        
        System.out.println("Cliente eliminado");
    }

    public Cliente buscarCliente(String dato) {
        for (Cliente c : clientes) {
            if (c.getNombre().equalsIgnoreCase(dato) ||
                c.getDni().equals(dato) ||
                c.getTelefono().equals(dato)) {
                return c;
            }
        }
        return null;
    }
    
    public List<Cliente> listarclienteXfiltro(String filtro){
    
     if (filtro == null || filtro.isEmpty()) {
            return new ArrayList<>(clientes);
        }

        List<Cliente> filtrada = new ArrayList<>();
        for (Cliente c : clientes) {
            if (c.getNombre().equalsIgnoreCase(filtro)) {
                filtrada.add(c);
            }
        }
        return filtrada;
    }
    
    public List<Cliente> listarcliente(){
        String cadena="select codcliente,nomcliente,apelcliente,dnicliente,correocliente,telcliente from tb_cliente";
    
     

        List<Cliente> filtrada = new ArrayList<>();
        try (Connection cnn=MysqlConection.getConnection();PreparedStatement ps=cnn.prepareStatement(cadena);ResultSet rs=ps.executeQuery()){
            while (rs.next()) {
                Cliente c= new Cliente();

                c.setId(rs.getInt("codcliente"));
                c.setNombre(rs.getString("nomcliente"));
                c.setApellido(rs.getString("apelcliente"));
                c.setDni(rs.getString("dnicliente"));
                c.setTelefono(rs.getString("telcliente"));
                c.setCorreo(rs.getString("correocliente"));
                filtrada.add(c);
                System.out.println("Lista eejecutada en la base de datos");
                

                
            }
      
            
            
            
        } catch (Exception e) {
            System.out.println("Error de lista informacion"+e.getMessage());
        }
        
        return filtrada;
    }

    public void listarClientes() {
        clientes.forEach(System.out::println);
    }
}
