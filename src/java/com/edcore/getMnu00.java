/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edcore;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cds-00
 */
@WebServlet(name = "getMnu00", urlPatterns = {"/getMnu00"})
public class getMnu00 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/xml;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<menu>");
            out.print("<item id='mnu00_file' text='Archivo'>");
                out.print("<item id= 'mnu00fa' text = 'Salir' />");        
                    out.print("</item>"); 
            
            out.print("<item id='mnu00_configuration' text='Configuración'>");
                out.print("<item id= 'mnu00ca' text = 'Incripciones' />");        
                out.print("<item id= 'mnu00cb' text = 'Reincripciones' />"); 
                out.print("<item id= 'mnu00cc' text = 'Calificaciones' />"); 
                out.print("<item id= 'mnu00cd' text = 'Interciclos' />"); 
                    out.print("<item id='mnu' type='separator'/>");
                out.print("<item id= 'mnu00ce' text = 'Indicadores' />");
                out.print("<item id= 'mnu00cf' text = 'Parámetros' />");
             
                out.print("<item id= 'mnu00ch' text = 'Directorio' >"); 
                out.print("<item id= 'mnu00cha' text = 'Municipios' />");
                out.print("<item id= 'mnu00cg' text = 'Localidades' />"); 
                out.print("<item id= 'mnu00chb' text = 'Manzanas' />"); 
                out.print("<item id= 'mnu00chc' text = 'Calles' />"); 
                    out.print("</item>");
                out.print("<item id= 'mnu00ci' text = 'Mensajería' />"); 
                    out.print("<item id='mnua' type='separator'/>");
                    
                out.print("<item id= 'mnu00cj' text = 'Organigrama' />"); 
                out.print("<item id= 'mnu00ck' text = 'Calendario' />"); 
                out.print("<item id= 'mnu00cl' text = 'Servicios' />"); 
                out.print("<item id= 'mnu00cm' text = 'Reportes' />"); 
                out.print("<item id= 'mnu00cn' text = 'Expedientes' />"); 
                out.print("<item id= 'mnu00co' text = 'Titulos academicos' />"); 
                    out.print("<item id='mnub' type='separator'/>");
                    
                out.print("<item id= 'mnu00cp' text = 'Áreas' />");
                out.print("<item id= 'mnu00cq' text = 'Centro de estudios' />");
                out.print("<item id= 'mnu00cr' text = 'Procesos' />");
                out.print("<item id= 'mnu00cs' text = 'Sesiones' />");
                    out.print("</item>"); 
                    
            out.print("<item id='mnu00_operation' text='Operaciones'/>");
            out.print("<item id='mnu00_web' text='Web'/>");
            out.print("<item id='mnu00_report' text='Reportes'/>");
            out.print("<item id='mnu00_security' text='Seguridad'/>");
            out.print("<item id='mnu00_help' text='Ayuda'/>");
            out.println("</menu>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
