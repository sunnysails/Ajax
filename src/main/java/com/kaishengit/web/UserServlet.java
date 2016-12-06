package com.kaishengit.web;

import com.kaishengit.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sunny on 2016/12/6.
 */
@WebServlet("/users.xml")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Users user = new Users(1001, "jack", "美国");
        Users user1 = new Users(1002, "张三", "北京");
        Users user2 = new Users(1003,"李斯","石家庄");
        Users user3 = new Users(1004,"Rose","UK");

        List<Users> userList = Arrays.asList(user, user1, user2 ,user3);

        resp.setCharacterEncoding("UTF-8");

        resp.setContentType("UTF-8");

        PrintWriter out = resp.getWriter();

        out.print("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        out.print("<users>");

        for (Users u : userList) {
            out.print("<user id=\""+u.getId()+"\">");
            out.print("<name>"+u.getUserName()+"</name>");
            out.print("<address>"+u.getAddress()+"</address>");
            out.print("</user>");
        }
        out.print("</users>");

        out.flush();
        out.close();
    }
}
