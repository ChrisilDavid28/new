//package com.example.demo;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // You can add some input form here or any other content
        out.print("<h1>Welcome to Servlet1</h1>");
        out.print("<form action='Servlet2' method='get'>");
        out.print("Name: <input type='text' name='username' required><br>");
        out.print("City: <input type='text' name='usercity' required><br>");
        out.print("<input type='submit' value='Submit'>");
        out.print("</form>");
        out.close();
    }
}
