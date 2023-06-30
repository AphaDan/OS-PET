<%@ page language="java" contentType="text/html; charset=GB2312" pageEncoding="GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>查询条件提交界面</title>
</head>
<body style="background: url(cat3.jpg);background-size:100% 100% ; background-attachment: fixed ">
	请选择查询条件<hr width="100%" size="3">
	<form action= "find"	method="post">
	<input type="hidden" name="diag" value="find"><br>
		宠主：<input type="text" name="owner"><br>
		<br>会员：是 <input type="radio" value="yes" name="isMember" checked="checked">
		否<input type="radio"	value="no" name="isMember"><br><br>
		<input type="submit" value="提 交"> &nbsp;&nbsp;&nbsp;&nbsp;
		<input type="reset" value="取 消">
	</form>
</body>
</html>