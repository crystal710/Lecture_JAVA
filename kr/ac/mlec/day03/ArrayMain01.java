package kr.ac.mlec.day03;

public class ArrayMain01 {

	public static void main(String[] args) {
		
		//������ 5�� �����ϴ� �迭 iArr ����
		
		int[] iArr;
		iArr = new int[5];
		
		System.out.println("�迭ũ�� : " + iArr.length);
		
		for(int i = 0; i<iArr.length; i++) {
			System.out.println(i+ "��° ���� : " + iArr[i]);
		}
		
		/*
		System.out.println("ù��° ���� : " + iArr[0]);
		System.out.println("�ι�° ���� : " + iArr[1]);
		System.out.println("����° ���� : " + iArr[2]);
		System.out.println("�׹�° ���� : " + iArr[3]);
		System.out.println("�ټ���° ���� : " + iArr[4]);
		
		*/
		
		/*
		iArr[0] = 10;
		iArr[1] = 20;
		iArr[2] = 30;
		iArr[3] = 40;
		iArr[4] = 50;
		*/
		
//		for(int i =0; i<iArr.length; i++) {
//			iArr[i] = 10 * (i+1);
//		}
		
		for(int i =0; i<iArr.length ; i++) {
			iArr[i] = 10 * (i+1);
			System.out.print(iArr[i] + " ");
		}
		System.out.println();
		
		for(int num : iArr) { //�����̸� ��� ��밡���� 1.5 for��
			System.out.print(num + " ");
		}
	}
}
