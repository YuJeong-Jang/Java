package co.yedam.app;

import java.util.Scanner;

public class Memberinfo {
	
	//키, 몸무게
	double hight;
	double weight;
	void hightweightInput() {
		Scanner scanner = new Scanner(System.in);
		weight = scanner.nextDouble();
		hight = scanner.nextDouble();
	}
	
	String bmi() {
		double result = 0;
		result = weight / (hight* hight);
		String s = "";
		if(result<=18.5) {
			s = "저체중";
		}else if(result<=23) {
			s = "정상";
		}else if(result<=25) {
			s = "과체중";
		}else if(result<=30) {
			s ="비만";
		}else if(result>30) {
			s ="고도비만";
		}
		return s;
	}
	
//	double bmi() {
//		double result = 0;
//		result = weight / (hight* hight);
//		return result;}
//}

//	String name;
//	String id;
//	String tel;
//	
//	void input() {
//		int a = 10;
//		Scanner scanner = new Scanner(System.in);
//		//코드작성
//		System.out.print("1. 이름:");
//		name = scanner.next();
//		System.out.println("2. 주민번호 앞 6자리 :");
//		id = scanner.next();
//		System.out.println("3. 전화번호 :");
//		tel = scanner.next();		
//	}
//	
//	void print() {
//		System.out.println(name);
//		System.out.println(id);
//		System.out.println(tel);
	}
