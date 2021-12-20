package 배열;

import java.awt.Point;

/* 
 * 객체배열 : 배열의 요소 타입이 객체인 경우
 */
public class 객체배열 {
	public static void main(String[] args) {
		// 변수선언
		Score[] a;
		a = new Score[10];
		a[0] = new Score("홍길동", 100, 90, 80);
		a[1] = new Score("김유신", 70, 80, 90);
		a[2] = new Score("장영실", 60, 90, 100);

		// 이름만 출력
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.println(a[i].name);
			}
		}
		// 선언과 동시에 초기화
		Score[] b = { new Score("홍길동", 100, 90, 80), new Score("김유신", 70, 80, 90), new Score("장영실", 60, 90, 100) };

		//				" : "이 in의 역할(확장 for문)
		for(Score score : b ) {	
			System.out.println((score.name + score.total));
//		for (int j = 0; j < b.length; j++) {
//			if (a[j] != null) {
//				System.out.println("이름:" + b[j].name + " " + "총점:" + b[j].total);
	
		}
	//객체배열
	Point[] c = {new Point(10, 10), new Point(10, 30), new Point(30, 10), new Point(30, 30)};
	
	for(Point score : c ) {	
		System.out.println(score.x + "" + score.y);
	}
	
	
	}}