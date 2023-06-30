<%@page contentType="text/html; charset=GB2312" pageEncoding="GB2312"
	import="java.sql.*,pet.dao.DocDao,pet.model.Doc,java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>按条件查找医生并修改界面</title>
</head>
<body style="background: url(cat3.jpg);background-size:100% 100% ; background-attachment: fixed ">
	<%
		request.setCharacterEncoding("GB2312");//设置字符编码，避免出现乱码
		List<Doc> res = (List<Doc>) request.getAttribute("update");
	%>你要查询的医生数据表中共有
	<font size="5" color="red"> <%=res.size()%></font>个
	<table name="modify" border="2" bgcolor="ccceee" width="650">
		<tr bgcolor="CCCCCC" align="center">
			<td>记录条数</td>
			<td>医生工号</td>
			<td>姓名</td>
			<td>性别</td>

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