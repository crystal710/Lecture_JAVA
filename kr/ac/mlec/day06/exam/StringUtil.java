package kr.ac.mlec.day06.exam;

public class StringUtil {
	
	/**
	 	문자열에서 한 문자 삭제한 뭄ㄴ자열을 구성하는 메소드
	 	@param str "hello world"
	 	@param delCahr 'o'
	 	@return "hell wrld"
	 	
	 */
	
	public static String delString(String str, char delChar) {
		
		//방법 2
		
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
		//방법 1
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
	   호출자에서 전달된 문자열을 뒤집어진 문자열로 다시 전달 
	   @param "Hello"
	   @return "olleH"
	 */
	
	public String reverse(String str) {
		
		//방법 2
		char[] chars = new char[str.length()];
		for(int loc =0, i = str.length()-1 ; i>=0 ; i--) { //초기화는 2개가능, 증감도 2개가능
			chars[loc++] = str.charAt(i);
		}
		
//		System.out.println(Arrays.toString(chars));
		
		String revStr = new String(chars);
		
		return revStr;
		
		/*
		//방법 1
		String revStr = "";
		
		for(int i =str.length()-1; i >=0; i--) {
			revStr += str.charAt(i);
		}
		
		return revStr;
		 */
	}

}
