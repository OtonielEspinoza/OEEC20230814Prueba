/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "Tarea", urlPatterns = {"/Tarea"})
public class Tarea extends HttpServlet {

    private List<String> tareas = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Lista de Tareas</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Lista de Tareas</h1>");

        if (tareas.isEmpty()) {
            out.println("<p>No hay tareas.</p>");
        } else {
            out.println("<ul>");
            for (String tarea : tareas) {
                out.println("<li>" + tarea + "</li>");
            }
            out.println("</ul>");
        }

        out.println("<form method='post' action='" + request.getContextPath() + "/Tarea'>");
        out.println("<input type='text' name='nuevaTarea' placeholder='Nueva tarea' />");
        out.println("<input type='submit' value='Agregar' />");
        out.println("</form>");

        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nuevaTarea = request.getParameter("nuevaTarea");
        if (nuevaTarea != null && !nuevaTarea.trim().isEmpty()) {
            tareas.add(nuevaTarea);
        }
        response.sendRedirect(request.getContextPath() + "/Tarea");
    }

    @Override
    public String getServletInfo() {
        return "Servlet para manejar una lista de tareas.";
    }
}

