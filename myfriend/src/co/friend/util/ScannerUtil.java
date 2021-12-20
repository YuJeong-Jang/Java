package co.friend.util;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import co.friend.model.Friend;
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
				System.out.println("숫자 형식이 아닙니다.");
			}
		}
		return result;
	}

	// 한줄입력
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

	public static String readDate() {
		String result = "";
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		do {
			try {
				result = scanner.next();
				df.parse(result.trim());
				break;
			} catch (Exception e) {
				System.out.println("날짜 형식이 아닙니다.");
			}
		} while (true);
		return result;
	}

	public static Friend readFriend() {
		System.out.println("구분,이름,전화번호>");
		String result = scanner.next();
		String[] arr = result.split(",");
		Friend friend = new Friend(arr[0], arr[1], arr[2]);
		friend.setGubun(arr[0]);
		friend.setName(arr[1]);
		friend.setTel(arr[2]);
		return friend;
	}
	public static Memo readMemo() {
		System.out.println("날짜,내용>");
		String result = scanner.next();
		String[] arr = result.split(",");
		Memo memo = new Memo(arr[0], arr[1]);
		memo.setDate(arr[0]);
		memo.setContent(arr[1]);
		return memo;
	}
}
