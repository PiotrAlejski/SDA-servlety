package com.szymon;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;

/**
 * Created by RENT on 2017-03-01.
 */
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Users> usersList = Arrays.asList(
                new Users("Piotr" , "Alejski"),
                new Users("Anna" , "Alejski"),
                new Users("Jan" , "Alejski"));
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        writer.write("<ul>");

        usersList.forEach(e -> writer.write("<li>" + e.getFirstName() + " " + e.getLastName() + " </li>"));

        writer.write("</ul>");

    }
}
