package kr.ac.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 	작업순서
 	1. 드라이버 로딩 : Class.forName()
 	2. 데이터베이스 접속 : DriverManager 를 이용하여 Connection 객체 얻기
 	3. SQL 실행
 	4. 결과 얻어옴
 	5. 접속 해제
 */
public class DBTestMain {

	public static void main(String[] args) {
		
			
		
		try {
			//1. 드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2.데이터 베이스 접속 및 Connection 객체 얻기
	
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","hr", "hr");
			System.out.println("DB접속 성공 : " + conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
