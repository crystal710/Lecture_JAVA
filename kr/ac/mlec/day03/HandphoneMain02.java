package kr.ac.mlec.day03;

public class HandphoneMain02 {

	public static void main(String[] args) {
		
		Handphone[] hpArr = new Handphone[3];
		for(int i =0; i<hpArr.length; i++) {
			hpArr[i] = new Handphone();
		}
		hpArr[0].name = "ȫ�浿";
		hpArr[0].phone="010-1111-2222";
		hpArr[0].company="�Ｚ";
		
		hpArr[1].name="���浿";
		hpArr[1].phone="010-3333-4444";
		hpArr[1].company="����";
		
		hpArr[2].name="�ڱ浿";
		hpArr[2].phone="010-5555-6666";
		hpArr[2].company="����";
		
		for(int i=0;i<hpArr.length;i++) {
			System.out.println(hpArr[i].name + " " + hpArr[i].phone + " " + hpArr[i].company);
		}
	}
}
