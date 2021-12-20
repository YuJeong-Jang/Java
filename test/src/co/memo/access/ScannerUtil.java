package co.memo.access;

import java.util.Scanner;

import co.memo.model.Memo;

public class ScannerUtil {
	static Scanner scanner = new Scanner(System.in);

	public static int readInt() { 						// 리턴타입이 변해도 같은 메소드 선언할 수 없음.
		int result = 0; 								// 매개변수와 순서가 달라야 함.
		while (true) {
			try {
				String temp = scanner.next();
				result = Integer.parseInt(temp);
				break;
			} catch (Exception e) {
				System.out.println("숫자형식이 아닙니다.");
			}
		}
		return result;
	}

//	 한줄입력
	public static int readInt(String prompt) {
		System.out.println(prompt + ">");
		return readInt();
	}

	
	
	public static String readStr() {
		String result = "";
		try {
			result = scanner.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public static String readStr(String prompt) {
		System.out.println(prompt + ">");
		return readStr();
	}
	
	public static Memo readMemo() {
		System.out.println("날짜,제목,내용>");
		String result = scanner.next();
		String[] arr = result.split(",");
		Memo memo = new Memo(arr[0], arr[1], arr[2]);
		memo.setDate(arr[0]);
		memo.setTitle(arr[1]);
		memo.setContent(arr[2]);
		return memo;

}
}
	
