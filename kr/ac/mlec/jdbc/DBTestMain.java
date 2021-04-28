package kr.ac.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 	�۾�����
 	1. ����̹� �ε� : Class.forName()
 	2. �����ͺ��̽� ���� : DriverManager �� �̿��Ͽ� Connection ��ü ���
 	3. SQL ����
 	4. ��� ����
 	5. ���� ����
 */
public class DBTestMain {

	public static void main(String[] args) {
		
			
		
		try {
			//1. ����̹��ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2.������ ���̽� ���� �� Connection ��ü ���
	
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","hr", "hr");
			System.out.println("DB���� ���� : " + conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
