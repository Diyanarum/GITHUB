package koneksi;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class koneksi {
    private static Connection MySQLConfig;
    public static Connection configDB()throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3306/dbuas";
            String user = "root";
            String pass = "";

            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url, user, pass);
        }catch (SQLException e) {
            System.out.println("Connection Database Failed");
        }   
        return MySQLConfig;
    }
}
 