package co.book;

import java.util.Scanner;

public class ScannerUtil {
	static Scanner scanner = new Scanner(System.in);
	
	public static String readBook() {
		String result = "";
		try {
			result = scanner.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static String findName() {
		String result = "";
		try {
			result = scanner.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
