package co.yedam.test;

public class CarExample {

	public static void main(String[] args) {
	//2. 객체생성(인스턴스)
//		Car myCar = new Car(); //생성자를 가저 오는 것이 new 키워드
//		myCar.company="삼성자동차";
//		myCar.maxSpeed=400;
//		myCar.color="레드";
//		System.out.println("제작회사 : " + myCar.company);
//		System.out.println("최대속도 : " + myCar.speed);
//		System.out.println("색상  : " + myCar.color);
//		System.out.println("모델 : " + myCar.model);
//		myCar.speed = 100;
//		System.out.println("스피드 : " + myCar.speed);
//		
		Car yourCar = new Car("르노","SM6","블루");
		System.out.println(yourCar);

		//"코나, 100"
		Car miniCar = new Car("코나",100);
		System.out.println(miniCar);

	}}

