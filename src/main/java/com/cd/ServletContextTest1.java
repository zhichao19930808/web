package com.cd;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 向ServletContextTest1对象中存放数据，在ServletContextTest2中取数据
 */
public class ServletContextTest1 extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //通过调研GenericServlet类中getServletContext()获取ServletContext对象
        ServletContext context = this.getServletContext();
        //想ServletContext对象中存放数据  name-Tom
        context.setAttribute("name","tom");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
