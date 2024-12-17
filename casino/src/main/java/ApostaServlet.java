/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
import Model.Aposta;
import Model.ApostaService;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author isard
 */
@WebServlet(urlPatterns = {"/ApostaServlet"})
public class ApostaServlet extends HttpServlet  {
    private ApostaService apostaService = new ApostaService();

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
        List<Aposta> listaApuestas = new ArrayList<>();
        int ContadorID=0;
        getServletContext().setAttribute("ContadorID", ContadorID);
        getServletContext().setAttribute("listaApuestas", listaApuestas);
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
        processRequest(request, response);
        String accion = request.getParameter("submit");
      
        
        if ("Enviar Apuesta".equals(accion)) {
           List<Aposta> listaApostas = (ArrayList<Aposta>) getServletContext().getAttribute("listaApostas");
           int ContadorID= (int)
            getServletContext().getAttribute("ContadorID");
            apostaService.addAposta(listaApostas, ContadorID, request);
            getServletContext().setAttribute("ContadorID", ContadorID+1);
            request.setAttribute("apuestas", listaApostas);
            RequestDispatcher dispatcher = request.getRequestDispatcher("resultat.jsp");
            dispatcher.forward(request, response);
        }else if("Borrar".equals(accion)){
            String ID = request.getParameter("ID");
    }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
   private void llistarApostes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Aposta> apostes = apostaService.ObtenirTotesLesApostes();
        request.setAttribute("apostes", apostes);
        RequestDispatcher dispatcher = request.getRequestDispatcher("apostes.jsp");
        dispatcher.forward(request, response);
    }
    private void mostrarDetall(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idAposta = Integer.parseInt(request.getParameter("idAposta"));
        Aposta aposta = apostaService.ObtenirApostaPerId(idAposta);
        request.setAttribute("aposta", aposta);
        RequestDispatcher dispatcher = request.getRequestDispatcher("detall.jsp");
        dispatcher.forward(request, response);
    }
       private void filtrarApostes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nomUsuari = request.getParameter("nomUsuari");
        List<Aposta> apostesFiltrades = apostaService.filtrarPerNomUsari(nomUsuari);
        request.setAttribute("apostes", apostesFiltrades);
        RequestDispatcher dispatcher = request.getRequestDispatcher("apostes.jsp");
        dispatcher.forward(request, response);
    }
       private void crearAposta(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int idAposta = Integer.parseInt(request.getParameter("idAposta"));
        String nomUsuari = request.getParameter("nomUsuari");
        String enfrontament = request.getParameter("enfrontament");
        String resultatAposta = request.getParameter("resultatAposta");
        LocalDate dataPartit = LocalDate.parse(request.getParameter("dataPartit"));
        double quantitatAposta = Double.parseDouble(request.getParameter("quantitatAposta"));

        Aposta novaAposta = new Aposta(nomUsuari, idAposta, enfrontament, resultatAposta, java.sql.Date.valueOf(dataPartit), quantitatAposta);
        apostaService.afegirAposta(novaAposta);

        response.sendRedirect("apostes");
    }
       private void modificarAposta(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int idAposta = Integer.parseInt(request.getParameter("idAposta"));
        String nomUsuari = request.getParameter("nomUsuari");
        String enfrontament = request.getParameter("enfrontament");
        String resultatAposta = request.getParameter("resultatAposta");
        LocalDate dataPartit = LocalDate.parse(request.getParameter("dataPartit"));
        double quantitatAposta = Double.parseDouble(request.getParameter("quantitatAposta"));

        Aposta apostaActualitzada = new Aposta(nomUsuari, idAposta, enfrontament, resultatAposta, java.sql.Date.valueOf(dataPartit), quantitatAposta);
        apostaService.modificarAposta(apostaActualitzada);

        response.sendRedirect("apostes");
    }
       private void esborrarAposta(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int idAposta = Integer.parseInt(request.getParameter("idAposta"));
        apostaService.esborrarAposta(idAposta);
        response.sendRedirect("apostes");      
    }

}
