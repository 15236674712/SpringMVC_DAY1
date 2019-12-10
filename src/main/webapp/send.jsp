<%@ page pageEncoding="UTF-8" contentType="text/html;UTF-8" isELIgnored="false"  %>
<html>
   <head>
   </head>
   <body>
      <form action="${pageContext.request.contextPath}/hello/world.do" method="post">
          <input type="submit" value="发送POST请求">
      </form>

   </body>
</html>