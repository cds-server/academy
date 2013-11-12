package com.edcore.adressbook;

import com.edcore.security.MySqlConexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
* <b>DESSA</b> - www.dessa.com<br>
* Descripcion: Genera la estructura XML de las materias del plan de estudios
* @author <br>Gabriel Cisneros Landeros<br>
*/
@WebServlet(name = "GetTowns", urlPatterns = {"/addressbook/towns/GetTowns"})
public class GetTowns extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/xml;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        MySqlConexion db = new MySqlConexion();
        Connection con;
        ResultSet rs;
        PreparedStatement ps;
        try {
            con = db.open();
            out.print("<data>");
            ps = con.prepareStatement("SELECT addr_IdTown, estado, municipio,status FROM View_AC_P12_01");
            rs = ps.executeQuery();
            while(rs!= null && rs.next()){
                out.print("<item id='"+rs.getString("addr_IdTown")+"'><estado>"+rs.getString("estado")+"</estado><municipio>"+rs.getString("municipio")+"</municipio><status>"+rs.getString("status")+"</status></item>");
            }
            rs.close();
            out.print("</data>");
            db.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GetTowns.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GetTowns.class.getName()).log(Level.SEVERE, null, ex);
        }

    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}


