package pkg.other;

import java.util.Date;

import pkg.friend.util.DateUtil;

public class DateTest {

	public static void main(String[] args) {
		System.out.println(DateUtil.dateToStr(new Date()));
		System.out.println(DateUtil.dateToStr(new Date(), "yyyy"));
		System.out.println(DateUtil.durationDay(new Date(2021,5,20), new Date()));	//num1
		System.out.println(DateUtil.durationDay("2021-05-23", "2021-05-30"));		//num2
		System.out.println(DateUtil.lastDay(2021,6));
	}

}
