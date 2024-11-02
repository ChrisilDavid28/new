//package com.example.demo;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OEValidatorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    // In-memory list to store student results
    private List<Student> studentResults = new ArrayList<>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h1>Results</h1>");
        response.getWriter().println("<table border='1'><tr><th>Seat Number</th><th>Name</th><th>Marks</th></tr>");
        for (Student student : studentResults) {
            response.getWriter().println("<tr><td>" + student.getSeatNum() + "</td><td>" + student.getName() + "</td><td>" + student.getMarks() + "</td></tr>");
        }
        response.getWriter().println("</table>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String seatNum = request.getParameter("Seat_no");
        String name = request.getParameter("Name");
        
        // Calculate scores based on answers
        int totalMarks = 0;
        totalMarks += "True".equals(request.getParameter("group1")) ? 5 : 0;
        totalMarks += "False".equals(request.getParameter("group2")) ? 5 : 0;
        totalMarks += "False".equals(request.getParameter("group3")) ? 5 : 0;
        totalMarks += "True".equals(request.getParameter("group4")) ? 5 : 0;
        totalMarks += "False".equals(request.getParameter("group5")) ? 5 : 0;

        // Store the result in memory
        studentResults.add(new Student(seatNum, name, totalMarks));

        // Redirect to display results
        doGet(request, response);
    }

    // Inner class to represent a student
    class Student {
        private String seatNum;
        private String name;
        private int marks;

        public Student(String seatNum, String name, int marks) {
            this.seatNum = seatNum;
            this.name = name;
            this.marks = marks;
        }

        public String getSeatNum() {
            return seatNum;
        }

        public String getName() {
            return name;
        }

        public int getMarks() {
            return marks;
        }
    }
}
