<%@ page pageEncoding="UTF-8" contentType="text/html;UTF-8" isELIgnored="false"  %>
<html>
<head>
</head>
<body>
<form action="${pageContext.request.contextPath}/receive/r3.do" method="post">

    用户名 <input type="text" name="username" /> <br/>
    密码 <input type="password" name="password" /> <br/>
    年龄 <input type="text" name="age" /> <br/>
    生日 <input  type="date" name="birthdate"/> <br/>
    城市 <input type="text" name="address.city"/> <br/>
    街道 <input  type="text" name="address.street" /> <br/>
    <input type="submit" value="提交" />
</form>

</body>
</html>