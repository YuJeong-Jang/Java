package common;

import java.util.Scanner;

public class AppMain {
  
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	System.out.println("이름입력 : ");
	String name = scn.next();
	System.out.println("입력값 : " + name);
	
	System.out.println("exit");
	String str = scn.nextLine();
	if(str.equals("exit")) {
		System.out.println("종료");
	} else {
		System.out.println("그냥 종료");
	}
	System.out.println("프로그램 종료");
	scn.close();
	}

}
