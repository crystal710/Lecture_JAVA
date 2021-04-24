package kr.ac.mlec.day07.lotto;

import java.util.Arrays;

public class MC {
	
	private Machine machine;
	private int[] lottoNumbers;
	
	public MC() {
		machine = new Machine();
		lottoNumbers = new int[6];
	}

	public void ment() {

		System.out.println("안녕하세요. 제 xx회 로또 방송을 시작합니다.");
		
		System.out.println("로또 추첨을 시작하곘습니다.");
		
		machine.shuffle();
		
		for(int i=0; i<6;i++) {
			Ball ball = machine.getBall(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			lottoNumbers[i] = ball.getNumber();
			System.out.println(i+1 + "번째 로또 번호는 " + ball.getNumber() + "입니다.");
			
		}
		
		System.out.println("제 xx회 로또 당첨번호 " + Arrays.toString(lottoNumbers) );
	}

	
	
}
