package co.Memo;

import java.util.List;
import java.util.Scanner;

public class MemoFindDate implements MemoService {
	public MemoFindDate() {
	}

	Scanner scanner = new Scanner(System.in);

	@Override
	public void execute(MemoData memos) {
		System.out.println("날짜를 입력하시오>");
		String date = scanner.next();

		List<Memo> list = memos.findDate(date);

		for (Memo l : list) {
			System.out.println(l);
		}

	}

}
