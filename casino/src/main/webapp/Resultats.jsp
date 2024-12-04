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
            <label for="equipo">Resultat:</label><br>
            
            <input type ="radio" id="opcio1" name="equipo" value="equipo1" required>
            <label for="opcio1">Barça</label><br>
            
            <input type ="radio" id="opcio2" name="equipo" value="equipo2" required>
            <label for="opcio2">Madrid</label><br><br>
            
                            <!--Fecha del partido-->
            <label for="datetime">Data:</label>
             <input type ="date" id="datetime" name="fecha_partido" required><br><br>
             
                            <!--Cantidad Apostada-->
            <label type="apuesta">Quantitat apostada:</label>
            
                             <!--Boton para enviar apuesta-->
            <input type ="number" id="apuesta" name="apuesta" required><br><br>
            <input type="submit" name="submit" value="Enviar Apuesta">
        </form>
    </body>
</html>