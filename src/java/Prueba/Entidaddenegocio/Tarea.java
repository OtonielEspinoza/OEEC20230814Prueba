/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba.Entidaddenegocio;

import java.time.LocalDate;

/**
 *
 * @author H
 */
public class Tarea {
    
      private String idTarea;
    private String titulo;
    private String descripcion;
    private LocalDate fechafinalizacion;
    private boolean completada;
      private int top_aux;

    public String getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(String idTarea) {
        this.idTarea = idTarea;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechafinalizacion() {
        return fechafinalizacion;
    }

    public void setFechafinalizacion(LocalDate fechafinalizacion) {
        this.fechafinalizacion = fechafinalizacion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public int getTop_aux() {
        return top_aux;
    }

    public void setTop_aux(int top_aux) {
        this.top_aux = top_aux;
    }
    
}
