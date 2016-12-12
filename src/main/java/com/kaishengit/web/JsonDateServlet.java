package com.kaishengit.web;

import com.google.gson.Gson;
import com.kaishengit.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sunny on 2016/12/7.
 */
@WebServlet("/data.json")
public class JsonDateServlet extends BaseServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Users user = new Users(1,"李四","北京");
        Users user1 = new Users(12,"王明明","上海");
        Users user2 = new Users(23,"赵丽丽","郑州");

        List<Users> userList = Arrays.asList(user,user1,user2);

        Gson gson = new Gson();
        String json = gson.toJson(userList);

        PrintWriter out = resp.getWriter();
        out.print(json);
        out.flush();
        out.close();
    }
}
