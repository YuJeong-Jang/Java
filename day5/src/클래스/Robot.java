package 클래스;
//1.클래스 선언
public class Robot {
	
	//필드
	//private(클래스 내부에서만 접근 가능) : 접근제어자
	private int arm;
	private int leg;
	private String name;
	
	//setter : 필드값을 변경
	public void setArm(int arm) {
		this.arm = arm;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	
	//getter : 필드값을 조회
	public int getArm() {
		return this.arm;
	}

	public int getLeg() {
		return this.leg;
	}
	//일반메서드
	public void print() {
		System.out.printf("arm : %d leg : %d", arm, leg);
	}
	//생성자 오버로딩
	Robot() {
	}
	Robot(int arm, int leg, String name) {
		this.arm = arm;
		this.leg = leg;
		this.name = name;
	}
	
	public int getArm(int arm) {
		return this.arm;
	}
	public void getLeg(int leg) {
		this.leg = leg;
	}
	
	//기본생성자
//	public Robot() {} 		//컴파일러가 만들어주는 기본 생성자
	public Robot(int arm, int leg) {
		this.arm = arm;		//this는 자기자신 객체를 참조하는 참조변수
		this.leg = leg;
		
	}
	@Override
	public boolean equals(Object obj) {
		Robot r2 = ((Robot)obj);
		return ((Robot)obj).arm == this.arm && r2.leg == this.leg;
	}
	@Override
	public String toString() {
		return "arm:" + arm + "leg:" + leg;
	}
	
	
}
