/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import Model.Aposta;
import Model.ApostaService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author isard
 */
@WebServlet(urlPatterns = {"/ApuestaServlet"})
public class ApuestaServlet extends HttpServlet  {
    private ApostaService apostaService;

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
@Override
public void init()throws ServletException{
    
      List<Aposta> listaAposta = new ArrayList<>();
      int ContadorID=0;
      getServletContext().setAttribute("ContadorID", ContadorID;
      getServletContext().setAttribute("listaAposta", listaAposta);
        apostaService = new ApostaService();
        
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
       // processRequest(request, response);
        String accion = request.getParameter("submit");
        
        if("Enviar Apuesta".equals(accion)){
            List<Aposta> listaAposta = (ArrayList<Aposta>) getServletContext().getAttribute("listaAposta");
            int ContadorID=(int) (int) getServletContext().getAttribute("ContadorID");
            apuestaService.addApuesta(listaApuestas, ContadorID, request);
            getServletContext().setAttribute("ContadorID", ContadorID+1);
           // ApostaService.addAposta(listaAposta, ContadorID, request);
           // getServletContext().setAttribuye("ContadorID");
           
            request.setAttribute("apuestas", listaApuestas);
            RequestDispatcher dispatcher = request.getRequestDispatcher("resultat.jsp");
            dispatcher.forward(request, response);
        }else if("Borrar".equals(accion)){
            String ID = request.getParameter("ID");
            
            List<Apuesta> listaApuestas = (ArrayList<Apuesta>) getServletContext().getAttribute("listaApuestas");
            apuestaService.Borrar(listaApuestas, request);
            request.setAttribute("apuestas",  listaApuestas);
            RequestDispatcher dispatcher = request.getRequestDispatcher("resultat.jsp");
            dispatcher.forward(request, respose);    
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
           }else if("Modificar".equals(accion)){
        List<Apuesta> listaApuestas = (ArrayList<Apuesta>) getServletContext().getAttribute("listaApuestas");
        apuestaService.Modificar(listaApuestas, request);
        request.setAttribute("apuestas",  listaApuestas);
            RequestDispatcher dispatcher = request.getRequestDispatcher("EditarApuesta.jsp");
            dispatcher.forward(request, response);
            
          }else if("Detalles".equals(accion)){
        List<Apuesta> listaApuestas = (ArrayList<Apuesta>) getServletContext().getAttribute("listaApuestas");
        apuestaService.Mostrar(listaApuestas, request);
        request.setAttribute("apuestas",  listaApuestas);
            RequestDispatcher dispatcher = request.getRequestDispatcher("Detallesapuesta.jsp");
            dispatcher.forward(request, response);
            
          }else if ("Volver".equals(accion)) {
            List<Apuesta> listaApuestas = (List<Apuesta>) getServletContext().getAttribute("listaApuestas");
            request.setAttribute("apuestas", listaApuestas);
            RequestDispatcher dispatcher = request.getRequestDispatcher("resultat.jsp");
            dispatcher.forward(request, response);
            
          else if ("Actualizar Apuesta".equals(accion)) {
            List<Apuesta> listaApuestas = (List<Apuesta>) getServletContext().getAttribute("listaApuestas");
            request.setAttribute("apuestas", listaApuestas);
            RequestDispatcher dispatcher = request.getRequestDispatcher("resultat.jsp");
            dispatcher.forward(request, response);
    }

}
