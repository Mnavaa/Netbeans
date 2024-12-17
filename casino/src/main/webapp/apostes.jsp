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
        <h1> Afegir Aposta</h1>
        <form action="apostaServlet" method="post">
        Nom del Jugador: <input type="text" name="jugador" placeholder="Nom d'usuari" required/><br/>
     <!-- Selección del enfrentamiento -->
            Enfrontament:
            <select name="partit">
                <option value="Barcelona-Real Madrid">Barcelona vs Real Madrid</option>
             <option value="Mallorca-Sevilla">Mallorca vs Sevilla</option>
                <option value="Valencia-Atlético">Valencia vs Atlético</option>
                <option value="Villarreal-Celta">Villarreal vs Celta</option>
            </select>
            <br/>
            
            Resultat del Partit: <input type="text" name="resultat" placeholder="Ex: 2-1" required/><br/>
            
           
            Data del Matx: <input type="text" name="data" placeholder="dd-MM-yyyy" required/><br/>
            
            
            Import de l'Aposta: <input type="number" name="import" step="0.01" required/><span>€</span><br/>
            
            <input type="submit" name="submit" value="Registrar Aposta"/>
        </form>
    </body>
</html>