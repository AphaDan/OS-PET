<%@ page language="java" contentType="text/html; charset=GB2312" pageEncoding="GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>登录页面</title>
</head>
<body style="background: url(login4.png);background-size:100% 100% ; background-attachment: fixed ">
	<center>
	<form action="signin" method="post">
		<table border="0" width="238" height="252">
			<tr align="center">
			<td>工号</td>
			<td><input type="text" name="id"></td>
			</tr>
			<tr align="center">
			<td>密码</td>
			<td><input type="password" name="password"></td>
			</tr>
			<tr align="center">
				<td colspan="2"><input type="submit" value="登 录">
					&nbsp;&nbsp;&nbsp;&nbsp; <input type="reset" value="取 消"></td>
			</tr>
			
		</table>
	</form>
	<a href="forget_passw_tijiao.jsp" target="bottom">找回密码</a>
	</center>
</body>
</html>