<%@ page pageEncoding="UTF-8" contentType="text/html;UTF-8" isELIgnored="false"  %>
<html>
<head>
</head>
<body>
<form action="${pageContext.request.contextPath}/receive/r4.do" method="post">
    爱好  唱跳 <input type="checkbox" name="hobby" value="1"/> RAP <input type="checkbox" name="hobby" value="2"/> 篮球 <input type="checkbox" name="hobby" value="3"/>
    <input type="submit" value="提交" />
</form>

</body>
</html>