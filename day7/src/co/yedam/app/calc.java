package co.yedam.app;

public class calc {
	int a;
	int b;

	public static int add(int a, int b) {
		return a + b;
	}

	public static int div(int a, int b) throws Exception {
		int c = 0;
//		try { c = a / b;
//	} catch(Exception e) {
//		System.out.println(e.getMessage());
//	}
		c = a / b;
		return c;

	}
}