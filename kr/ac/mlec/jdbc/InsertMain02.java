package kr.ac.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
 	���̵� �Է��ϼ��� : kang
 	�̸��� �Է��ϼ��� : ���浿
 */
public class InsertMain02 {
	

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			
			stmt = conn.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.print("���̵� �Է� : ");
			String id = sc.nextLine();
			System.out.print("�̸��� �Է� : ");
			String name = sc.nextLine();
			
			String sql = "insert into t_test(id,name) ";
			       sql += "values(\'" +id +"\',\'" + name+"\') ";
			       
			int cnt = stmt.executeUpdate(sql);
			System.out.println("�� " + cnt + "�� ���� ���ԵǾ����ϴ�.");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
