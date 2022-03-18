/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.servlet;

import co.edu.unipiloto.session.CalcBeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jupbc
 */
@WebServlet(name = "CalcServlet", urlPatterns = {"/CalcServlet"})
public class CalcServlet extends HttpServlet {

    @EJB
    private CalcBeanLocal calcBean;
    
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
        String accion = request.getParameter("action");

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalcServlet</title>");
            out.println("</head>");
            out.println("<body>");

            int a = Integer.parseInt(request.getParameter("t1"));
            int b = 0;
            if (!accion.equals("Elevar al cuadrado")) {
                b = Integer.parseInt(request.getParameter("t2"));
            }
            
            if (accion.equals("Sumar")) {
                out.println("<h1>La suma da " + calcBean.suma(a, b).toString() + "</h1>");
            }else if(accion.equals("Restar")){
                out.println("<h1>La resta da " + calcBean.restar(a, b).toString() + "</h1>");
            }else if(accion.equals("Multiplicar")){
                out.println("<h1>La multiplicación da " + calcBean.multiplicar(a, b).toString() + "</h1>");
            }else if(accion.equals("Dividir")){
                out.println("<h1>La división da " + calcBean.dividir(a, b).toString() + "</h1>");
            }else if(accion.equals("Modulo")){
                out.println("<h1>El modulo da " + calcBean.modulo(a, b).toString() + "</h1>");
            }else{
                out.println("<h1>El cuadrado del numero da " + calcBean.elevarAlCuadrado(a).toString() + "</h1>");
            }
            out.println("<form action=\"CalcJSP.jsp\" method=\"POST\">");
            out.println("<input type=\"submit\"  value=\"Regresar\"/>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
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
