package co.friend.view;

import java.util.List;

import co.friend.access.FriendAccess;
import co.friend.access.FriendDAO;
import co.friend.model.Friend;
import co.friend.util.ScannerUtil;

public class FriendCliApp {
//	FriendList friendList = new FriendList();
	FriendAccess friendList = new FriendDAO();

	public void start() {
		int menunum;
		do {
			menuTitle(); // 메뉴출력
			menunum = ScannerUtil.readInt("입력"); // 메뉴선택
			switch (menunum) { // 실행
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
				findName();
				break;
			case 6:
				findTel();
				break;

			}
		} while (menunum != 0);
	}

//전화번호 검색
	private void findTel() {
		String tel = ScannerUtil.readStr();
		Friend friend = friendList.findTel(tel);
		System.out.println(friend);

	}

//이름검색
	private void findName() {
		String name = ScannerUtil.readStr();
		Friend friend = friendList.selectOne(name);
		System.out.println(friend);

	}

//전체조회
	private void selectAll() {
		List<Friend> list = friendList.selectAll();
		for (Friend friend : list) {
			System.out.println(friend);
		}

	}

//이름으로 검색해서 삭제
	private void delete() {
		String name = ScannerUtil.readStr();
		friendList.delete(name);
	}

//이름으로 검색해서 전화번호 수정
	private void update() {
		Friend friend = new Friend();
		friend.setName(ScannerUtil.readStr());
		friend.setTel(ScannerUtil.readStr());
		friendList.update(friend);
	}

//등록
	private void insert() {
		Friend friend = ScannerUtil.readFriend();
		friendList.insert(friend);
	}

//메뉴출력
	public void menuTitle() {
		System.out.println("==== 친구 관리====");
		System.out.println("==1. 친구 추가==");
		System.out.println("==2. 친구 수정==");
		System.out.println("==3. 친구 삭제==");
		System.out.println("==4. 전체 조회==");
		System.out.println("==5. 이름으로 조회==");
		System.out.println("==6. 전화번호로 조회==");
		System.out.println("====0. 종료====");
	}
}
