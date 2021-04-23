package kr.ac.mlec.day05;

public class StringMain06 {
	public static void main(String[] args) {
		
		String str = "hello world";
		
		String sub = str.substring(1, 7); //������ 7��° ���� ���ڸ� ����
		System.out.println("str : " + str);
		System.out.println("substring(1,7) : " + sub);
		
		int searchIdx = str.indexOf("world");
		
		sub = str.substring(searchIdx, searchIdx +"world".length());
		System.out.println(sub);
		
		sub = str.substring(searchIdx, str.length());
		System.out.println(sub);
		
		sub = str.substring(searchIdx);
		System.out.println(sub);
		
		String a = "good";
		String b = "bye";
		String c = a.concat(b);
		
		System.out.println(c);
		
		str = " hello world";
		System.out.println("str : "+ str);
		System.out.println("replace('l','r') : " + str.replace('l', 'r'));
		System.out.println("replace('l','rrrrr') : " + str.replace("l", "rrrr"));
		
		str = "          hello world         ";
		System.out.printf("[%s] ���� : %d\n",str, str.length());
		
		String trimStr = str.trim();
		System.out.printf("trim() [%s] ���� : %d\n",trimStr, trimStr.length()); //�߰����ִ� ������ ���������� �糡�� ���鸸 ����
		
		str = "ȫ�浿��:���:�����ô�";
		
		String[] strArr = str.split(":"); //�迭���·� ���尡��
		for(String s : strArr) {
			System.out.println(s);
		}
		
		str = "Hello Wolrd!!!";
		System.out.println("str : " + str);
		System.out.println("toLowerCase() : "+ str.toLowerCase());
		System.out.println("toUpperCase() : "+ str.toUpperCase());
		
		System.out.println(12 + 10);
		System.out.println(String.valueOf(12)+10); //println("12"+10)
		
		int no = Integer.parseInt("123"); //���� ���ڸ� ������ �ٲٴ� �޼ҵ� : Integer.parseInt()
		System.out.println(no + 100);
		
		
	}
}






