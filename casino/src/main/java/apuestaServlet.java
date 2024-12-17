/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
import Model.Apuesta;
import Model.ApuestaService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author isard
 */
@WebServlet(urlPatterns = {"/apuestaServlet"})
public class apuestaServlet extends HttpServlet  {
    
    private ApuestaService apuestaService;
    @Override
    public void init() throws ServletException {
        apuestaService = new ApuestaService();
        getServletContext().setAttribute("listaApuestas", new ArrayList<Apuesta>());
        getServletContext().setAttribute("ContadorID", 0);
    }


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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet APuestaServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet APuestaServlet at " + request.getContextPath() + "</h1>");
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("submit");
        List<Apuesta> listaApuestas = (List<Apuesta>) getServletContext().getAttribute("listaApuestas");
        int contadorID = (int) getServletContext().getAttribute("ContadorID");

        switch (accion) {
            case "Enviar Apuesta":
                apuestaService.addApuesta(listaApuestas, contadorID, request);
                getServletContext().setAttribute("ContadorID", contadorID + 1);
          
             break;

            case "Borrar":
                apuestaService.Borrar(listaApuestas, request);
                break;

            case "Modificar":
                apuestaService.Mostrar(listaApuestas, request);
                redirectToPage(request, response, "EditarApuesta.jsp");
                return;

            case "Detalles":
                apuestaService.Mostrar(listaApuestas, request);
                redirectToPage(request, response, "DetallesApuesta.jsp");
                return;

            case "Actualizar Apuesta":
                apuestaService.Modificar(listaApuestas, request);
                break;
        }

        request.setAttribute("apuestas", listaApuestas);
        redirectToPage(request, response, "resultat.jsp");
    }

    private void redirectToPage(HttpServletRequest request, HttpServletResponse response, String editarApuestajsp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
            
            
            /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
  

