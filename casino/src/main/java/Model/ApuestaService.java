/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;

      

/**
 *
 * @author isard
 */
public class ApuestaService {
public class ApuestaService {List<Apuesta>listaApuestas, int contadorID, HttpServletRequest request) {
    try {
            String nombre = request.getParameter("nombre");
            String equipo = request.getParameter("equipo");
            String resultat = request.getParameter("Resultat");
            double apuesta = Double.parseDouble(request.getParameter("apuesta"));

       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
    