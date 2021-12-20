package 도형;

public class AppMain {

	public static void main(String[] args) {
//	Shape s = new Rect(4,5);
//	s.area();
//	s.print();
//	
//	s = new Tri(4,5);
//	s.area();
//	s.print()
		Drawble[] s = new Drawble[3];
		s[0] = new Rect(4, 5); // 자식타입 부모타입으로 자동 형변환
		s[1] = (Drawble) new Circle(5);
		s[2] = (Drawble) new Tri(4, 5);

		for (Drawble temp : s) {
			temp.draw();
//			if (temp instanceof Rect) {
//				((Rect) temp).area(); // 부모타입을 자식타입으로는 강제형변환
//			} else if (temp instanceof Circle) {
//				((Circle) temp).area();
//			} else if (temp instanceof Tri) {
//				((Tri) temp).area();
//			}
			if (temp instanceof Shape) {
				((Shape)temp).area();
				((Shape)temp).print();
			}
			if (temp instanceof Moveble) {
				((Moveble) temp).move();
			}
//		for(Shape temp : s) {
//			temp.area();
//			temp.print();
		}
	}

}
