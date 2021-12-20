package co.friend.common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class collectionEx {

	public static void main(String[] args) {
		List<String> list = null;
		list = new ArrayList<String>();
		list.add("Hong");
		list.add("Hong");
		list.add("Park");
		list.add("Choi");
		
		list.remove(0);			//인덱스 0번째를 지웠으므로, Hong은 프린트 되지 않음.
		System.out.println("<list>");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		Set<String> set = new HashSet<>();
		set.add("Hong");
		set.add("Hong");
		set.add("park");
		set.add("Choi");
		
		System.out.println("<set>");	//중복된 값을 허용하지 않는다.
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String value = iter.next();
			System.out.println(value);
		}
	}

}
