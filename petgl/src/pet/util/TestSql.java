package pet.util;

import java.sql.Connection;

import javax.swing.JOptionPane;

public class TestSql {
	public static void main(String[] args){
		Connection conn= SqlHelper.connect();
		if(conn!=null){
			JOptionPane.showMessageDialog(null, "数据库连接成功！");
			SqlHelper.closeConnection(conn);
		}else{
			JOptionPane.showMessageDialog(null, "数据库连接失败");
		}
	}
}
