<%-- 
    Document   : newjsp
    Created on : 22 de nov. 2024, 17:02:04
    Author     : isard
--%>
<%@ page import="java.util.List" %>
<%@ page import="Model.Aposta" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="Model.Aposta" %>

<head
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Llistat d'Apostes</title>
    </head>
    <body>
        <h1> Llistat d'Apostes</h1>
        
    <form method="get" action="apostes">
        <input type="hidden" name="accio" value="filtrar">
        <label for="nomUsuari">Filtrar per nom d'usuari:</label>
        <input type="text" id="nomUsuari" name="nomUsuari" required>
        <button type="submit">Filtrar</button>
    </form>
          <!-- Taula amb el llistat d'apostes -->
    <table border="1" width="80%">
        <thead>
            <tr>
                <th>Nom d'Usuari</th>
                <th>Enfrontament</th>
                <th>Resultat</th>
                <th>Accions</th>
            </tr>
        </thead>
        <tbody>
        <% 
            List<Aposta> apostes = (List<Aposta>) request.getAttribute("apostes");
            if (apostes != null && !apostes.isEmpty()) {
                for (Aposta aposta : apostes) { 
        %>
              <tr>
                <td><%= aposta.getNomUsuari() %></td>
                <td><%= aposta.getEnfrontament() %></td>
                <td><%= aposta.getResultatAposta() %></td>
                <td>    
                    <a href="apostes?accio=detall&idAposta=<%= aposta.getIdAposta() %>">Detall</a> |
                    <a href="apostes?accio=modificar&idAposta=<%= aposta.getIdAposta() %>">Modificar</a> |
                    <form method="post" action="apostes" style="display:inline;">
                        <input type="hidden" name="accio" value="esborrar">
                        <input type="hidden" name="idAposta" value="<%= aposta.getIdAposta() %>">
                        <button type="submit">Esborrar</button>
                    </form>
                </td>
            </tr>
        <% 
             }
            } else { 
        %>
            <tr>
                <td colspan="4">No hi ha apostes disponibles.</td>
            </tr>
        <% } %>
         </tbody>
    </table>
           <!-- Formulari per crear una nova aposta -->
    <h2>Crear una Nova Aposta</h2>
    <form method="post" action="apostes">
        <input type="hidden" name="accio" value="crear">
        <label for="idAposta">ID Aposta:</label>
        <input type="number" id="idAposta" name="idAposta" required><br>
        <label for="nomUsuari">Nom d'Usuari:</label>
        <input type="text" id="nomUsuari" name="nomUsuari" required><br>
        <input type="text" id="nomUsuari" name="nomUsuari" required><br>
        <label for="enfrontament">Enfrontament:</label>
        <input type="text" id="enfrontament" name="enfrontament" required><br>
        <label for="resultatAposta">Resultat:</label>
        <input type="text" id="resultatAposta" name="resultatAposta" required><br>
        <label for="dataPartit">Data del Partit:</label>
        <input type="date" id="dataPartit" name="dataPartit" required><br>
        <label for="quantitatAposta">Quantitat Apostada:</label>
        <input type="number" id="quantitatAposta" name="quantitatAposta" step="0.01" required><br>
        <button type="submit">Crear</button>
    </form>
        
    </body>
</html>