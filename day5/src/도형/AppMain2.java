package 도형;

public class AppMain2 {
public static void main(String[] args) {
	Shape s = new Rect(4,5);
	execute(s);
	
	s = new Circle(4);
	execute(s);
}
public static void execute(Shape s) {
	if(s instanceof Drawble)
		((Drawble)s).draw();
	if(s instanceof Moveble)
		((Moveble)s).move();
	s.area();
}
}
