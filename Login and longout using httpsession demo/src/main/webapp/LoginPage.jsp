
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="LoginAction" method="post">
<input type="text" name="userName" placeholder="Enter user name" required><br>
<input type="password" name="password" placeholder="Enter your password" required><br>
<input type="submit" value="login">


</form>

<%
String msg=request.getParameter("msg");
if("invalid".equals(msg))
{
%>
Wrong password or username.
<%} %>
</body>
</html>