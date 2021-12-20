package 연산자;
/*
 * ^ : xor - 서로 다르면 1(암호화)
 * & : and - 마스크
 * | : or
 */
public class 비트연산 {

	public static void main(String[] args) {
		//암호화/복호화
		int a = 04474;
		int key = 01111;
		System.out.println("원문 : " + a);
		
		int b = a ^ key;
		System.out.println("암호화 : " + b);
		
		int c = b ^ key;
		System.out.println("복호화 : " + c);

		int d = 0b10101111;
		int e = 0b00000001;
		System.out.println(Integer.toBinaryString(d & e));
		
		//쉬프트연산
		int f = 8;
		System.out.println(f >> 1); 	//1000(8) >> 100(4)  -> /2와 같은 역할. 속도는 더 빠름
		System.out.println(f << 1);		//1000(8) << 10000(16)  -> *2와 같은 역할. 속도는 더 빠름
		System.out.println(f >> 2); 	//곱하기 2를 두번 한다는 뜻
	}

}
