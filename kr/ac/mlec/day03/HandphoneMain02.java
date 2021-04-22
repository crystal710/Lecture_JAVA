package kr.ac.mlec.day03;

public class HandphoneMain02 {

	public static void main(String[] args) {
		
		Handphone[] hpArr = new Handphone[3];
		for(int i =0; i<hpArr.length; i++) {
			hpArr[i] = new Handphone();
		}
		hpArr[0].name = "È«±æµ¿";
		hpArr[0].phone="010-1111-2222";
		hpArr[0].company="»ï¼º";
		
		hpArr[1].name="À±±æµ¿";
		hpArr[1].phone="010-3333-4444";
		hpArr[1].company="¿¤Áö";
		
		hpArr[2].name="¹Ú±æµ¿";
		hpArr[2].phone="010-5555-6666";
		hpArr[2].company="¾ÖÇÃ";
		
		for(int i=0;i<hpArr.length;i++) {
			System.out.println(hpArr[i].name + " " + hpArr[i].phone + " " + hpArr[i].company);
		}
	}
}
