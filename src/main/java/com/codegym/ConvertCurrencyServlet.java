package com.codegym;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ConvertCurrencyServlet", value = "/convert")
public class ConvertCurrencyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double rate = Double.parseDouble(request.getParameter("rate"));
        double usd = Double.parseDouble(request.getParameter("usd"));
        double vnd = usd * rate;

        PrintWriter printWriter = response.getWriter();
        printWriter.write("<html>");
        printWriter.write("<h4>");
        printWriter.write(usd + "USD = " + vnd + " VND");
        printWriter.write("</h4>");
        printWriter.write("</html>");
    }
}
