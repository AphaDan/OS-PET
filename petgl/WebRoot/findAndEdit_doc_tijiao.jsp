<%@page contentType="text/html; charset=GB2312" pageEncoding="GB2312" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>����������ҽ�����޸��ύ����</title>
</head>
<body style="background: url(cat3.jpg);background-size:100% 100% ; background-attachment: fixed ">
	��ѡ���ѯ����<hr width="100%" size="3">
	<form action= "Finddoc"	method="post">
	<input type="hidden" name="diag" value="find"><br>
	������<input type="text" name="name"><br>
	�Ա�<input type="text" name="sex"><br>
	<input type="submit" value="�� ��"> &nbsp;&nbsp;&nbsp;&nbsp;
	<input type="reset" value="ȡ ��">
	</form>
</body>
</html>