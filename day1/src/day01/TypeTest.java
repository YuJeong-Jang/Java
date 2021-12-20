package day01;
/*
 * 데이터형 연습
 *	1		2		4	8		4		8 
 * byte > short > int > long > float > double
 * 				  char
 * boolean
 */
public class TypeTest {
	public static void main(String[] args) {
//	System.out.println(Integer.MAX_VALUE);
//	System.out.println(Long.MAX_VALUE);
//	long a = 21474836479L;
//	int b = 20;
//	System.out.println(a+b);
	float f = 0.123456789f;
	System.out.println(f); //마지막자리 수는 올림해서 올려서 마지막이 9로 끝남
	double d = 0.1234567890123456;
	System.out.println(d);
	
	//진수표현
	int b = 0111; //0으로 시작하면 8진수
	System.out.println("8진수 111=" + b);
	
	//10진수를 8진수로 변환
	int b8 = 015 + 04;
	System.out.println(b8 + " " + Integer.toOctalString(b8));
	
	//0x로 시작하면 16진수
	int b16 = 0xFF; 
	System.out.println(b16);
	
	//0b로 시작하면 2진수
	int b2 = 0b1111;
	System.out.println(b2);
	
	//char
	System.out.println("==========");
	char c1 = '가';									
	System.out.println((int)c1);						//10진수
	System.out.println(Integer.toHexString(c1));		//16진수
	char c2 = '\uac01';
	int c3 = 44033;
	System.out.println(c2);
	System.out.println((char)c3);
	
	}
}
