package pkg.collect;

import java.util.ArrayList;
import java.util.LinkedList;

import pkg.friend.*;

public class ListTest {

	public static void main(String[] args) {
		LinkedList<Friend> list = new LinkedList<Friend>();
		list.add(new Friend("현대", "홍", "1111"));
		list.add(0, new CompanyFriend("삼성", "김", "222")); // 0이 인덱스 위치를 지정해주는 것임. 그래서 수박이 먼저 출력.
		list.add(new SchoolFriend("초등", "박", "333"));
//	System.out.println(list);
		for (Friend f : list) {
			System.out.println(f.getName());
		}
		System.out.println("=====");
		// 삭제
		list.remove(0);
		for (Friend f : list) {
			System.out.println(f.getName());
		}
		Friend fr = list.get(0);
		System.out.println("첫번째 이름 : " + fr.getName());
//마지막 이름 : size()
		System.out.println("마지막 이름 : " + list.get(list.size()-1).getName());
		
		list.set(1, new Friend("중학교", "최", "5555"));
		for(Friend f : list) {
			System.out.println(f.getName());
		}
		}



}
