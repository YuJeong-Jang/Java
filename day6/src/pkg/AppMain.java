package pkg;

public class AppMain {

	public static void main(String[] args) {
		ProjectInfo.uploadpath = "/upload";
		System.out.println(ProjectInfo.name);

		ProjectInfo info = new ProjectInfo();
		info.uploadpath = "예성";
		System.out.println(info.uploadpath);
		System.out.println(info.version);

//		DateUtil dateUtil = new DateUtil();
		System.out.println(DateUtil.curDate());

//	static void print() {
//		System.out.println("=====");

		Count count1 = new Count();
		count1.cnt1++;
		count1.cnt2++;
		
		Count count2 = new Count();
		count2.cnt1++;
		count2.cnt2++;
		
		Count count3 = new Count();
		count3.cnt1++;
		count3.cnt2++;
		
		System.out.println(count1.cnt1 + " : " + count1.cnt2);
		System.out.println(count2.cnt1 + " : " + count2.cnt2);
		System.out.println(count3.cnt1 + " : " + count3.cnt2);
		
	}
}
