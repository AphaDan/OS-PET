package pet.util;

import java.sql.Connection;

import javax.swing.JOptionPane;

public class TestSql {
	public static void main(String[] args){
		Connection conn= SqlHelper.connect();
		if(conn!=null){
			JOptionPane.showMessageDialog(null, "���ݿ����ӳɹ���");
			SqlHelper.closeConnection(conn);
		}else{
			JOptionPane.showMessageDialog(null, "���ݿ�����ʧ��");
		}
	}
}
