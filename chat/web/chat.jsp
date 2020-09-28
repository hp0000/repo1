<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2020/4/10 0010
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>chat</title>

    <script>
        var username='${sessionScope.username}';
        var ws;//一个ws对象就是一个通道管道
        var target="ws://localhost:8080/chat/chatSocket?username="+username;
        window.onload=function () {
            //进入聊天页面就打开通道
            if ('WebSocket' in window){
                ws=new WebSocket(target);
            } else if ('MozWebSocket' in window){
                ws=new MozWebSocket(target);
            } else{
                alert('WebSocket is not supported by this browser.');
                return;
            }
        }
    </script>
</head>
<body>
    <div id="content">

    </div>
    <div id="userlist" style="border:1px solid black; width:100px; height:400px;
     float:left;">

    </div>
</body>
</html>
