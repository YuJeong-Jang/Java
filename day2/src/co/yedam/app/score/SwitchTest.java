package co.yedam.app.score;

public class SwitchTest {
	public static void main(String[] args) {
		
	float avg = 85.5f;
	char grade;
	
		switch ((int)avg/10) { //80 상 60 중 하
		case 10: grade ='상'; break;
		case 9: grade ='상'; break;
		case 8: grade ='중'; break;
		case 7: grade ='중'; break;
		case 6: grade ='중'; break;
		default: grade ='하'; break;
		}
		System.out.println(grade);
}
}