<%--
  Created by IntelliJ IDEA.
  User: sunny
  Date: 2016/12/12
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>WYSIWYG</title>
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="/static/js/simditor/styles/simditor.css">
</head>
<body>
    <div class="container">
        <form action="/send" method="post">
            <textarea name="massage" id="editor" autofocus></textarea>
            <button class="but but-primary">发布</button>
        </form>
    </div>
    <script src="/static/js/jquery-1.11.3.min.js"></script>
    <script src="/static/js/simditor/scripts/module.min.js"></script>
    <script src="/static/js/simditor/scripts/hotkeys.min.js"></script>
    <script src="/static/js/simditor/scripts/uploader.min.js"></script>
    <script src="/static/js/simditor/scripts/simditor.min.js"></script>
    <script>
        $(function () {
           var data = new Simditor({
               textarea:$("#editor"),
               placeholder:"请输入文字",
           }) ;
        });
    </script>
</body>
</html>
