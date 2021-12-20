package 도형;

public class Rect extends Shape implements Drawble, Moveble{
private int h;
public Rect(int w, int h) {
	super(w);
	this.h = h;
}

@Override
public void area() {
	result = w * h;
	System.out.println("사각형 면적 : "+ result );
}

@Override
public void move() {
	System.out.println("moving");
	
}

@Override
public void draw() {
	System.out.println("drawing");
	
}
}
