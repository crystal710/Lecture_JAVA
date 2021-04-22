package kr.ac.mlec.day01;

public class CastMain {

	public static void main(String[] args) {
		
		double a;
		
		a = 12; // double = int 대입이 안되는게 맞음 double = double이어야하는데 잠깐만 int를 double로 변환 형변환
		//()생략 가능하면 묵시적 형변환 double이 int보다 크기때문에 묵시적 형변환이 가능하다
		
		int b;
		b = (int)12.34; // int = double 형변환 시키기 명시적 형변환

		double c = 12 + 12.34;
		
		int d = (int)(12.34 + (double)5);
		
	}

}
