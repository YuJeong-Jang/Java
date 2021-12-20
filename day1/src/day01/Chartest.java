package day01;

public class Chartest {
	public static void main(String[] args) {
		
		//대소문자
		char c1 = 'A';
		int c2 = c1 + 32;		//32를 더하면 소문자가 대문자로 변함
								//32를 빼면 대문자가 소문자로 변함
		System.out.println(c2 + " " + (char)c2);
	
		char c3 = '\uac00';
		char c4 = 0xac00;
		char c5 = '가';
		char c6 = 44032;
		System.out.println(c3 + " " + c4 + " " + c5 +  " " + c6);
		
		//문자열
		String s ="안녕\n\n 하세요";
		System.out.println(s);

	
	}
}
