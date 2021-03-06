package co.memo.view;

import java.util.List;

import co.friend.util.ScannerUtil;
import co.memo.access.MemoList;
import co.memo.model.Memo;

public class MemoCliApp {

	MemoList memoList = new MemoList();

	public void start() {
		int menunum;
		do {
			menuTitle();
			menunum = ScannerUtil.readInt("입력");
			switch (menunum) {
			case 1:
				insert();
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
		} while (menunum != 0);
	}

private void insert() {
	Memo memo = ScannerUtil.readMemo();
	memoList.insert(memo);
}

	private void update() {
		Memo memo = new Memo();
		memo.setDate(ScannerUtil.readStr());
		memo.setContent(ScannerUtil.readStr());
		memoList.update(memo);
	}

	private void delete() {
		String memo = ScannerUtil.readStr();
		memoList.delete(memo);
	}

	private void selectAll() {
		List<Memo> list = memoList.selectAll();
		for (Memo memo : list) {
			System.out.println(memo);
		}
	}

	private void findDate() {
		String date = ScannerUtil.readStr();
		Memo memo = memoList.selectd(date);
		System.out.println(memo);
	}

	private void findContent() {
		String content = ScannerUtil.readStr();
		Memo memo = memoList.selectc(content);
		System.out.println(memo);
	}

	public void menuTitle() {
		System.out.println("==== 메모 관리====");
		System.out.println("==1. 메모 등록==");
		System.out.println("==2. 메모 수정==");
		System.out.println("==3. 메모 삭제==");
		System.out.println("==4. 메모 전체조회==");
		System.out.println("==5. 날짜 검색==");
		System.out.println("==6. 내용 검색==");
		System.out.println("====0. 종료====");
	}

}
