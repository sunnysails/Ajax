package com.kaishengit.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by sunny on 2016/12/7.
 */
@WebServlet("/save")
public class SaveServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter( "userName" );
        String address = req.getParameter( "addrss" );

        System.out.println("save:" + name + " -> " + address);
    }
}
