<%-- 
    Document   : EditarApuesta
    Created on : 17 de des. 2024, 3:43:33
    Author     : isard
--%>
Apuesta aposta = (Apuesta) request.getAttribute("apuesta");
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar APuesta!</title>
    </head>
    <body>
        </head>
    <body>
        <h1>Modifica la teva aposta</h1>
        <form action="apuestaServlet" method="post">
            <!-- Campo oculto para el ID -->
            <input type="hidden" name="ID" value="<%= aposta.getID() %>">
           
            <!-- Campo nombre -->
            <label for="nombre">Usuari:</label>
            <input type="text" id="nombre" name="nombre" value="<%= aposta.getNombre() %>" required><br><br>
           <!-- Campo enfrontament -->
            <label for="equipo">Enfrontament:</label>
            <input type="text" id="equipo" name="equipo" value="<%= aposta.getEquipo() %>" required><br><br>
           
            <!-- Campo resultat -->
            <label for="Resultat">Resultat Enfrontament:</label>
            <input type="text" id="Resultat" name="Resultat" value="<%= aposta.getResultat() %>" required><br><br>
           
            <!-- Campo fecha_partido -->
            <label for="fecha_partido">Data del partit:</label>
            <input type="date" id="fecha_partido" name="fecha_partido" value="<%= aposta.getFecha_partido() %>" required><br><br>
             <!-- Campo apuesta económica -->
            <label for="apuesta">Aposta econòmica:</label>
            <input type="number" id="apuesta" name="apuesta" step="0.01" value="<%= aposta.getApuesta() %>" required> €<br><br>
           
            <!-- Botón para actualizar -->
            <button type="submit" name="submit" value="Actualizar Apuesta">Actualizar Apuesta</button>
        </form>
           
    </body>
</html>
