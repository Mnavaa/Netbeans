<%-- 
    Document   : Modificar
    Created on : 17 de des. 2024, 0:51:42
    Author     : isard
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Modificar Aposta</h1>
        <form action="apuestaServlet" method="post">
            <input type="hidden" name="id" value="${apuesta.id}">
            Usuario:
                <input type="text" id="usuario" name="usuario" value="${apuesta.Nombre}"><br>
            
     Enfrontament:
            <select id="equipo" name="equipo" required>
                <option value="Barca-R.Madrid" ${apuesta.equipo == 'Barca-R.Madrid' ? 'selected' : ''}>Barca-R.Madrid</option>
                <option value="Majorca-Betis" ${apuesta.equipo == 'Mallorca- Sevilla' ? 'selected' : ''}>Mallorca-Betis</option>
                <option value="Leganes-Alaves" ${apuesta.equipo == 'Valencia-Atlético' ? 'selected' : ''}>Leganes-Alaves</option>
                <option value="Las Palmas-Getafe" ${apuesta.equipo == 'Villarreal- Celta' ? 'selected' : ''}>Las Palmas-Getafe</option>
            </select><br/>
            <br/>
            Resultat Enfrontament:
            <input type="text" id="Resultat" name="Resultat" value="${apuesta.resultat}" required/><br/>
            Data del partit:
            <input type="text" id="fecha_partido" name="fecha_partido" value="${apuesta.fechaPartido}" placeholder="dd-MM-yyyy" required/><br/>
            Aposta econòmica:
            <input type="number" id="apuesta" name="apuesta" value="${apuesta.apuesta}" step="0.01" required/><span> €</span><br/>
            <input type="submit" name="submit" value="Actualizar Apuesta"/>
</form>
        
    </body>
</html>