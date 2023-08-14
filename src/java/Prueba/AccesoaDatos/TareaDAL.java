/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba.AccesoaDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Prueba.Entidaddenegocio.Tarea;

public class TareaDAL {

    private Connection connection;

    public TareaDAL(Connection connection) {
        this.connection = connection;
    }

    public void agregarTarea(Tarea tarea) throws SQLException {
        String query = "INSERT INTO tareas (idTarea, titulo, descripcion, fechafinalizacion, completada, top_aux) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, tarea.getIdTarea());
            statement.setString(2, tarea.getTitulo());
            statement.setString(3, tarea.getDescripcion());
            statement.setDate(4, java.sql.Date.valueOf(tarea.getFechafinalizacion()));
            statement.setBoolean(5, tarea.isCompletada());
            statement.setInt(6, tarea.getTop_aux());
            statement.executeUpdate();
        }
    }

    public List<Tarea> obtenerTareas() throws SQLException {
        List<Tarea> tareas = new ArrayList<>();
        String query = "SELECT * FROM tareas";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Tarea tarea = new Tarea();
                tarea.setIdTarea(resultSet.getString("idTarea"));
                tarea.setTitulo(resultSet.getString("titulo"));
                tarea.setDescripcion(resultSet.getString("descripcion"));
                tarea.setFechafinalizacion(resultSet.getDate("fechafinalizacion").toLocalDate());
                tarea.setCompletada(resultSet.getBoolean("completada"));
                tarea.setTop_aux(resultSet.getInt("top_aux"));
                tareas.add(tarea);
            }
        }
        return tareas;
    }

    
}

