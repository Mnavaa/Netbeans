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
                <option value="Majorca-Betis" ${apuesta.equipo == 'Majorca-Betis' ? 'selected' : ''}>Mallorca-Betis</option>
                <option value="Leganes-Alaves" ${apuesta.equipo == 'Leganes-Alaves' ? 'selected' : ''}>Leganes-Alaves</option>
                <option value="Las Palmas-Getafe" ${apuesta.equipo == 'Las Palmas-Getafe' ? 'selected' : ''}>Las Palmas-Getafe</option>
            </select><br/>
            <br/>