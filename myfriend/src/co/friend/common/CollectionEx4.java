package co.friend.common;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import co.friend.access.FriendDAO;
import co.friend.model.Friend;

public class CollectionEx4 {

	public static void main(String[] args) {
		//이름과 연락처를 입력하세요
		FriendDAO dao = new FriendDAO();
		Map<String, String> friendMap = dao.getNameTel();
		
		Set<Entry<String, String>> ent = friendMap.entrySet();
		
		Iterator<Entry<String, String>> eiter = ent.iterator();
		while(eiter.hasNext()) {
			Entry<String, String> e = eiter.next();
			System.out.println(e.getKey() + "," + e.getValue());
	}

}
}