package co.friend.common;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;			//map클래스 안에 있는 중첩 entry
import java.util.Set;

import co.friend.model.Friend;

public class CollectionEx3 {

	public static void main(String[] args) {
		Map<String, Friend> map = new HashMap<>();					//key값만 가져옴
		map.put("반장", new Friend("1반", "홍길동", "1111"));
		map.put("평범", new Friend("1반", "서주윤", "2222"));
		map.put("쓰앵님", new Friend("1반", "홍두깨", "3333"));
		map.put("반장", new Friend("1반", "박길동", "1212"));		//key가 중복이 되버리면 중복자료로 바뀌어버림
//		System.out.println(map.get("쓰앵님"));
		Set<String> keys = map.keySet();
		keys.iterator();	//iterator = 반복자
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			Friend val = map.get(key);
			System.out.println("key :" + key + ", val : " + val.toString());
		}
		System.out.println("=========================================");
		//Friend : key, Integer : value
		Map<Friend, Integer> scores = new HashMap<>();				//key값과 entry 둘다 가져옴
		scores.put(new Friend("1반", "홍길동", "1111"), 80);
		scores.put(new Friend("1반", "서주윤", "2222"), 90);
		scores.put(new Friend("1반", "진아름", "3333"), 89);
		scores.put(new Friend("1반", "김한솔", "4444"), 91);
		scores.put(new Friend("1반", "홍길동", "1111"), 85);
		
		Set<Entry<Friend, Integer>> ent = scores.entrySet();
		Iterator<Entry<Friend, Integer>> eiter = ent.iterator();
		while(eiter.hasNext()) {
			Entry<Friend, Integer> e = eiter.next();
			System.out.println(e.getKey() + "," + e.getValue());
		}
	}

}
