<%@ page language="java" contentType="text/html; charset=GB2312"
    pageEncoding="GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>������Ϣ</title>
</head>
<body style="background: url(cat3.jpg);background-size:100% 100% ; background-attachment: fixed ">
	<%
	request.setCharacterEncoding("GB2312");
	String name=(String)request.getAttribute("name0");
	out.print(name+"ҽ��������Ϊ");
	%>
	<%
	double d = (double)request.getAttribute("findAssessment");
	out.print(d);
	%>
</body>
</html>