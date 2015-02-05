package com.ig.bootcamp;

import javax.servlet.http.HttpServlet;

public class MyFirstServlet extends HttpServlet {

    protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, java.io.IOException
    {
        resp.getWriter().println("---Welomce to my first servlet---");
        req.setAttribute("name", "ankit");

        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }


}
