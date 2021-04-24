package kr.ac.mlec.day07.exam;

public class MC {
	
	private Machine machine;
	private int[] lottoNumbers;
	
	public MC() {
		machine = new Machine();
		lottoNumbers = new int[6];
	}
	
	public void ment() {
		System.out.println("제 xx회 로또 추첨을 시작하겠습니다");
		
		machine.shuffle();
		
		for(int i=0; i<6; i++) {
			Ball ball = machine.getBall(i);
			System.out.println(i+1 + " 번째 당첨 번호 : " + ball.getNumber());
		}
	}

}
