package kr.ac.mlec.day07.exam;

public class MC {
	
	private Machine machine;
	private int[] lottoNumbers;
	
	public MC() {
		machine = new Machine();
		lottoNumbers = new int[6];
	}
	
	public void ment() {
		System.out.println("�� xxȸ �ζ� ��÷�� �����ϰڽ��ϴ�");
		
		machine.shuffle();
		
		for(int i=0; i<6; i++) {
			Ball ball = machine.getBall(i);
			System.out.println(i+1 + " ��° ��÷ ��ȣ : " + ball.getNumber());
		}
	}

}
