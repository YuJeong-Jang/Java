package array4day;
import java.util.Scanner;

public class ArrayApp {
	int[] arr; // 성적저장
	int studentNum; // 학생수
	// 초기값 지정
	Scanner scanner = new Scanner(System.in);
	//학생수
	void init() {
		System.out.println("인원수>");
		studentNum = scanner.nextInt();
		arr = new int[studentNum];
	}
	//점수입력
	void input() {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]>", i);
			arr[i] = scanner.nextInt();
		}
	}
	//점수리스트
	void print() {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]> %d\n", i, arr[i]);
		}
	}
	// 평균
	void div() {
		int result = 0;
		for (int s = 0; s < arr.length; s++) {
			result += arr[s];
		}
		double finalNum = result / studentNum;
		System.out.println("평균:" + finalNum);
	}

	// 최대값
	void max() {
		int max = 0;
		for (int z = 0; z < arr.length; z++) {
			max = arr[z];
		}
		System.out.println("최고점수:" + max);
	}

	public static void main(String[] args) {

		ArrayApp app = new ArrayApp();
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		
		int selectNo = 0;
		while (run) {
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.println("선택>");
			selectNo = scanner.nextInt();
			if (selectNo == 1) {
				app.init();
			}
			else if (selectNo == 2) {
				app.input();
			}
			else if (selectNo == 3) {
				app.print();
			}
			else if (selectNo == 4) {
				app.div();
				app.max();
			}
			else if (selectNo == 5) {
				System.out.println("히히히히히히히히힣히히히힣");
				run =false;
			}
		
		}
		
	}
}
