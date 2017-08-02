package com.cd;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 *第二种访问servlet的方式：继承javax.servlet.GenericServlet类
 */
public class ServletTest02 extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("-------GenericServlet:service------------------------");
    }
}
