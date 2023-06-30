<%@ page language="java" contentType="text/html; charset=GB2312"
	pageEncoding="GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>查询评价信息界面</title>
</head>
<body style="background: url(cat3.jpg);background-size:100% 100% ; background-attachment: fixed ">
	<form action="FindAssess" method="post">
		您想要查看哪个医生的评价？<br>
		<br> 请输入姓名： <input type="text" name="name"> <br>
		<br> <input type="submit" value="确 认" onclick="validate()">
		&nbsp;&nbsp;&nbsp;&nbsp; <input type="reset" value="取 消">
	</form>
</body>
</html>