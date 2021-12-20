package pkg.friend;

import java.util.List;

public class FriendManager implements FriendAccess {
	Friend[] friends = new Friend[10];

	public FriendManager() {
		friends[0] = new CompanyFriend("예담회사", "순이", "01033334444");
		friends[1] = new SchoolFriend("경덕여고", "돌쇠", "01011112222");
		friends[2] = new SchoolFriend("경덕여고", "마님", "01055556666");
		friends[3] = new SchoolFriend("경덕여고", "갑돌이", "01077778888");
		friends[4] = new CompanyFriend("예담회사", "갑순이", "01099991010");
	}

	@Override
	public void insert(Friend friend) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Friend friend) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public List selectAll() {
		System.out.println("FriendManager");
		return null;
	}

	@Override
	public Friend selectOne(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
