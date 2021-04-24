package kr.ac.mlec.day06.exam;

public class StringUtil {
	
	/**
	 	���ڿ����� �� ���� ������ �����ڿ��� �����ϴ� �޼ҵ�
	 	@param str "hello world"
	 	@param delCahr 'o'
	 	@return "hell wrld"
	 	
	 */
	
	public static String delString(String str, char delChar) {
		
		//��� 2
		
		char[] chars = new char[str.length()];
		int loc = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != delChar) {
				chars[loc] += str.charAt(i);
				loc++;
			}
		}
		return new String(chars,0,loc);
		/*
		//��� 1
		String delStr = "";
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != delChar) {
				delStr += str.charAt(i);
			}
		}
		return delStr;
		*/
	}
	  
	
	/**
	   ȣ���ڿ��� ���޵� ���ڿ��� �������� ���ڿ��� �ٽ� ���� 
	   @param "Hello"
	   @return "olleH"
	 */
	
	public String reverse(String str) {
		
		//��� 2
		char[] chars = new char[str.length()];
		for(int loc =0, i = str.length()-1 ; i>=0 ; i--) { //�ʱ�ȭ�� 2������, ������ 2������
			chars[loc++] = str.charAt(i);
		}
		
//		System.out.println(Arrays.toString(chars));
		
		String revStr = new String(chars);
		
		return revStr;
		
		/*
		//��� 1
		String revStr = "";
		
		for(int i =str.length()-1; i >=0; i--) {
			revStr += str.charAt(i);
		}
		
		return revStr;
		 */
	}

}
