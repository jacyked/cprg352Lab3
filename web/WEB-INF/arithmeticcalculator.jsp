<%-- 
    Document   : arithmeticcalculator
    Created on : Jun 3, 2022, 9:10:39 PM
    Author     : Matt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmetic">
            <label>First Number: </label>
            <input type="text" name="firstNumber" value="${firstNumber}">
            <br>
            <label>Second Number: </label>
            <input type="text" name="secondNumber" value="${secondNumber}">
            <br>
            <input type="submit" name="type" value="+">
            <input type="submit" name="type" value="-">
            <input type="submit" name="type" value="x">
            <input type="submit" name="type" value="/">
        </form>
        <p>${message}</p>
        <p>
            <a href="/Calculators/age">Age Calculator</a>
        </p>
    </body>
</html>
