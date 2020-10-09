<%-- 
    Document   : resultados
    Created on : 09-oct-2020, 1:54:38
    Author     : Estanis
--%>
<%@page import="es.iespuertocruz.estanis.controller.Operacion"%>
<%
    double primernumero = Double.parseDouble(request.getParameter("primernumero"));
    double segundonumero = Double.parseDouble(request.getParameter("segundonumero"));
    String operador = request.getParameter("operacion");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>El restulado es:</h1>
        <fieldset style="width: 300px">
            <h3><%out.print(Operacion.CalculoResultado(primernumero, segundonumero, operador));%></h3>
        </fieldset>
    </body>
</html>
