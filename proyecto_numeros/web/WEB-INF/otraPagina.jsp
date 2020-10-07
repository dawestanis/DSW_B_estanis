<%-- 
    Document   : otraPagina
    Created on : 07-oct-2020, 0:28:17
    Author     : Estanis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.util.Date"%>
<%
    Date d = (Date) session.getAttribute("fechahora");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Yo recuerdo que usted llegó a las: <b><%=d%></b>
    </body>
</html>
