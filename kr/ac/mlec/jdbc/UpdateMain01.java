package kr.ac.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
 	id가 hang인 회원의 이름을 행길동으로 변경
 	
 	update t_test set name = '행길동'
 	where id= 'hang'
 */

public class UpdateMain01 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			
			String sql  = "update t_test ";
				   sql += "set name = ? ";
				   sql += "where id = ? ";
				   
			Scanner sc = new Scanner(System.in);
			System.out.print("이름을 입력 : ");
			String name = sc.nextLine();
			System.out.print("아이디를 입력 : ");
			String id = sc.nextLine();
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			
			int cnt = pstmt.executeUpdate();
			System.out.println("총 " + cnt + "개 행이 업데이트되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			if(pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
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
