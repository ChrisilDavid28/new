//package com.example.demo;

import java.io.*;
import jakarta.servlet.http.*;

public class Servlet2 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            String n = request.getParameter("uname");
            out.println("Hello " + n);
            String c = request.getParameter("ucity");
            out.print("you are from " + c);
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
