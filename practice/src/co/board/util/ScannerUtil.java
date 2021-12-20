package co.board.util;

import java.util.Scanner;

import co.board.model.Board;

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
	
	public static Board readBoard() {
		System.out.println("글제목,내용,작성자>");
		String result = scanner.next();
		String[] arr = result.split(",");
		Board board = new Board(arr[0], arr[1], arr[2]);
		board.setTitle(arr[0]);
		board.setContent(arr[1]);
		board.setWriter(arr[2]);
		return board;

}
}
	
