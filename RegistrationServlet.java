package com.exp10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")

public class RegistrationServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        // Read data from form
        String uname = request.getParameter("uname");
        String pass = request.getParameter("pass");
        String email = request.getParameter("email");
        String country = request.getParameter("country");

        // Send data to DAO
        int status = RegisterDAO.save(
                uname,
                pass,
                email,
                country
        );

        // Display result
        if(status > 0) {
            out.println("<h2>Registration Successful</h2>");
        }
        else {
            out.println("<h2>Registration Failed</h2>");
        }
    }
}