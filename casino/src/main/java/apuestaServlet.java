/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
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
   @Override
    public void init() throws ServletException {
        // Inicializar la lista de usuarios en el contexto de la aplicación 
        List<Apuesta> listaApuestas = new ArrayList<>();
        int ContadorID=0;
        getServletContext().setAttribute("ContadorID", ContadorID);
        getServletContext().setAttribute("listaApuestas", listaApuestas);
        apostaService = new ApuestaService();
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
        String accion = request.getParameter("submit");
      
        
        if ("Enviar Apuesta".equals(accion)) {
           List<Apuesta> listaApostas = (ArrayList<Apuesta>) getServletContext().getAttribute("listaApostas");
           int ContadorID= (int)
            getServletContext().getAttribute("ContadorID");
            apostaService.addAposta(listaApostas, ContadorID, request);
            getServletContext().setAttribute("ContadorID", ContadorID+1);
            request.setAttribute("apuestas", listaApostas);
            RequestDispatcher dispatcher = request.getRequestDispatcher("resultat.jsp");
            dispatcher.forward(request, response);
        }else if("Borrar".equals(accion)){
            String ID = request.getParameter("ID");
            
            List<Apuesta> listApostas = (ArrayList<Apuesta>) getServletContext().getAttribute("listaApostas");
            apostaService.Borrar(listApostas, request);
            request.setAttribute("apuestas",  listApostas);
            RequestDispatcher dispatcher = request.getRequestDispatcher("resultat.jsp");
            dispatcher.forward(request, response);
            
        }else if("Modificar".equals(accion)){
        List<Apuesta> listaApostas = (ArrayList<Apuesta>) getServletContext().getAttribute("listaApostas");
        apostaService.Modificar(listaApostas, request);
        request.setAttribute("apostas",  listaApostas);
            RequestDispatcher dispatcher = request.getRequestDispatcher("EditarApuesta.jsp");
            dispatcher.forward(request, response);
        }else if("Detalles".equals(accion)){
        List<Apuesta> listaApuestas = (ArrayList<Apuesta>) getServletContext().getAttribute("listaApostas");
        apostaService.Mostrar(listaApuestas, request);
        request.setAttribute("apostas",  listaApuestas);
            RequestDispatcher dispatcher = request.getRequestDispatcher("Detallesapuesta.jsp");
            dispatcher.forward(request, response);
         }else if ("Volver".equals(accion)) {
            List<Apuesta> listaApuestas = (List<Apuesta>) getServletContext().getAttribute("listaAposta");
            request.setAttribute("apostas", listaApuestas);
            RequestDispatcher dispatcher = request.getRequestDispatcher("resultat.jsp");
            dispatcher.forward(request, response);
    }else if ("Actualizar Apuesta".equals(accion)) {
            List<Apuesta> listaApuestas = (List<Apuesta>) getServletContext().getAttribute("listaAposta");
            request.setAttribute("apostas", listaApuestas);
            RequestDispatcher dispatcher = request.getRequestDispatcher("resultat.jsp");
            dispatcher.forward(request, response);
} else if ("FiltrarPorUsuario".equals(request.getParameter("accion"))) {   
     List<Apuesta> listaApostas = (List<Apuesta>) getServletContext().getAttribute("listaAposta");
    List<Apuesta> listaFiltrada = apostaService.filtrarPorUsuario(listaApostas, request);
    request.setAttribute("apostas", listaFiltrada);
    RequestDispatcher dispatcher = request.getRequestDispatcher("apostastafiltrada.jsp");
    dispatcher.forward(request, response);
}
}}
            
            
            
            /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
  

