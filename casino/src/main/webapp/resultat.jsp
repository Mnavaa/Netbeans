<%-- 
    Document   : resultat
    Created on : 17 de des. 2024, 3:46:30
    Author     : isard
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultat Aposta</title>
    </head>
    <body>
        <h1>Llista d'apostes</h1>
        <%
            List<Apuesta> listaApuestas = (List<Apuesta>) request.getAttribute("apuestas");
            if (listaApuestas != null) {
                for (Apuesta aposta : listaApuestas) {
        %>
            <li>
                ID: <%= aposta.getID() %>, Usuari: <%= aposta.getNombre() %>, Equip: <%= aposta.getEquipo() %>,
                Resultat: <%= aposta.getResultat() %>, Data: <%= aposta.getFecha_partido() %>,
                Quantitat: <%= aposta.getApuesta() %> €
                <form action="apuestaServlet" method="post">
                    <input type="hidden" name="ID" value="<%= aposta.getID() %>"/>
                    <input type="submit" name="submit" value="Borrar"/>
                    <input type="submit" name="submit" value="Detalles"/>
                    <input type="submit" name="submit" value="Modificar"/>
                </form>
            </li>
        <%
                }
            } else {
        %>
            <li>No hi ha apostes registrades.</li>
        <%
            }
        %>
    </ul>
    <a href="Apuesta.jsp">Afegir nova aposta</a>
    <form action="apuestaServlet" method="post">
        <input type="text" name="nombre" placeholder="Filtrar per usuari" required/>
        <input type="submit" name="submit" value="FiltrarPorUsuario"/>
    </form>
    </body>
</html>
