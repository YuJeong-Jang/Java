package co.yedam.member;
import java.util.Scanner;

public class MemberService {
	Member[] members = new Member[10];
	int cnt = 0;
	Scanner scanner = new Scanner(System.in);

	// 회원가입
	void insert(String id, String password, String name, int age) {
		members[cnt++] = new Member(id, password, name, age);
	}

	// 회원가입
	void insert() {
		String id = scanner.next();
		String password = scanner.next();
		String name = scanner.next();
		int age = scanner.nextInt();
		members[cnt++] = new Member(id, password, name, age);
	}

	// 회원리스트
	void printList() {
		for (int i = 0; i < members.length; i++) {
			System.out.printf("members[%d} %d\n", i, members[i]);
		}
	}

	void printMember(int i) {
		System.out.println(members[i].name);
		System.out.println(members[i].id);
		System.out.println(members[i].age);
	}

	// 로그인
	boolean login(String id, String pw) {
		for (int i = 0; i < cnt; i++) {
			if (id.equals(members[i].id) && pw.equals(members[i].password)) {
				System.out.println("로그인 완료");
				return true;
			}

		}
		return false;
	}

//		if (id.equals("hong") && pw.equals("12345")) {
//		System.out.println("로그인 되었습니다.");
//		return true;
//		}
//		else { 
//			System.out.println("바보야.");
//			return false;
//		}

	void logout(String id) {
		if (id.equals("hong")) {
			System.out.println("로그아웃 되었습니다.");
		}
	}
}
