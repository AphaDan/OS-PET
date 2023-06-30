<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>修改医生信息提交界面</title>
</head>
<body style="background: url(cat3.jpg);background-size:100% 100% ; background-attachment: fixed ">
	<form action= "update_doc_show.jsp"	method="post">
		请确认您要修改的医生的id<br><br>
		id  <input type="text" name="id"><br><br>
		<input type="submit" value="确 认"> &nbsp;&nbsp;&nbsp;&nbsp;
		<input type="reset" value="取 消">
	</form>
</body>
</html>