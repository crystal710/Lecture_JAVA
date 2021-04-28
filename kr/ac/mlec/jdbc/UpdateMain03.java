package kr.ac.mlec.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import kr.ac.mlec.util.ConnectionFactory;

public class UpdateMain03 {
	
	public static void main(String[] args) {
		
		String sql = "update t_test ";
		   sql += " set name = ? ";
		   sql += " where id = ? ";
		
		try(
				Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
		)
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("������ ���̵� : ");
			String id = sc.nextLine();
			System.out.print("������ �̸� : " );
			String name = sc.nextLine();
			
			pstmt.setString(1,name);
			pstmt.setString(2, id);
			
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "�� ���� �����Ǿ����ϴ�.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
