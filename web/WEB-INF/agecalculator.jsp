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
        <form method="POST" action="age">
            <label>Enter Your Age: </label>
            <input type="text" name="userAge" value="${userAge}">
            <br>
            <input type="submit" value="Age Next Birthday">
        </form>
        <p>${message}</p>
    </body>
</html>
