<%@ page language="java" contentType="text/html; charset=GB2312" pageEncoding="GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>����ҽԺ-�û�����</title>
</head>
	<body style="background: url(cat3.jpg);background-size:100% 100% ; background-attachment: fixed ">
		<form action= "update_pet_edit.jsp" method="post">
		<%
		request.setCharacterEncoding("GB2312");
		String id=(String)request.getAttribute("petId");
		%>
		����idΪ<input type="text" name="id" value=<%=id %>><br><br>
		<input type="submit" value="ȷ ��"> &nbsp;&nbsp;&nbsp;&nbsp;
		<input type="reset" value="ȡ ��">
		</form>
	</body>
</html>