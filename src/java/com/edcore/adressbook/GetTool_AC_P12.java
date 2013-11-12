/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edcore.adressbook;

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
@WebServlet(name = "GetTool_AC_P12", urlPatterns = {"/addressbook/towns/GetTool_AC_P12"})
public class GetTool_AC_P12 extends HttpServlet {

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
            out.println("<toolbar>");
            out.print("<item id='new' type='button' img='icon_add.png' imgdis='icon_add.png' title= 'Nuevo Municipio'/>");
            out.print("<item id='edit' type='button' img='icon_edit.png' imgdis='icon_edit.png' title= 'Editar Municipio'/>");
            out.print("<item id='delete' type='button' img='icon_delete.png' imgdis='icon_delete.png' title= 'Eliminar Municipio'/>");
            out.print("<item id='sep01' type='separator'/>");
            out.print("<item id='aceptRequest' type='button' img='icon_aceptRequest.png' imgdis='icon_aceptRequest.png' title= 'Aceptar peticion de registro'/>");
            out.print("<item id='sep01' type='separator'/>");
            out.println("</toolbar>");
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
