package com.cd;

import javax.servlet.*;
import java.io.IOException;

/**
 * 第一种访问servlet的方式：实现javax.servlet.Servlet接口
 */
public class ServletTest01 implements Servlet{
    //servlet第一次访问时调用该方法，服务器会调用此方法会创建一个此类的实例
    public ServletTest01() {
        System.out.println("-------构造方法-------");
    }
    //servlet 第一次访问时会调用该方法，只会调用一次
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("----------init:------------------");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

        //servlet 每次访问此类都会调用此方法
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("--------service:----------------------");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    //销毁时调用此方法
    @Override
    public void destroy() {
        System.out.println("-------------destory:-----------------------");
    }
}
