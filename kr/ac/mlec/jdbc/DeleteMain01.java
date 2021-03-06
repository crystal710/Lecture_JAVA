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
			//DB 연결
			ConnectionFactory factory = new ConnectionFactory();
			conn = factory.getConnection();
			
			String sql = " delete t_test ";
				   sql += " where id = ? ";
				  
			pstmt = conn.prepareStatement(sql);
			
			Scanner sc = new Scanner(System.in);
			System.out.print("삭제할 아이디 : ");
			String id = sc.nextLine();
			
			pstmt.setString(1, id);
			
			int cnt = pstmt.executeUpdate();
			
			System.out.println(cnt + "개 행이 삭제되었습니다.");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}
}
