package co.Memo;

import java.util.Scanner;

public class MemoInsert implements MemoService {
	Scanner scanner = new Scanner(System.in);

	public MemoInsert() {
	}

	@Override
	public void execute(MemoData memos) {
		System.out.print("DATE>");
		String date = scanner.next();
		System.out.print("TITLE>");
		String title = scanner.next();
		System.out.print("CONTENT>");
		String content = scanner.next();

		int no = memos.memos.size()+1;
		
		memos.insert(new Memo(no, date, title, content));
	}

}
