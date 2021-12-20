package 도형;

public abstract class Shape {
int w;
double result;
	
	public Shape() {}
	public Shape(int a) {
		this.w=a;
	}
public void print() {
}
public abstract void area();
}
