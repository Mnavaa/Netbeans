<%-- 
    Document   : newjsp
    Created on : 22 de nov. 2024, 17:02:04
    Author     : isard
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        
        
    </body>
</html>