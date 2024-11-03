//package com.example.demo;

import java.io.PrintWriter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class Servlet1 extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)
{
try
{
response.setContentType("text/html");
PrintWriter out = response.getWriter();
String n=request.getParameter("uname");
String c=request.getParameter("ucity");
out.print("<form action=\"Servlet2\">");
out.print("<input type='hidden' name='uname' value="+n+">");
out.print("<input type='hidden' name='ucity' value="+c+">");
out.print("<input type='submit' value='Just click here'>");
out.print("</form>");
out.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}
