package co.Memo;

import java.util.Scanner;

public class MemoApp {
	public static void main(String[] args) {
		MemoData memos = new MemoData();
		memos.insert(new Memo(1,"20210102", "자바", "자바를 배우자"));
		memos.insert(new Memo(2,"20210102", "모임", "1시에 모임"));
		int menu = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("1.등록 2. 날짜로조회 3.종료");
			System.out.println("입력>");
			menu = scanner.nextInt();
			if(menu == 1) {
				MemoInsert service = new MemoInsert();
				service.execute(memos);
			} else if (menu == 2) {
				MemoFindDate service = new MemoFindDate();
				service.execute(memos);
			}
		}while (menu !=0);
	}
}
