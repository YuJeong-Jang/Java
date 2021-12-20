package pkg.friend;

import pkg.friend.*;

public class FriendAppMain {

	public static void main(String[] args) {
	FriendList list = new FriendList();
	//등록
	Friend f = new CompanyFriend("현대해상", "김길동", "222");
	list.insert(f);
	f = new SchoolFriend("현대고", "홍길동", "444");
	list.insert(f);
	//검색
	System.out.println(list.selectOne("홍길동"));
	//수정
	f = new SchoolFriend("해상고", "홍길현", "555");
	list.insert(f);
	//삭제
	list.delete("홍길동");
	//전체조회
	list.selectAll();
	
	}

}
