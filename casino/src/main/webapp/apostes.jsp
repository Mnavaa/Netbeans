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
          <!-- Taula amb el llistat d'apostes -->
    <table border="1" width="80%">
        <thead>
            <tr>
                <th>Nom d'Usuari</th>
                <th>Enfrontament</th>
                <th>Resultat</th>
                <th>Accions</th>
            </tr>
        </thead>
        <tbody>
        <% 
            List<Aposta> apostes = (List<Aposta>) request.getAttribute("apostes");
            if (apostes != null && !apostes.isEmpty()) {
                for (Aposta aposta : apostes) { 
        %>
              <tr>
                <td><%= aposta.getNomUsuari() %></td>
                <td><%= aposta.getEnfrontament() %></td>
                <td><%= aposta.getResultatAposta() %></td>
                <td>
                    <a href="apostes?accio=detall&idAposta=<%= aposta.getIdAposta() %>">Detall</a> |
                    <a href="apostes?accio=modificar&idAposta=<%= aposta.getIdAposta() %>">Modificar</a> |
                    <form method="post" action="apostes" style="display:inline;">
                        <input type="hidden" name="accio" value="esborrar">
                        <input type="hidden" name="idAposta" value="<%= aposta.getIdAposta() %>">
                        <button type="submit">Esborrar</button>
                    </form>
                </td>
            </tr>
        <% 
            
           
        
    </body>
</html>