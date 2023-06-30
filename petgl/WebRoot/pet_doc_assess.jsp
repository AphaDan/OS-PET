<%@ page language="java" contentType="text/html; charset=GB2312"
    pageEncoding="GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB2312">
<title>评价页面</title>
</head>
<body style="background: url(cat3.jpg);background-size:100% 100% ; background-attachment: fixed ">
	<form action="assess" method="post">
		请输入您的id号  <input type="text" name="id"><br><br>
		请选择评分<br><br>
		一颗星<input type="radio" value="1" name="assess" checked="checked">
		两颗星<input type="radio"	value="2" name="assess">
		三颗星<input type="radio"	value="3" name="assess">
		四颗星<input type="radio"	value="4" name="assess">
		五颗星<input type="radio"	value="5" name="assess">
		<br><br>
		<input type="submit" value="确 认" onclick="validate()">
		&nbsp;&nbsp;&nbsp;&nbsp; <input type="reset" value="取 消">
	</form>
</body>
</html>