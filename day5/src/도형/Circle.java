package 도형;

public class Circle extends Shape{
	
	public Circle(int a) {
//		this.w=a;
		super(a);
	}

	@Override
	public void area() {
		result = w * w * 3.14;
		System.out.println("원 면적 : "+ result );
		
	}

}
