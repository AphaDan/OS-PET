<%@page contentType="text/html; charset=GB2312" pageEncoding="GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>�����Ϣ�ύҳ��</title>
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
       alert("id����Ϊ�գ�");  
    else if(name.length<=0)
        alert("��������Ϊ��");
    else if(pwd.length<6)
       alert("���볤�ȱ�����ڵ���6��");  
    else if(pwd!=pwd1)
       alert("�������벻һ�£�");  
    else if(phone.length<=0)
    	alert("�绰���벻��Ϊ��");
    else  
      document.forms[0].submit();            
 }
</script>
</head>
<body style="background: url(cat3.jpg);background-size:100% 100% ; background-attachment: fixed ">
	<form action="insertdoc" method="post">
		<table border="0" width="238" height="252">
			<tr>
				<td>ҽ������</td>

				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>����</td>

				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>�Ա�</td>

				<td>�� <input type="radio" value="��" name="sex" checked="checked">
		Ů<input type="radio"	value="Ů" name="sex"></td>
			</tr>
			<tr>
				<td>����</td>

				<td><input type="password" name="passw"></td>
			</tr>
			<tr>
				<td>ȷ������</td>

				<td><input type="password" name="confim"></td>
			</tr>
			<tr>
				<td>�绰</td>
				<td><input type="text" name="phone"></td>
			</tr>
			<tr align="center">
				<td colspan="3"><input type="submit" value="�� ��" onclick="validate()">
					&nbsp;&nbsp;&nbsp;&nbsp; <input type="reset" value="ȡ ��"></td>
			</tr>
		</table>
	</form>
</body>
</html>