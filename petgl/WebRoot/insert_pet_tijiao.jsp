<%@page contentType="text/html; charset=GB2312" pageEncoding="GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>�����Ϣ�ύҳ��</title>
<script language="javascript">
function validate(){
	var pwd=document.forms[0].passw.value;
    var pwd1=document.forms[0].confim.value;
    if(pwd!=pwd1)
        alert("�������벻һ�£�");  
    else  
        document.forms[0].submit(); 
}
</script>
</head>
<body style="background: url(cat3.jpg);background-size:100% 100% ; background-attachment: fixed ">
	<form action="insert" method="post">
		<table border="0" width="238" height="252">
			
			�����  <input type="text" name="id"><br>
			<br>���   <input type="text" name="type">
			<tr>
				<td>����</td>
				<td><input type="text" name="owner"></td>
			</tr>
			<tr>
				<td>����</td>
				<td><input type="text" name="case"></td>
			</tr>
			<tr>
				<td>��Ա</td>
				<td>��<input type="radio" value="yes" name="isMember" checked="checked"> 
					��<input type="radio" value="no" name="isMember"><br>
				</td>
			</tr>
			<tr>
				<td>����ҽʦ</td>

				<td><input type="text" name="doc"></td>
			</tr>
			<tr>
				<td>����</td>

				<td><input type="password" name="passw"></td>
			</tr>
			<tr>
				<td>ȷ������</td>

				<td><input type="password" name="confim"></td>
			</tr>
			<tr align="center">
				<td colspan="2"><input type="submit" value="�� ��" onclick="validate()">
					&nbsp;&nbsp;&nbsp;&nbsp; <input type="reset" value="ȡ ��"></td>
			</tr>
		</table>
	</form>
</body>
</html>