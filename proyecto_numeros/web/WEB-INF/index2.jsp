<%-- 
    Document   : index
    Created on : 07-oct-2020, 0:23:33
    Author     : Estanis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.util.Date"%>
<%
    Date d = (Date) session.getAttribute("fechahora");
    if (d == null) {
        d = new Date(System.currentTimeMillis());
        session.setAttribute("fechahora", d);
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Ud.llegó a las <b><%=d%><b><br>

                <a href="otraPagina.jsp"> Ir a otra página...</a>
</body>
</html>
