/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba.AccesoaDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import Prueba.Entidaddenegocio.Tarea;

public class TareaService {

    private  TareaDAL tareaDAL;

    public TareaService(Connection connection) {
        this.tareaDAL = new TareaDAL(connection);
    }

    public void agregarTarea(Tarea tarea) {
        try {
            tareaDAL.agregarTarea(tarea);
        } catch (SQLException e) {
         
        }
    }

    public List<Tarea> obtenerTareas() {
        try {
            return tareaDAL.obtenerTareas();
        } catch (SQLException e) {
          
            return null;
        }
    }


}

