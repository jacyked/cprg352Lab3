/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Matt
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // GET requests will end up here!
        
        // Load a JSP from this servlet
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        // After a JSP has been loaded, stop the code call
        return; // VERY IMPORTANT!
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // POST requests will end up here!
        
        // Capture the incoming parameters from the JSP
        String firstno = request.getParameter("firstNumber");
        String secondno = request.getParameter("secondNumber");
        
        // Set attributes in the request object, to be forwarded to the JSP
        request.setAttribute("firstNumber", firstno);
        request.setAttribute("secondNumber", secondno);
        
        // Validation
        if( firstno == null || firstno.equals("")||secondno == null || secondno.equals("")){
            // if validation fails:
            // Set up an error message
            String message = "Invalid Input (NULL)";
            // put the error message into the request object as an attribute
            request.setAttribute("message", message);
            // load the form once again
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            // after a JSP has been loaded, stop the code call
            return;
        }
        double firstnum;
        double secondnum;
        try{
            firstnum = Double.parseDouble(firstno);
            secondnum = Double.parseDouble(secondno);
            
        }catch(Exception e){
            // if validation fails:
            // Set up an error message
            String message = "Invalid Input (NAN)";
            // put the error message into the request object as an attribute
            request.setAttribute("message", message);
            // load the form once again
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            // after a JSP has been loaded, stop the code call
            return;
        }
        double result;
        String function = request.getParameter("type");
        System.out.println(function);
        if(function.equals("+")){
            result = firstnum + secondnum;
        }else if(function.equals("-")){
            result = firstnum - secondnum;
        }else if(function.equals("x")){
            result = firstnum * secondnum;
        }else if(function.equals("/")){
            result = firstnum / secondnum;
        }
        else{
            result = -1;
        }
        
        String message = "Result: " + result;
        request.setAttribute("message", message);
        
        // Load the JSP
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        // Stop the code call after loading a JSP
        return;
    }
}
