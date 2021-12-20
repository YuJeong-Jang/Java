package co.memo.view;

import java.util.List;
import java.util.Scanner;

import co.memo.access.MemoAccess;
import co.memo.access.MemoDAO;
import co.memo.access.ScannerUtil;
import co.memo.model.Memo;

public class MemoCliApp {

	MemoAccess access = new MemoDAO(); // 데이터베이스 입출력 처리하세요.
	Scanner scanner = new Scanner(System.in);

	public void start() {
		int menuNum;

		do {
			menuTitle();
			System.out.print("입력 > ");
			menuNum = scanner.nextInt();
			switch (menuNum) {
			case 1:
				write();
				break;
			case 2:
				update();
				break;
			case 3:
				delete();
				break;
			case 4:
				selectAll();
				break;
			case 5:
				findDate();
				break;
			case 6:
				findContent();
				break;
			}
		} while (menuNum != 0);
		System.out.println("프로그램 종료.");
	}

	private void write() {
		Memo memo = ScannerUtil.readMemo();
		access.write(memo);
	}

	private void update() {
		Memo memo = new Memo();
		memo.setDate(ScannerUtil.readStr());
		memo.setContent(ScannerUtil.readStr());
		access.update(memo);
	}

	private void delete() {
		String memo = ScannerUtil.readStr();
		access.delete(memo);
	}

	private void selectAll() {
		List<Memo> list = access.FindAll();
		for (Memo memo : list) {
			System.out.println(memo);
		}
	}

	private void findDate() {
		String date = ScannerUtil.readStr();
		Memo memo = access.FindByDate(date);
		System.out.println(memo);
	}

	private void findContent() {
		String content = ScannerUtil.readStr();
		Memo memo = access.FindByContent(content);
		System.out.println(memo);
	}

	private void menuTitle() {
		System.out.println("== 메모 관리 ==");
		System.out.println("=1. 메모 추가");
		System.out.println("=2. 메모 수정");
		System.out.println("=3. 메모 삭제");
		System.out.println("=4. 전체 조회");
		System.out.println("=5. 날짜로 조회");
		System.out.println("=6. 내용으로 조회");
		System.out.println("=0. 종료");
		System.out.println("===============");

	}

}
