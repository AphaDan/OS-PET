<%@ page language="java" contentType="text/html; charset=GB2312" pageEncoding="GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>�һ��������</title>
</head>
<body style="background: url(login4.png);background-size:100% 100% ; background-attachment: fixed ">
	<%
		request.setCharacterEncoding("GB2312");
		String passw=(String)request.getAttribute("findpassword");
		out.print("���������ǣ�"+passw);
	%>
</body>
</html>