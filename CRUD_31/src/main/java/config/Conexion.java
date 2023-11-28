/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import vista.Formulario;

/**
 *
 * @author CristianRojas
 */
public class Conexion {
        Connection con;
    public static void main(String[] args) {
        Formulario objetoformulario = new Formulario();
        objetoformulario.setVisible(true);
    }
    public Conexion() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/s17?characterEncoding=UTF-8", "root", "");

        } catch (Exception e) {
            System.out.println("Error conexion " + e);
        }
    }
    
    public Connection getConnection(){
        return con;
    }
}
