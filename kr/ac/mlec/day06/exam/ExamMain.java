package kr.ac.mlec.day06.exam;

public class ExamMain {
	
	public static void main(String[] args) {

		StringUtil util = new StringUtil();
		
		String str = "Hello World";
		String revStr = util.reverse(str);
		
		System.out.println("str : " + str);
		System.out.println("reverse() : " + revStr);
		
		String delStr = StringUtil.delString(str, 'o');
		
		System.out.println("delString() : " + delStr);
		
	}

}
