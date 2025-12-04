/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;




import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
/**
 *
 * @author alfre
 */
public class MysqlConection {
    
private static final String URL = "jdbc:mysql://localhost:3306/bdremolinopez?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "mysqlfredo";


    public static Connection getConnection() throws SQLException {
       
 try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver no encontrado: " + e.getMessage());
            throw new SQLException(e);
        } catch (SQLException e) {
            System.out.println("Error en la conexión: " + e.getMessage());
            throw e;
        }

    }
}
