package com.logo;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * 模拟设计一个验证码
 */
public class ServletLogoTest extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        creatLogo(resp);
    }

    private  void creatLogo(HttpServletResponse resp) {
        System.out.println("eee");
        int width = 125;
        int height = 40;
        //在内存中创建一个图形对象
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        //得到画笔对象
        Graphics graphics = image.createGraphics();

        //给图像设置背景颜色
        graphics.setColor(Color.gray);//给画笔设置颜色
        graphics.fillRect(1,1,width-2,height-2);//填充色   x:边框粗度  y width：图片的宽度 height

        //设置边框颜色
        graphics.setColor(Color.blue);
        graphics.drawRect(0,0,width-1,height-1);

        //设置文本样式
        graphics.setColor(Color.BLACK);
        graphics.setFont(new Font("宋体",Font.BOLD|Font.ITALIC, 22));

        //设置显示的文本内容
        Random random = new Random();
        int x = 25;
        for (int i = 0; i < 4; i++) {
            graphics.drawString(String.valueOf( random.nextInt(9)),x,25);
            x += 25;
        }

        //添加干扰线
        for (int i = 0; i < 9; i++) {
            graphics.drawLine(random.nextInt(width),random.nextInt(height),random.nextInt(width),random.nextInt(height));
        }
        //将图像以流的方式输出到客户端
        try {
            ImageIO.write(image, "jpg", resp.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
