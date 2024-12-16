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
         <%
        Aposta aposta = (Aposta) request.getAttribute("aposta");
        if (aposta != null) {
    %>
        <form method="post" action="apostes">
            <input type="hidden" name="accio" value="modificar">
            <input type="hidden" name="idAposta" value="<%= aposta.getIdAposta() %>">
    </body>
</html>
