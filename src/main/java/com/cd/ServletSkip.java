package com.cd;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 实现3秒后跳转界面
 */
public class ServletSkip extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //getBytes() getBytes()默认编码为本地（操作系统）编码
        resp.getOutputStream().write("三秒后跳转".getBytes());

        resp.setHeader("refresh","3,url=/ServletCodingTest");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
