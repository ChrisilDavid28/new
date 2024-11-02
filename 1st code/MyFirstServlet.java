package com.example.demo;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {
    public MyFirstServlet() {
        super();
        System.out.println("I am created");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
    
        PrintWriter writer = response.getWriter();
        String htmlResponse = "<html><h2>Your username is: " + username + "<br/>";
        htmlResponse += "Your password is: " + password + "</h2></html>";
        writer.println(htmlResponse);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
    
}

