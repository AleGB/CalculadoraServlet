<%-- 
    Document   : vista
    Created on : 31/08/2017, 07:59:20 AM
    Author     : Karla Alejandra Gracia Barajas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="contr" onsubmit="">
            <input type="number" name="Num1" id="Num1" placeholder="Escriba un número" />
            <input type="number" name="Num2" id="Num2" placeholder="Escriba otro número" />
            <p> elige una operación</p>
            <input  type="submit" name="op" id="sum" value="+" />
            <input  type="submit" name="op" id="res" value="-" />
            <input  type="submit" name="op" id="mul" value="*" />
            <input  type="submit" name="op" id="div" value="/" />
        </form>
    </body>
</html>
