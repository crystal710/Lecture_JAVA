package kr.ac.mlec.day05;

public class StringMain04 {
	
	public static void main(String[] args) {
		
		String str = new String ("hello");
		String str2 = new String("hello");
		
		System.out.println("str : [" + str + "]");
		System.out.println("str2 : [" + str2 + "]");
		
		
		//�������� ��
		if(str == str2) {
			System.out.println("�ּҺ� str == str2");
		}else {
			System.out.println("�ּҺ� str != str2");
		}
		
		//���ڿ� ��
		boolean bool = str.equals(str2);
		if(bool) {
			System.out.println("���ڿ��� str == str2");
		}else {
			System.out.println("���ڿ��� str != str2");
		}
		
		System.out.println("hello.equal(Hello) : " + "hello".equals("Hello"));
		System.out.println("hello.equal(Hello) : " + "hello".equalsIgnoreCase("Hello"));
		
		System.out.println(str.startsWith("h")? "h�� �����մϴ�" : "h�� �������� �ʽ��ϴ�");
		System.out.println("Hello".startsWith("h")? "h�� �����մϴ�" : "h�� �������� �ʽ��ϴ�");
		
		String[] names = {"ȫ�浿","���浿","ȫ���","��ȫ��","�����","ȫ�浿"};
		System.out.println("< ��ü ȸ�� ����Ʈ > ");
		for(String name : names) {
			System.out.println(name);
		}
		
		System.out.println("< ȸ������ \"ȫ�浿\"�� ȸ�� ��� >");
		for(String name : names) {
			if(name.equals("ȫ�浿"))
				System.out.println(name);
		}
		
		System.out.println("< \"ȫ\"�� ���� ���� ȸ�� ��� >");
		for(String name : names) {
			if(name.startsWith("ȫ")) {
				System.out.println(name);
			}
		}
		
		System.out.println("< �̸���\"�浿\"�� ȸ�� ��� >");
		for(String name : names) {
			if(name.endsWith("�浿")) {
				System.out.println(name);
			}
		}
			
		System.out.println("< �̸���\"�浿\"�� ȸ�� ��� >");
		for(int i = 0; i< names.length; i++) {
			if(names[i].endsWith("�浿")) {
				System.out.println(names[i]);
			}
		}
		
		System.out.println("< \"ȫ\"�� ���Ե� ȸ�� ��� >");
		for(String name : names) {
			if(name.contains("ȫ")) { //�߰��� ���ԵǾ��ִ� �͵� ���Ⱑ��
				System.out.println(name);
			}
		}
		
//		str = "banana";
		str = "board";
		str2 = "boat";
		
		int compare = str.compareTo(str2); //compareTo : ���� ������ �ľ� ���İ����� �Ҷ� �ַ� ���
		if(compare ==0) {
			System.out.println(str + " == " + str2);
		}else if(compare > 0) {
			System.out.println(str2 + " < " + str);
		}else {
			System.out.println(str + " < " + str2);
		}
		
		str = "hello world";
		System.out.println("str : ["+str+"]");
		int index = str.indexOf('o');
		System.out.println("indexOf(\"o\") : " +index);
		
		index = str.lastIndexOf('o');
		System.out.println("lastIndexOf(\"o\") : " +index);
		
		index = str.indexOf('p');
		System.out.println("indexOf(\"p\") : " +index); //���� ���ڿ��϶� -1�� ����
		
		System.out.println("< \"l\"�� ��� ��ġ ��� >");
		index = str.indexOf('l');
		while(index != -1) {
			System.out.println(index+ "������ \'l\' ����");
			index = str.indexOf('l', index+1);
		}
		
		
	}

}
