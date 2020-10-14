<%-- 
    Document   : Calculadora
    Created on : 13-oct-2020, 23:35:45
    Author     : Estanislao Sánchez Martín
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>Calculator!</h1>

        <fieldset style="width: 300px">
        <form action="Operaciones" method="POST">
            Numero1 <input type="text" name="num1"><br><br>
            Numero2 <input type="text" name="num2"><br><br>

            <label for="operaciones"> Elige una operación</label>
            <select name="operaciones" id="operaciones">
                <option value="sumar"> Sumar </option>
                <option value="restar"> Restar </option>
                <option value="dividir"> Dividir </option>
                <option value="multiplicar"> Multiplicar </option>
            </select><br><br>

            <input type="submit" value="Calcular">
        </form>
        </fieldset>
    </center>
</body>
</html>
