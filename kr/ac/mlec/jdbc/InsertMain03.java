package kr.ac.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
 	아이디를 입력하세요 : kang
 	이름을 입력하세요 : 강길동
 */
public class InsertMain03 {
	

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			
			String sql  = "insert into t_test(id,name) ";
				   sql += "values(?,?)";
				   
			Scanner sc = new Scanner(System.in);
			System.out.print("아이디를 입력 : ");
			String id = sc.nextLine();
			System.out.print("이름을 입력 : ");
			String name = sc.nextLine();
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			
			int cnt = pstmt.executeUpdate();
			System.out.println("총 " + cnt + "개 행이 삽입되었습니다.");
			
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
