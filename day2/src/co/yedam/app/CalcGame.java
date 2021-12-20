package co.yedam.app;
/*
 *계산기 게임
 *사칙연산, 진수변환, 문자값 검사
 */
public class CalcGame {
	double a;
	double b;
	//1~cnt까지의 합을 계산
	int sum(int cnt) {
		int result = 0;
		//코드작성
		int i = 0;
		for(i=1; i<=cnt; i++) {
			result += i;
		}
		return result;
				
	}
	
	
	
	//def add(a,b):		여기서 콜론역할이 자바에서는 중괄호
	//	return(a+b)
	
	//정수형
//	//정수값 두 수의 합을 구하는 method(함수)
//	int add(int a, int b) {
//		return a+b;
//	}
//	//두 수의 몫을 계산 5/2 = 2
//	int share(int a, int b) {
//		return a/b;
//	}
//	//두 수의 나눗셈 계산 5/2 = 2.5
//	double div(int a, int b) {
//		return (double)a/b;
//	}
//	//두 수의 나머지 계산 5%2 = 1
//	int rest(int a, int b) {
//		return a%b;
//	}
	
	//실수형
//	//정수값 두 수의 합을 구하는 method(함수)
//	double add(double a, double b) {
//		return (float)a+b;
//	}
//	//두 수의 몫을 계산 5/2 = 2
//	double share(double a, double b) {
//		return (double)a/b;
//	}
//	//두 수의 나눗셈 계산 5/2 = 2.5
//	double div(double a, double b) {
//		return (float)a/b;
//	}
//	//두 수의 나머지 계산 5%2 = 1
//	double rest(float a, float b) {
//		return (float)a%b;
//	}
//}
//	
//	string형(해볼것)
//	
//	double add(double a, double b) {
//		return (float)a+b;
//	}
//	
//	double share(double a, double b) {
//		return (double)a/b;
//	}
//	
//	double div(double a, double b) {
//		return (float)a/b;
//	}
//	
//	double rest(float a, float b) {
//		return (float)a%b;
//	}
//	
	//두 수의 나머지 계산 5%2 = 1
//	double a;
//	double b;
//	void input() {
//		//입력
//	     Scanner scanner = new Scanner(System.in);
//	     System.out.print("Enter number: ");
//	     String s1 = scanner.next();
//	     System.out.print("Enter number: ");
//	     String s2 = scanner.next();
//	     a = Double.parseDouble(s1);
//	     b = Double.parseDouble(s2);
//	     scanner.close();
//	      
	   }
