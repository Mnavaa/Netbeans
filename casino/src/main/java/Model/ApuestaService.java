/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

      

/**
 *
 * @author isard
 */
public class ApuestaService {
        public void addApuesta {List<Apuesta>listaApuestas, int contadorID, HttpServletRequest request) {
    try {
            String nombre = request.getParameter("nombre");
            String equipo = request.getParameter("equipo");
            String resultat = request.getParameter("Resultat");
            double apuesta = Double.parseDouble(request.getParameter("apuesta"));

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
             LocalDate fecha_partido = LocalDate.parse(request.getParameter("fecha_partido"), formatter);
    
            Apuesta nuevaApuesta = new Apuesta(nombre, contadorID, resultat, fecha_partido, apuesta, equipo);
            listaApuestas.add(nuevaApuesta);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        public void Borrar(List<Apuesta> listaApuestas, HttpServletRequest request) {
        int ID = Integer.parseInt(request.getParameter("ID"));
        listaApuestas.removeIf(apuesta -> apuesta.getID() == ID);
    }

    public void Mostrar(List<Apuesta> listaApuestas, HttpServletRequest request) {
        int ID = Integer.parseInt(request.getParameter("ID"));
        for (Apuesta aposta : listaApuestas) {
            if (aposta.getID() == ID) {
                request.setAttribute("apuesta", aposta);
                break;
            }
        }
    }