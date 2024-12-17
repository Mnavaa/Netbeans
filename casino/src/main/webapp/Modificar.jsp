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
            
     