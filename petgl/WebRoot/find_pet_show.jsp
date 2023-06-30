<%@page contentType="text/html; charset=GB2312" 
	import="java.sql.*,  java.util.List,pet.model.*,pet.dao.*" pageEncoding="GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>查询条件结果页面</title>
</head>
<body style="background: url(cat3.jpg);background-size:100% 100% ; background-attachment: fixed ">
	<p><a href="update_pet_tijiao.jsp" target="top">点击进入修改信息页面</a></p>
	<%
		request.setCharacterEncoding("GB2312");//设置字符编码，避免出现乱码
		List<Pet> res=(List<Pet>)request.getAttribute("update");
	%>你要查询的宠物数据表中共有
	<font size="5" color="red"> <%=res.size()%></font>个
	<form method="post" action="update_pet_edit.jsp">
		<table name="modify" border="2" bgcolor="ccceee" width="650">
			<tr bgcolor="CCCCCC" align="center">
				<td>记录条数</td>
				<td>宠物号</td>
				<td>类别</td>
				<td>宠主</td>
				<td>病情</td>
				<td>会员</td>
				<td>主治医师</td>
			</tr>
			<%
				for (Pet pet : res) {
			%>
			<tr align="center">
				<td><%=1%><br></td>
				<td><%=pet.getId()%> <input type="hidden" name="id"
					value=<%=pet.getId()%>><br></td>
				<td><%=pet.getType()%> <input type="hidden" name="type"
					value=<%=pet.getType() %>><br></td>
				<td><%=pet.getOwner() %> <input type="hidden" name="owner"
					value=<%=pet.getOwner() %>><br></td>
				<td><%=pet.getCases() %> <input type="hidden" name="case"
					value=<%=pet.getCases() %>><br></td>
				<td><%=pet.getIsMember() %> <input type="hidden" name="isMember"
					value=<%=pet.getIsMember() %>><br></td>
				<td><%=pet.getDocid() %> <input type="hidden" name="doc"
					value=<%=pet.getDocid() %>><br></td>
			</tr>
			<%
				}
			%>
		</table>
	</form>
</body>
</html>