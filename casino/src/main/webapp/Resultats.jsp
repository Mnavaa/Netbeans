<%-- 
    Document   : newjsp
    Created on : 22 de nov. 2024, 17:02:04
    Author     : isard
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<head
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="apuestaServlet" method="post">
            Apuesta: <input type="number" name="ID"/><br/>
            Nom d'Usuari: <input type="text" name="nombre" /><br/>
            Enfrontament: <input type="radio" id="opcio1" name="equipo" value="equipo1">Sevilla
            <input type="radio" id="opcio2" name="equipo" value="equipo2">  Madrid<br/>
            Data del partit: <input type="date" name="fecha_partido" id="datetime" /><br/>
            Aposta econòmica: <input type="number" name="apuesta" /><br/>
            <input type="submit" name="submit" value="Enviar Apuesta"/>
        </form>
    </body>
</html>