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
public class ApostaServlet extends HttpServlet  {
    private final ApostaService apostaService = new ApostaService();

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
            String accio = request.getParameter("accio");
             if (accio == null || accio.isEmpty()) {
            llistarApostes(request, response);
            } else if ("detall".equals(accio)) {
            mostrarDetall(request, response);
            } else if ("filtrar".equals(accio)) {
            filtrarApostes(request, response);
        }
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
        String accion = request.getParameter("accio");
        
        if ("crear".equals(accio)) {
            crearAposta(request, response);
        } else if ("modificar".equals(accio)) {
            modificarAposta(request, response);
        } else if ("esborrar".equals(accio)) {
            esborrarAposta(request, response);
        }
    }
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
        List<Aposta> listaApuestas = (ArrayList<Aposta>) getServletContext().getAttribute("listaApuestas");
        apuestaService.Mostrar(listaApuestas, request);
        request.setAttribute("apuestas",  listaApuestas);
            RequestDispatcher dispatcher = request.getRequestDispatcher("Detallesapuesta.jsp");
            dispatcher.forward(request, response);
            
          }else if ("Volver".equals(accion)) {
            List<Apuesta> listaApuestas = (List<Apuesta>) getServletContext().getAttribute("listaApuestas");
            request.setAttribute("apuestas", listaApuestas);
            RequestDispatcher dispatcher = request.getRequestDispatcher("resultat.jsp");
            dispatcher.forward(request, response);
            
          }else if ("Actualizar Apuesta".equals(accion)) {
            List<Apuesta> listaApuestas = (List<Apuesta>) getServletContext().getAttribute("listaApuestas");
            request.setAttribute("apuestas", listaApuestas);
            RequestDispatcher dispatcher = request.getRequestDispatcher("resultat.jsp");
            dispatcher.forward(request, response);
           
          } else if ("FiltrarPorUsuario".equals(request.getParameter("accion"))) {
    List<Apuesta> listaApuestas = (List<Apuesta>) getServletContext().getAttribute("listaApuestas");
    List<Apuesta> listaFiltrada = apuestaService.filtrarPorUsuario(listaApuestas, request);
    
    request.setAttribute("apuestas", listaFiltrada);
    RequestDispatcher dispatcher = request.getRequestDispatcher("apuestafiltrada.jsp");
    dispatcher.forward(request, response);
}
        
}

}
