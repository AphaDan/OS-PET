<%@ page language="java" contentType="text/html; charset=GB2312"
    pageEncoding="GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB2312">
<title>����ҳ��</title>
</head>
<body style="background: url(cat3.jpg);background-size:100% 100% ; background-attachment: fixed ">
	<form action="assess" method="post">
		����������id��  <input type="text" name="id"><br><br>
		��ѡ������<br><br>
		һ����<input type="radio" value="1" name="assess" checked="checked">
		������<input type="radio"	value="2" name="assess">
		������<input type="radio"	value="3" name="assess">
		�Ŀ���<input type="radio"	value="4" name="assess">
		�����<input type="radio"	value="5" name="assess">
		<br><br>
		<input type="submit" value="ȷ ��" onclick="validate()">
		&nbsp;&nbsp;&nbsp;&nbsp; <input type="reset" value="ȡ ��">
	</form>
</body>
</html>