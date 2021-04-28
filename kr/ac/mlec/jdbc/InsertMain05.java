package kr.ac.mlec.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import kr.ac.mlec.util.ConnectionFactory;

public class InsertMain05 {

	public static void main(String[] args) {
		
		String sql = "insert into t_test ";
			   sql += " values (?,?) ";
		
		try(
				Connection conn = new ConnectionFactory().getConnection(); //자동으로 close메소드 호출 autoCloseable 인터페이스 상속된 것만 사용가능
				PreparedStatement pstmt = conn.prepareStatement(sql);
		) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("삽입할 아이디 : ");
			String id = sc.nextLine();
			System.out.print("삽입할 이름 : " );
			String name = sc.nextLine();
			
			pstmt.setString(1,id);
			pstmt.setString(2,name);
			
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + " 행 입력....");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
