<%@page contentType="text/html; charset=GB2312" 
	import="java.sql.*,  java.util.List,pet.model.*,pet.dao.*" pageEncoding="GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>�޸ĳ�����Ϣ�ύ����</title>
</head>
<body style="background: url(cat3.jpg);background-size:100% 100% ; background-attachment: fixed ">
	���ĳ����id��
	<%
	request.setCharacterEncoding("GB2312");
	String id=request.getParameter("id");
	out.println(id);
	PetDao petDao=new PetDao();
	Pet pet=petDao.find(id);
	%>
	���޸ĳ�����Ϣ��<br><br>
	<form action= "update"	method="post">
		<table border="0" width="238" height="252">
			
			�����  <input type="text" name="id" value=<%=pet.getId() %>><br>
			<br>���   <input type="text" name="type" value=<%=pet.getType() %>>
			<tr>
				<td>����</td>
				<td><input type="text" name="owner" value=<%=pet.getOwner() %>></td>
			</tr>
			<tr>
				<td>����</td>
				<td><input type="text" name="case" value=<%=pet.getCases() %>></td>
			</tr>
			<tr>
				<td>��Ա</td>
				<td><input type="text" value=<%=pet.getIsMember() %> name="isMember"></td>
			</tr>
			<tr>
				<td>����ҽʦ</td>

				<td><input type="text" name="doc" value=<%=pet.getDocid() %>></td>
			</tr>
			<tr align="center">
				<td colspan="2"><input type="submit" value="ȷ���޸�">
					&nbsp;&nbsp;&nbsp;&nbsp; <input type="reset" value="ȡ ��"></td>
			</tr>
		</table>
	</form>
</body>
</html>