<%@ page language="java" contentType="text/html; charset=GB2312" pageEncoding="GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB2312">
<title>删除提交页面</title>
</head>
<body style="background: url(cat3.jpg);background-size:100% 100% ; background-attachment: fixed ">
	请选择删除记录条件
	<hr width="100%" size="3">
	<form action="deletedoc" method="post">
	医生工号：<input type="text" name="id"><br>
	<br>医生姓名：<input type="text" name="name"><br>
	<p>
			&nbsp;&nbsp; <input type="submit" value="提 交">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="reset"
				value="取 消">
	</form>
</body>
</html>