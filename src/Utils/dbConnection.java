/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author hirag
 */
public class dbConnection {
    private static Connection conn;
    private static Statement stm;
    private static ResultSet rs;
    
    public static Connection getConn(){
        String dbUsername = "root";
        String dbPassword = "";
        String dbName = "kulaanku";
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/"+ dbName, dbUsername, dbPassword);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error " + e.toString());
        }
        return conn;
    }
    
    public static ResultSet getData(String query){
        try{
            stm = getConn().createStatement();
            rs = stm.executeQuery(query);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error " + e.toString());
        }
        
        return rs;
    }
}
