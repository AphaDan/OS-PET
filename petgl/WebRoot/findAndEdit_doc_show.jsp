<%@page contentType="text/html; charset=GB2312" pageEncoding="GB2312"
	import="java.sql.*,pet.dao.DocDao,pet.model.Doc,java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>����������ҽ�����޸Ľ���</title>
</head>
<body style="background: url(cat3.jpg);background-size:100% 100% ; background-attachment: fixed ">
	<%
		request.setCharacterEncoding("GB2312");//�����ַ����룬�����������
		List<Doc> res = (List<Doc>) request.getAttribute("update");
	%>��Ҫ��ѯ��ҽ�����ݱ��й���
	<font size="5" color="red"> <%=res.size()%></font>��
	<table name="modify" border="2" bgcolor="ccceee" width="650">
		<tr bgcolor="CCCCCC" align="center">
			<td>��¼����</td>
			<td>ҽ������</td>
			<td>����</td>
			<td>�Ա�</td>

		</tr>
		<%
			for (Doc doc : res) {
		%>
		<tr align="center">
			<td><%=1%><br></td>
			<td><%=doc.getId()%> <input type="hidden" name="id"
				value=<%=doc.getId()%>><br></td>
			<td><%=doc.getName()%> <input type="hidden" name="name"
				value=<%=doc.getName()%>><br></td>
			<td><%=doc.getSex()%> <input type="hidden" name="sex"
				value=<%=doc.getSex()%>><br></td>

		</tr>
		<%
			}
		%>
	</table>
</body>
</html>