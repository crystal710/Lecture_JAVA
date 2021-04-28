package kr.ac.mlec.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import kr.ac.mlec.util.ConnectionFactory;
import kr.ac.mlec.util.JDBCClose;

public class UpdateMain02 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			ConnectionFactory factory = new ConnectionFactory();
			conn = factory.getConnection();
			
			String sql = "update t_test ";
				   sql += " set name = ? ";
				   sql += " where id = ? ";
			
			Scanner sc = new Scanner(System.in);
			System.out.print("변경할 아이디 : ");
			String id = sc.nextLine();
			System.out.print("변경할 이름 : " );
			String name = sc.nextLine();
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,name);
			pstmt.setString(2, id);
			
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행이 수정되었습니다.");
				   
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCClose.close(conn, pstmt);
		}
	}
}
