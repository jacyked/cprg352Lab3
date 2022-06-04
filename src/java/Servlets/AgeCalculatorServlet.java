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
public class AgeCalculatorServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // POST requests will end up here!
        
        // Capture the incoming parameters from the JSP
        String userage = request.getParameter("userAge");
        
        
        // Set attributes in the request object, to be forwarded to the JSP
        request.setAttribute("userAge", userage);
        
        
        // Validation
        if( userage == null || userage.equals("")){
            // if validation fails:
            // Set up an error message
            String message = "Please enter an age";
            // put the error message into the request object as an attribute
            request.setAttribute("message", message);
            // load the form once again
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            // after a JSP has been loaded, stop the code call
            return;
        }
        int age;
        try{
            age = Integer.parseInt(userage);
            
        }catch(Exception e){
            // if validation fails:
            // Set up an error message
            String message = "Please enter a number";
            // put the error message into the request object as an attribute
            request.setAttribute("message", message);
            // load the form once again
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            // after a JSP has been loaded, stop the code call
            return;
        }
     
        

        age++;
        String message = "Your next age is " + age;
        request.setAttribute("message", message);
        
        // Load the JSP
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        // Stop the code call after loading a JSP
        return;
    }
}
