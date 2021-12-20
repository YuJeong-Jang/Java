package co.friend.access;

import java.util.ArrayList;

import co.friend.model.Friend;

/**
 * 
 * 인터페이스 : 상수필드 + 추상메서드 상수필드 : public static final 메서드 : public abstract
 *
 */
//친구관리 개발시 개발 표준
public interface FriendAccess {
//	public static final String model = "ddd";

	// 등록
	public void insert(Friend friend);

	// 수정
	public void update(Friend friend);

	// 삭제
	public void delete(String name);

	// 전체조회
	public ArrayList<Friend> selectAll();

	// 이름조회
	public Friend selectOne(String name);
	
	//전화번호조회
	public Friend findTel(String tel);
}