<%-- 
    Document   : numeros2
    Created on : 07-oct-2020, 0:17:48
    Author     : Estanis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    int desde = Integer.parseInt(request.getParameter("desde"));
    int hasta = Integer.parseInt(request.getParameter("hasta"));
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <%
            for (int i = desde; i < hasta; i++) {
        %>
        <%=i%><br>
        <%
            }
        %>
    </center>
</body>
</html>
