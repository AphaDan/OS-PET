<%@page contentType="text/html; charset=GB2312" pageEncoding="GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>添加信息提交页面</title>
<script language="javascript">
function validate(){
    var name=document.forms[0].name.value;
    var pwd=document.forms[0].passw.value;
    var pwd1=document.forms[0].confim.value;
    var phone=document.forms[0].phone.value;
    var id=document.forms[0].id.value;
    var regl=/[a-zA-Z]\w*/;
    var reg2= /\w+([-+.']\w+)*@\w+([-.]\w+)*.\w+([-.]\w+)*/;
    if(id.length<=0)
       alert("id不能为空！");  
    else if(name.length<=0)
        alert("姓名不能为空");
    else if(pwd.length<6)
       alert("密码长度必须大于等于6！");  
    else if(pwd!=pwd1)
       alert("两次密码不一致！");  
    else if(phone.length<=0)
    	alert("电话号码不能为空");
    else  
      document.forms[0].submit();            
 }
</script>
</head>
<body style="background: url(cat3.jpg);background-size:100% 100% ; background-attachment: fixed ">
	<form action="insertdoc" method="post">
		<table border="0" width="238" height="252">
			<tr>
				<td>医生工号</td>

				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>姓名</td>

				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>性别</td>

				<td>男 <input type="radio" value="男" name="sex" checked="checked">
		女<input type="radio"	value="女" name="sex"></td>
			</tr>
			<tr>
				<td>密码</td>

				<td><input type="password" name="passw"></td>
			</tr>
			<tr>
				<td>确认密码</td>

				<td><input type="password" name="confim"></td>
			</tr>
			<tr>
				<td>电话</td>
				<td><input type="text" name="phone"></td>
			</tr>
			<tr align="center">
				<td colspan="3"><input type="submit" value="添 加" onclick="validate()">
					&nbsp;&nbsp;&nbsp;&nbsp; <input type="reset" value="取 消"></td>
			</tr>
		</table>
	</form>
</body>
</html>