<%@ page language="java" contentType="text/html; charset=GB2312" pageEncoding="GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>��ѯ�����ύ����</title>
</head>
<body style="background: url(cat3.jpg);background-size:100% 100% ; background-attachment: fixed ">
	��ѡ���ѯ����<hr width="100%" size="3">
	<form action= "find"	method="post">
	<input type="hidden" name="diag" value="find"><br>
		������<input type="text" name="owner"><br>
		<br>��Ա���� <input type="radio" value="yes" name="isMember" checked="checked">
		��<input type="radio"	value="no" name="isMember"><br><br>
		<input type="submit" value="�� ��"> &nbsp;&nbsp;&nbsp;&nbsp;
		<input type="reset" value="ȡ ��">
	</form>
</body>
</html>