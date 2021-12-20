package day01;

public class Exam151 {

	public static void main(String[] args) {
		Peacock b = new Peacock();
		Bird p = (Bird)b;
		p.fly();
		((Peacock) p).dance();

	}

}
