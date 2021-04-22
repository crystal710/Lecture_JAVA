package kr.ac.mlec.day04;

import java.util.Scanner;

public class Gugudan {

	int getDan() {
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		return dan;
	}
	
	int getDan(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		int dan = sc.nextInt();
		
		return dan;
	}
	
	void print(int dan) {
		System.out.println("*** " + dan + "´Ü ***");
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		}
		System.out.println();
	}

	void print() {
		print(2,9);
		/*
		 * for(int dan = 2; dan<=9 ; dan++) {
			print(dan);
		}
		 */
		
		/*
		for(int dan =2; dan<=9 ; dan++) {
			System.out.println("*** " + dan + "´Ü ***");
			for(int i=1; i<=9; i++) {
				System.out.printf("%d * %d = %d\n",dan,i,dan*i);
			}
			System.out.println();
		}
		*/
	}
	
	void print(int sDan, int eDan) {
		
		for(int dan=sDan; dan <=eDan; dan++) {
			print(dan);
		}
		
		/*
		for(int dan=sDan; dan<=eDan; dan++) {
			System.out.println("*** " + dan + "´Ü ***");
			for(int i=1; i<=9 ; i++) {
				System.out.printf("%d * %d = %d\n",dan,i,dan*i);
			}
		}
		*/
	}

	
}
