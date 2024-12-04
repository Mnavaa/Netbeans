<%-- 
    Document   : newjsp
    Created on : 22 de nov. 2024, 17:02:04
    Author     : isard
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<head
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Apuestas DWEC</title>
    </head>
    <body>
        <h1> Apuesta de los fifes</h1>
        <form action="apuestaServlet" method="post">
                    <!--ID usuario-->
            <label for="ID">Usuari:</label>
            <input type ="number" id="ID" name="ID" required><br><br>
                     <!--Nombre del partido-->
            <label for="nombre">Partit:</label>
            <input type ="text" id="nombre" name="nombre" required><br><br>
                      <!--Opciones del resultado del partido :D-->
                     
            Resultat: <input type="radio" id="opcio1" name="equipo" value="equipo1">Sevilla
            <input type="radio" id="opcio2" name="equipo" value="equipo2">  Madrid<br/>
            Datat: <input type="date" name="fecha_partido" id="datetime" /><br/>
            Quantitat apostada: <input type="number" name="apuesta" /><br/>
            <input type="submit" name="submit" value="Enviar Apuesta"/>
        </form>
    </body>
</html>