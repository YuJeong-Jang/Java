package co.yedam.member;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		
		System.out.println(memberService.login("hong","12345"));
		System.out.println(memberService.login("jang","12345"));
		memberService.logout("hong");
		memberService.insert("hong","12345", "홍길동", 0);
		memberService.insert("kim","6789", "김효진", 0);
		memberService.insert("jang","2468", "장유정", 0);
		memberService.insert("jin","13579", "진아름", 0);
		memberService.printList();
		memberService.printMember(1);
		System.out.println(memberService.login("jang", "2468"));
		System.out.println(memberService.login("jang", "13579"));
	
	
	}
	
}

