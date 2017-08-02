package com.cd;

import sun.security.krb5.Config;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletConfigTest extends HttpServlet {
    //第一种获取config的方法:通过初始化参数的  名称 获取对应的value值
    private ServletConfig config;//配置信息
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        this.config = config;
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String value = config.getInitParameter("encoding");
        System.out.println("第一种方法获得的config的值："+value);

        //第二种方法获得的config的值
        String value2 =this.getServletConfig().getInitParameter("encoding");
        System.out.println("第二种方法获得的config的值:"+value2);

        //第三种方法获得的config的值
        String value3 = super.getInitParameter("encoding");
        System.out.println("第三种方法获得的config的值:"+value3);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
