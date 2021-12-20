package co.yedam.app;

import java.util.Scanner;

/*
 * 형 변환 : 캐스트연산자(타입)
 * 정수형 : byte < short < int < long
 * 실수형 : 				float < double
 * string	<-----> byte		Byte.parseByte(변수)				
 * 					short		Short.parseShort(변수)
 * 					int			Integer.parseInt(변수)
 * 					long		Long.parseLong(변수)
 * 					float		Float.parseFloat(변수)
 * 					double		Double.parseDouble(변수)
 * 					char		Char.parseChar(변수)
 * 					boolean		Boolean.parseBoolean(변수)
 * String str = String.ValueOf(타입값)
 */
public class CastTest {

	public static void main(String[] args) {
		//자동 형변환
		int a = 10;
		long b = a;
		
		//강제 형변환
		a = (int)b;
		
		//char(문자) <-> int(코드)
		char c = 'Z';
		System.out.println((int)c);
		int d = 97;
		System.out.println((char)d);
		//실수(double) <-> 정수(int)
		double e = 10.5;
		int f = (int)e;
		System.out.println(f);
		long g = (int)e;
		System.out.println(g);
//		int h = (long)e;	큰(long)값은 작은(int)값에 들어갈 수없다.(에러뜸)
		double o = 5 + 10.5;
		String p = "hi" + 5;
		System.out.println(p);
		System.out.println("hi" + 5 + 10);
		//5와 10을 괄호로 묶어주지 않으면 hi(string)와 5(int)가 먼저 계산되므로 결과는 hi510
		System.out.println(5 + 10 + "hi");
		//5와 10을 앞에 넣으면 숫자끼리 먼저 계산되므로 결과는 15hi
		//두개씩 묶어서 계산되므로 string과 int냐, string끼리냐, int끼리냐에 따라 결과값이 달라짐.
		
		//정수끼리의 연산결과는 정수만 나옴.
		System.out.println(5/2);
		System.out.println(5/(double)2);	//5나 2를 double(실수)로 바꾸면 double형태로 출력됨.
		
		double i = 5 / (double)2;
		System.out.println(i);
	
		//string -> int
		String s1 = "123";
		int j = Integer.parseInt(s1);
		System.out.println(j);
		
		//int -> string
		String s2 = String.valueOf(10.5);
		System.out.println(s2);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력:");
		String greet = scanner.next();
		System.out.println(greet);
	
	
	
	
	
	}

}
