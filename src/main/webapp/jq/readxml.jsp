<%--
  Created by IntelliJ IDEA.
  User: sunny
  Date: 2016/12/8
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <input type="text" placeholder="RSS URL" id="url">
    <button id="btn">点我</button>
    <ur id="newList"></ur>

    <script src="/static/js/jquery-1.11.3.min.js"></script>
    <script src="/static/js/handlebars-v4.0.5.js"></script>

    <script type="text/template" id="temp1">
        <li>
            <a href="{{link}}" target="_blank">{{title}}</a>
        </li>
    </script>


    <script>
        $(function () {
            $("#btn").click(function () {
                var rssUrl = $("#url").val();
                $("#newsList").html("");
                $.ajax({
                    url : "/rss.xml",
                    type : "get",
                    data : {"url":rssUrl},
                    success : function (xmlDoc){
                        $(xmlDoc).find("item").each(function () {
                            var title = $(this).find("title").text();
                            var link = $(this).find("link").text();

                            var source = $("#temp1").html();
                            var template = Handlebars.compile(source);

                            var data = {
                                "title" : title,
                                "link" : link,
                            };
                            var html = template(data);

                            $(html).appendTo($("#newList"));
                        });

                    } ,
                    error : function () {
                        alert("服务器异常");
                    }

                });
            })
        });
    </script>

</body>
</html>
