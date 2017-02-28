package com.szymon;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> names = Arrays.asList("Szymon", "Jan", "Anna", "Marian", "Piotr", "Agnieszka");
        final PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");

        writer.write("<h1>");
        writer.write("Hello " + req.getParameter("name"));
        writer.write("</h1>");

        Integer counter = new Integer(req.getParameter("counter"));

        writer.write("<ul>");//unordered list
        names.stream()
                .limit(counter)
                .forEach(e -> writer.write("<li>" + e + "</li>"));
        writer.write("</ul>");

//        writer.write(req.getRequestURI());
    }
}
