package pkg.inheritence;

public class MainApp {
public static void main(String[] args) {
	A a = new D();			//자동형변환
	int temp = ((D)a).sd;	//강제형변환
	
	A o = new A();
	temp = ((D)o).sd;		//런타임 오류
	
	
	
//	A a = new A();
//	a = new B();
//	a = new D();
//	
//	B b = new D();
//	Y x = new D();
	
	System.out.println(a instanceof A);
	System.out.println(a instanceof B);
	System.out.println(a instanceof D);
	System.out.println(a instanceof X);
	
	B b = new B();
	b = new D();
//	b = new C(); 		//b와 c는 형제관계라서 설정안됨.
}
}