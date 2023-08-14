/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba.AccesoaDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        try {

            String dbUrl = "";
       
            // Establece la conexión
            connection = DriverManager.getConnection(dbUrl);

    
            TareaDAL tareaDAL = new TareaDAL(connection);
            TareaService tareaService = new TareaService((Connection) tareaDAL);

            

        } catch (SQLException e) {
           
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                   
                    e.printStackTrace();
                }
            }
        }
    }
}

