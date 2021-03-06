package co.yedam.app;
/*
 * 연산자 테스트
 * 논리 : and(&&) or (||) not(!)
 * a++ ===> a=a+1
 * ++a
 * 조건 ? t : f  == if 조건:
 * 					...
 * 					else:
 * 					...
 */
public class OperatorTest {
		public static void main(String[] args) {
		//증감연산자
		int x = 1;
		int y = 1;
//		System.out.println(x + " " + result1);
//		int result1 = ++x + 10;
//		System.out.println(String.format("x=%d 결과=%d", x, result1));
//		int result2 = y++ + 10;
//		System.out.println(String.format("x=%d 결과=%d", y, result2));
//		int result3 = ++x + y++;
//		System.out.println(String.format("x=%d y=%d 결과=%d", x, y, result3));
		
		//논리연산
		System.out.println(x>0 && y>0);
		System.out.println(x==0 && y==0);
		System.out.println(!(x==0 && y==0));
		System.out.println(x==0 || y==0);
		System.out.println(!(x==0) || !(y==0));
		
		//삼항연산
		System.out.println(x>0 && y>0 ? "둘다 양수" : "아님");		//조건 ? A : B ==> 조건이 아니라면(?) A("둘다 양수") : B("아님")
		System.out.println(x%2==0 ? "짝수" : "홀수");		//x를 2로 나눈 몫이 0이면 짝수, 아니면 홀수
		
		}
}
