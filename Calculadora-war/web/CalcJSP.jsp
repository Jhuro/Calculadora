<%-- 
    Document   : CalcJSP
    Created on : 18/03/2022, 04:18:40 PM
    Author     : jupbc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="CalcServlet" method="POST">
            <input type="text" name="t1"/>
            <input type="text" name="t2"/>
            <br><br>
            <input type="submit" name="action" value="Sumar" />
            <input type="submit" name="action" value="Restar" />
            <input type="submit" name="action" value="Multiplicar" />
            <input type="submit" name="action" value="Dividir" />
            <input type="submit" name="action" value="Modulo" />
            <input type="submit" name="action" value="Elevar al cuadrado" />
            <br><br>
            <p> Para usar la función "Elevar al cuadrado" unicamente colocar un valor en la primer caja de texto </p>
        </form>
    </body>
</html>
