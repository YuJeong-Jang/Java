package 클래스;

public class CalcStaticTest {

	public static void main(String[] args) {
		//정적멤버는 객체생성 하지 않고도 클래스 이름으로 접근
//		CalcStatic.PI = 3.141592;
		System.out.println(CalcStatic.PI);
		System.out.println(CalcStatic.add(10,20));
//		Integer.MAX_VALUE = 100; //조회만 가능하고 변경은 안됨.
//		CalcStatic c1 = new CalcStatic();
//		CalcStatic c2 = new CalcStatic();
//		
//		System.out.println(c1);
//		System.out.println(c2);

	}

}
