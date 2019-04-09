/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modal.Driver;
import modal.DriverDAO;

/**
 *
 * @author Garru don
 */
public class DriverLogin extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
          
            
             String  Driver_name = request.getParameter("Driver_Name");
            out.println(  Integer.parseInt(request.getParameter("Driver_Id"))+Integer.parseInt(request.getParameter("Route_Id"))+ Long.parseLong(request.getParameter("Phone_no")));
            int Driver_id    = Integer.parseInt(request.getParameter("Driver_Id"));
            int route_id = Integer.parseInt(request.getParameter("Route_Id"));
            int Phone_no = Integer.parseInt(request.getParameter("Phone_no"));

            Driver obj = new Driver();
            
            obj.setDriver_Name(Driver_name);
            obj.setDriver_Id(Driver_id);
            obj.setRoute_Id(route_id);
            obj.setPhone_no(Phone_no);
            

            DriverDAO usd= new DriverDAO();

            boolean r = usd.add(obj);
            System.out.println(r);
            if(r== true){
                response.sendRedirect("studentpanel.jsp");
            }
            else
            response.sendRedirect("Driverform.html");
            
            
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
