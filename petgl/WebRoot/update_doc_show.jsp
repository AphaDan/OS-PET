<%@page import="pet.dao.DocDao,pet.model.Doc"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>修改医生信息界面</title>
</head>
<body style="background: url(cat3.jpg);background-size:100% 100% ; background-attachment: fixed ">
	<%
	DocDao docDao = new DocDao();
	String id=request.getParameter("id");
	Doc doc = docDao.find(id);
	%>
	请修改宠物信息：<br><br>
	<form action= "updateDoc"	method="post">
	医生id：<input type="text" name="id" value=<%=doc.getId() %>><br><br>
	姓名：<input type="text" name="name" value=<%=doc.getName() %>><br><br>
	性别：<input type="text" name="sex" value=<%=doc.getSex() %>><br><br>
	<input type="submit" value="确认修改">&nbsp;&nbsp;&nbsp;&nbsp; 
	<input type="reset" value="取 消">
	</form>
</body>
</html>