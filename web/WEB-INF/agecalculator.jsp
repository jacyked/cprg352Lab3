<%-- 
    Document   : agecalculator
    Created on : Jun 1, 2022, 12:45:14 PM
    Author     : Matt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST" action="calculateAge">
            <label>Enter Your Age: </label>
            <input type="number" name="age" value="${userAge}">
            <br>
        </form>
        <p>${message}</p>
    </body>
</html>
