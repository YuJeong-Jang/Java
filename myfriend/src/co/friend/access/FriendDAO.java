package co.friend.access;
//FriendAccess.java, FriendList.java

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import co.friend.model.Friend;
import co.friend.util.DAO;

public class FriendDAO extends DAO implements FriendAccess {

	PreparedStatement psmt;
	ResultSet rs;
	String sql;
	
	//name, tel 값을 담아주는 컬렉션
	public Map<String, String> getNameTel() {
		Map<String, String> friendMap = new HashMap<>();
		sql = "select name, tel from friend";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				friendMap.put(rs.getString("name"), rs.getString("tel"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		
		return friendMap;
	}

	@Override
	public void insert(Friend friend) {
		try {
			psmt = conn.prepareStatement("insert into friend values(?,?,?)");
			psmt.setString(1, friend.getGubun());
			psmt.setString(2, friend.getName());
			psmt.setString(3, friend.getTel());
			int r = psmt.executeUpdate(); // insert, update, delete 할 때 사용.
			System.out.println(r + "건 입력.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(Friend friend) {
		try {
			psmt = conn.prepareStatement("update friend set tel=? where name=?");
			psmt.setString(2, friend.getName());
			psmt.setString(1, friend.getTel());
			int r = psmt.executeUpdate();
			System.out.println(r + " 건 변경되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(String name) {
		try {
			psmt = conn.prepareStatement("delete from friend where name = ?");
			psmt.setString(1, name);
			int s = psmt.executeUpdate();
			System.out.println(s + "삭제완료.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Friend> selectAll() {
		ArrayList<Friend> fList = new ArrayList<>();
		try {
			psmt = conn.prepareStatement("select * from friend");
			rs = psmt.executeQuery();
			while (rs.next()) {
				Friend friend = new Friend();
				friend.setGubun(rs.getString("gubun"));
				friend.setName(rs.getString("name"));
				friend.setTel(rs.getString("tel"));
				fList.add(friend); // 데이터건수만큼 ArrayList담아서 반환.
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return fList;
	}

	@Override
	public Friend selectOne(String name) {
		ArrayList<Friend> friendList = new ArrayList<>();
		Friend f = null;
		try {
			psmt = conn.prepareStatement("Select * from friend where name = ?"); 						
			psmt.setString(1, name);
			rs = psmt.executeQuery();								 
			while(rs.next()) {
				f = new Friend();
				f.setGubun(rs.getString("gubun"));
				f.setName(rs.getString("name"));
				f.setTel(rs.getString("tel"));
				friendList.add(f);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return f;
	}

	@Override
	public Friend findTel(String tel) {
		ArrayList<Friend> friendList = new ArrayList<>();
		Friend f = null;
		try {
			psmt = conn.prepareStatement("Select * from friend where tel = ?"); 						
			psmt.setString(1, tel);
			rs = psmt.executeQuery();								 
			while(rs.next()) {
				f = new Friend();
				f.setGubun(rs.getString("gubun"));
				f.setName(rs.getString("name"));
				f.setTel(rs.getString("tel"));
				friendList.add(f);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return f;
	}

}
