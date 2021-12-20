package 열거타입;

import java.util.Scanner;

public class EnumWeekExample {

	public static void main(String[] args) {
		// 1.요일명
//		String week = "SUA";

		// 2.배열
//		String[] week = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
//		String today = week[6];

		// 3.enum
//		Week today = Week.SUN;
		Scanner scanner = new Scanner(System.in);
		Menu menu = null;
		do {
			Menu.print();
			int menuno = scanner.nextInt();
			menu = Menu.getMenu(menuno);
		switch(menu) {
		case 등록 : System.out.println("등록"); break;
		case 수정 : System.out.println("수정"); break;
		case 삭제 : System.out.println("삭제"); break;
		}
		} while (menu != Menu.종료);
		System.out.println("end");
	}
		
//		int menu = 0;
//		do {
//			System.out.println("1.등록 2.수정 3.삭제 0.종료");
//			 menu = scanner.nextInt();
//			if (menu == 1) {
//				System.out.println("등록");
//			} else if (menu == 2) {
//				System.out.println("수정");
//			} else if (menu == 3) {
//				System.out.println("삭제");
//			}
//
//		} while (menu != 0);

	}
