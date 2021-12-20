package 클래스;

public class EqualTest {

	public static void main(String[] args) {
		Robot r1 = new Robot(2,4);
		Robot r2 = new Robot(2,4);
//		r1.equals(r2);
		System.out.println(r1 == r2);
		System.out.println(r1.equals(r2));
		System.out.println(r1);
		
		String a = new String("hello");		//new String을 써주거나 없이써도 인식은 됨.
		String b = new String("hello");
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
	}

}
