<%-- 
    Document   : index
    Created on : 07-oct-2020, 0:11:41
    Author     : Estanis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String sN = request.getParameter("n");
    int n = Integer.parseInt(sN);
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <%
            for (int i = 0; i < n; i++) {
        %>
        <%=i%><br>
        <%
            }
        %>
    </center>
</body>
</html>
