<%--
  Created by IntelliJ IDEA.
  User: Mohammadh Nafees
  Date: 9/7/2022
  Time: 5:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
String answer=request.getAttribute("answer").toString();
%>
<html>
<head>
    <title>Display</title>
</head>
<body>

<h1> Answer is <%= answer %></h1>
<br/><br/><br/>

<form method="get" action="index.jsp">

    <input type="submit" value="back to index page">

</form>
</body>
</html>
