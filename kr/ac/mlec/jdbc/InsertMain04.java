package kr.ac.mlec.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import kr.ac.mlec.util.ConnectionFactory;
import kr.ac.mlec.util.JDBCClose;

/*
 	아이디를 입력하세요 : kang
 	이름을 입력하세요 : 강길동
 */
public class InsertMain04 {
	

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			ConnectionFactory factory = new ConnectionFactory();
			conn = factory.getConnection();
			
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
			
			JDBCClose.close(conn, pstmt);
			
//			JDBCClose.close(pstmt);
//			JDBCClose.close(conn);
			
		}
		
	}
}
