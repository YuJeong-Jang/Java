package exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Quiz03 {
	public static void main(String[] args) {
		String[] arr = { "bb.jpg", "area.txt", "moomin.jpeg", "work.txt", "you.JPG" };
		ArrayList<String> lili = new ArrayList<String>();

		int z = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains("jpg") || arr[i].contains("jpeg") || arr[i].contains("JPG")) {
				System.out.println(arr[i]);
			}
		}
			
				for (int h = 0; h < arr.length; h++) {
					if (arr[h].contains("jpg")) {
						z++;
					} else if (arr[h].contains("jpeg")) {
						z++;
					} else if (arr[h].contains("JPG")) {
						z++;
					}
				}
				System.out.println("이미지 파일 수 : " + z);
}
	}