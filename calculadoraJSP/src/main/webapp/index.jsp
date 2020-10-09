<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="resultados.jsp">
            Numero-1: <input type="text" name="primernumero"><br><!-- comment -->
            Numero-2: <input type="text" name="segundonumero"><br><!-- comment -->
            
            <label>Seleciona una opcion:</label>
            
            <select name="operacion" id="operacion">
                <option value="sumar">Sumar</opcion>
                <option value="restar">Restar</option>
                <option value="multiplicar">Multiplicar</option>
                <option value="dividir">Dividir</option>
            </select>
            
            <input type="submit" value="Calcular"><br>
        </form>
    </body>
</html>
