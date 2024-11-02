public package com.example.demo;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/HCounterServlet")
public class HCounterServlet extends HttpServlet {
    public HCounterServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
        HttpSession session = request.getSession(true);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Integer count = 0; // Initialize count
        String head;

        if (session.isNew()) {
            head = "Welcome New user. This is your first visit";
        } else {
            Integer oldcount = (Integer) session.getAttribute("count"); // Use getAttribute
            if (oldcount != null) {
                count = oldcount + 1; // Increment count
            }
            head = "This is your visit #: " + (count + 1);
        }

        session.setAttribute("count", count); // Use setAttribute
        out.println("<HTML><BODY BGCOLOR=\"#FDF5E6\">\n" +
                "<H2 ALIGN=\"CENTER\">" + head + "</H2>\n</BODY></HTML>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
 {
    
}
