<%@page contentType="text/html; charset=GB2312" pageEncoding="GB2312" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>显示所有宠物信息的页面</title>
</head>
<body style="background: url(cat3.jpg);background-size:100% 100% ; background-attachment: fixed ">
	<center>
		<%
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/pet?useSSL=false";//useUnicode=true&amp;characterEncoding=utf8
			Connection conn = DriverManager.getConnection(url, "root",
					"caoziyue630#");
			String sql = "select * from pets ";
			PreparedStatement pstmt = conn.prepareStatement(sql,
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);

			ResultSet rs = pstmt.executeQuery();
			rs.last(); //移至最后一条记录
		%>你要查询的宠物数据中共有 <font size="5" color="red"> <%=rs.getRow()%></font>人
		<div class="box-horizontal" style=" height: 200px; overflow-y: scroll;">
		<table id="report-table" style=" height: 250px;" border="2" bgcolor="ccceee" width="650">
			<tr bgcolor="CCCCCC" align="center">
				<td>记录条数</td>
				<td>宠物号</td>
				<td>类别</td>
				<td>宠主</td>
				<td>病情</td>
				<td>是否会员</td>
				<td>主治医师</td>

			</tr>
			<%
				rs.beforeFirst(); //移至第一条记录之前
				while (rs.next()) {
			%>
			<tr align="center">
				<td><%=rs.getRow()%></td>
				<td><%=rs.getString("id")%></td>
				<td><%=rs.getString("type")%></td>
				<td><%=rs.getString("owner")%></td>
				<td><%=rs.getString("case")%></td>
				<td><%=rs.getString("isMember")%></td>
				<td><%=rs.getString("docid")%></td>
			</tr>
			<%
				}
			%>
		</table>
		</div>
	</center>
</body>
</html>