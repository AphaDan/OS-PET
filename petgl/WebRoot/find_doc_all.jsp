<%@page contentType="text/html; charset=GB2312" pageEncoding="GB2312" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>��ʾ���г�����Ϣ��ҳ��</title>
</head>
<body style="background: url(cat3.jpg);background-size:100% 100% ; background-attachment: fixed ">
	<center>
		<%
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/pet?useSSL=false&useUnicode=true&characterEncoding=utf-8";//useUnicode=true&amp;characterEncoding=utf8
			Connection conn = DriverManager.getConnection(url, "root",
					"caoziyue630#");
			String sql = "select * from doc ";
			PreparedStatement pstmt = conn.prepareStatement(sql,
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);

			ResultSet rs = pstmt.executeQuery();
			rs.last(); //�������һ����¼
		%>��Ҫ��ѯ��ҽ�������й��� <font size="5" color="red"> <%=rs.getRow()%></font>��
		<div class="box-horizontal" style=" height: 200px; overflow-y: scroll;">
		<table id="report-table" style=" height: 250px;" border="2" bgcolor="ccceee" width="650">
			<tr bgcolor="CCCCCC" align="center">
				<td>��¼����</td>
				<td>ҽ������</td>
				<td>����</td>
				<td>�Ա�</td>
		
			</tr>
			<%
				rs.beforeFirst(); //������һ����¼֮ǰ
				while (rs.next()) {
			%>
			<tr align="center">
				<td><%=rs.getRow()%></td>
				<td><%=rs.getString("id")%></td>
				<td><%=rs.getString("name")%></td>
				<td><%=rs.getString("sex")%></td>
				
			</tr>
			<%
				}
			%>
		</table>
		</div>
	</center>
</body>
</html>