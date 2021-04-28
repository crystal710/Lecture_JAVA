package kr.ac.mlec.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import kr.ac.mlec.util.ConnectionFactory;
import kr.ac.mlec.util.JDBCClose;

public class DeleteMain01 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//DB ����
			ConnectionFactory factory = new ConnectionFactory();
			conn = factory.getConnection();
			
			String sql = " delete t_test ";
				   sql += " where id = ? ";
				  
			pstmt = conn.prepareStatement(sql);
			
			Scanner sc = new Scanner(System.in);
			System.out.print("������ ���̵� : ");
			String id = sc.nextLine();
			
			pstmt.setString(1, id);
			
			int cnt = pstmt.executeUpdate();
			
			System.out.println(cnt + "�� ���� �����Ǿ����ϴ�.");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}
}
