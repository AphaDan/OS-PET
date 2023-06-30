<%@page contentType="text/html; charset=GB2312" pageEncoding="GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>添加信息提交页面</title>
<script language="javascript">
function validate(){
	var pwd=document.forms[0].passw.value;
    var pwd1=document.forms[0].confim.value;
    if(pwd!=pwd1)
        alert("两次密码不一致！");  
    else  
        document.forms[0].submit(); 
}
</script>
</head>
<body style="background: url(cat3.jpg);background-size:100% 100% ; background-attachment: fixed ">
	<form action="insert" method="post">
		<table border="0" width="238" height="252">
			
			宠物号  <input type="text" name="id"><br>
			<br>类别   <input type="text" name="type">
			<tr>
				<td>宠主</td>
				<td><input type="text" name="owner"></td>
			</tr>
			<tr>
				<td>病情</td>
				<td><input type="text" name="case"></td>
			</tr>
			<tr>
				<td>会员</td>
				<td>是<input type="radio" value="yes" name="isMember" checked="checked"> 
					否<input type="radio" value="no" name="isMember"><br>
				</td>
			</tr>
			<tr>
				<td>主治医师</td>

				<td><input type="text" name="doc"></td>
			</tr>
			<tr>
				<td>密码</td>

				<td><input type="password" name="passw"></td>
			</tr>
			<tr>
				<td>确认密码</td>

				<td><input type="password" name="confim"></td>
			</tr>
			<tr align="center">
				<td colspan="2"><input type="submit" value="添 加" onclick="validate()">
					&nbsp;&nbsp;&nbsp;&nbsp; <input type="reset" value="取 消"></td>
			</tr>
		</table>
	</form>
</body>
</html>