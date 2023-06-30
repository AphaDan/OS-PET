<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>修改宠物信息提交界面</title>
</head>
<body style="background: url(cat3.jpg);background-size:100% 100% ; background-attachment: fixed ">
	<form action= "update_pet_edit.jsp"	method="post">
		请确认您要修改的宠物的id<br><br>
		id  <input type="text" name="id"><br><br>
		<input type="submit" value="确 认"> &nbsp;&nbsp;&nbsp;&nbsp;
		<input type="reset" value="取 消">
	</form>
</body>
</html>