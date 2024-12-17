<%-- 
    Document   : Detallesapuesta
    Created on : 17 de des. 2024, 3:42:09
    Author     : isard
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Detalles de la Apuesta</title>
    </head>
    <body>
        <h1>Detalles de la Apuesta</h1>
        <% if (apuesta != null) { %>
            <ul>
                <li><strong>ID:</strong> <%= apuesta.getID() %></li>
                <li><strong>Usuario:</strong> <%= apuesta.getNombre() %></li>
                <li><strong>Equipo:</strong> <%= apuesta.getEquipo() %></li>
                <li><strong>Resultado:</strong> <%= apuesta.getResultat() %></li>
                <li><strong>Fecha del Partido:</strong> <%= apuesta.getFecha_partido() %></li>
                <li><strong>Apuesta Económica:</strong> <%= apuesta.getApuesta() %> €</li>
            </ul>
        <% } else { %>
            <p>No se encontraron detalles para esta apuesta.</p>
        <% } %>
        <form action="apuestaServlet" method="post">
            <button type="submit" name="submit" value="Volver">Volver</button>
        </form>
    </body>
</html>
