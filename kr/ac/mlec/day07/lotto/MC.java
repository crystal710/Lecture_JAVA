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

		System.out.println("�ȳ��ϼ���. �� xxȸ �ζ� ����� �����մϴ�.");
		
		System.out.println("�ζ� ��÷�� �����ρٽ��ϴ�.");
		
		machine.shuffle();
		
		for(int i=0; i<6;i++) {
			Ball ball = machine.getBall(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			lottoNumbers[i] = ball.getNumber();
			System.out.println(i+1 + "��° �ζ� ��ȣ�� " + ball.getNumber() + "�Դϴ�.");
			
		}
		
		System.out.println("�� xxȸ �ζ� ��÷��ȣ " + Arrays.toString(lottoNumbers) );
	}

	
	
}
