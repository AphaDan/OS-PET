<%@ page language="java" contentType="text/html; charset=GB2312" pageEncoding="GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>普通用户登录页面</title>
</head>
<body style="background: url(login4.png);background-size:100% 100% ; background-attachment: fixed ">
	<center>
	<form action="loginpet" method="post">
		<table border="0" width="238" height="252">
			<tr align="center">
			<td>宠物号</td>
			<td><input type="text" name="id"><br><br></td>
			</tr>
			<tr align="center">
			<td>密码</td>
			<td><input type="password" name="passw"></td>
			</tr>
			<tr align="center">
				<td colspan="2"><input type="submit" value="登 录">
					&nbsp;&nbsp;&nbsp;&nbsp; <input type="reset" value="取 消"></td>
			</tr>
		</table>
	</form>
	</center>
</body>
</html>