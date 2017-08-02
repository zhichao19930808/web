package com.cd;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletCodingTest extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//修改编码格式
//  方法1：
        //告诉服务器使用什么编码格式解析文本
        //resp.setCharacterEncoding("UTF-8");
        //告诉浏览器用什么编码格式解析文本
       // resp.setHeader("content","text/html;charset=utf-8");
//  方法2：
        resp.setContentType("text/html;charset = utf-8");
        //获取字符输出流
//测试：
        PrintWriter writer = resp.getWriter();
        //向浏览器输出字符流
        writer.write("汉字");
    }
}
