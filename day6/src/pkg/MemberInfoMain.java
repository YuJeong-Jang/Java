package pkg;

public class MemberInfoMain {

	public static void main(String[] args) {
	MemberInfo member1 = MemberInfo.getInstance(); //new MemberInfo();
	member1.names[0] = "홍길동";
	
	MemberInfo member2 = MemberInfo.getInstance(); //new MemberInfo();
	member2.names[1] = "장유정";
	
	MemberInfo member3 = MemberInfo.getInstance(); //new MemberInfo();
	member3.names[2] = "김효진";
	
	MemberInfo member4 = MemberInfo.getInstance(); //new MemberInfo();
	member4.names[3] = "진아름";
	
	MemberInfo member5 = MemberInfo.getInstance(); //new MemberInfo();
	member5.names[4] = "서주윤";
	
	MemberInfo member6 = MemberInfo.getInstance(); //new MemberInfo();
	member6.names[5] = "정인영";
	
	MemberInfo member7 =MemberInfo.getInstance(); // new MemberInfo();
	member7.names[6] = "백명진";
	
	MemberInfo member8 = MemberInfo.getInstance(); //new MemberInfo();
	member8.names[7] = "김영서";
	
	MemberInfo member9 = MemberInfo.getInstance(); //new MemberInfo();
	member9.names[8] = "조제은";
	
	MemberInfo member10 = MemberInfo.getInstance(); //new MemberInfo();
	member10.names[9] = "이한솔";

	member1.print();
//	member2.print();
//	member3.print();
//	member4.print();
//	member5.print();
//	member6.print();
//	member7.print();
//	member8.print();
//	member9.print();
//	member10.print();
	}

}
