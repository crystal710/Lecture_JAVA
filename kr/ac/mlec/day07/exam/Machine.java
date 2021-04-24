package kr.ac.mlec.day07.exam;

import java.util.Random;

public class Machine {
	
	private Ball[] balls;
	public Machine() {
		balls = new Ball[45];
		for(int i=0; i< balls.length; i++) {
			balls[i] = new Ball(i+1);
		}
	}
	
	public void shuffle() {
		Random r = new Random();
		
		for(int i=0; i < balls.length; i++) {
			int randomidx = r.nextInt(45-i)+i;
			Ball temp = balls[i];
			balls[i] = balls[randomidx];
			balls[randomidx] = temp;
		}
		
	}
	
	public Ball getBall(int idx) {
		return balls[idx];
	}

}
