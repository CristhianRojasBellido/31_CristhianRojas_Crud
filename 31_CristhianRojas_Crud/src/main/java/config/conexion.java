/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import vistas.principal;

/**
 *
 * @author CristianRojas
 */
public class conexion {
    Connection con;
    public static void main(String[] args) {
    principal objetoprincipal = new principal();
    objetoprincipal.setVisible(true);
    }
    public conexion() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo2?characterEncoding=UTF-8", "root", "");

        } catch (Exception e) {
            System.out.println("Error conexion " + e);
        }
    }
    
    public Connection getConnection(){
        return con;
    }
}    
