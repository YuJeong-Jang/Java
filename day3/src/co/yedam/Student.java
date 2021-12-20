package co.yedam;
/*
 * 클래스 선언 -> new 객체 생성 -> 필드나 메서드 호출 실행
 * 1. 클래스 선언
 * 	class 이름 {		}
 */
public class Student {
//필드 + 메서드
	String name = "홍길동";
	String no = "100";
	void print() {
		System.out.println(name + " " + no);
		
	}
}
