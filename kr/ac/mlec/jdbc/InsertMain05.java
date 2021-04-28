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
				Connection conn = new ConnectionFactory().getConnection(); //�ڵ����� close�޼ҵ� ȣ�� autoCloseable �������̽� ��ӵ� �͸� ��밡��
				PreparedStatement pstmt = conn.prepareStatement(sql);
		) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("������ ���̵� : ");
			String id = sc.nextLine();
			System.out.print("������ �̸� : " );
			String name = sc.nextLine();
			
			pstmt.setString(1,id);
			pstmt.setString(2,name);
			
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + " �� �Է�....");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
