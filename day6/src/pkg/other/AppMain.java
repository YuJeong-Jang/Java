package pkg.other;

import pkg.DateUtil; //pkg하위를 모두 쓰려면 pkg.*로 전부 불러올수 있지만 권장하지않음.
import pkg.Car;
import pkg.Count;

public class AppMain {

	public static void main(String[] args) {
		Car car = new Car();
		car.setModel("현대");
		car.setSpeed(100);

		Car car2 = new Car("삼성", 50);
		Car car3 = new Car("기아");

		System.out.println(DateUtil.curDate());
		System.out.println(Count.cnt1);

		Count count1 = new Count();
		count1.setCnt2(count1.getCnt2() + 1);

	}

}
