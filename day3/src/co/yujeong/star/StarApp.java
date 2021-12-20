package co.yujeong.star;

public class StarApp {
	// 삼각형 출력
	void draw(int cnt) {
		for (int i = 1; i < cnt; i++) {
//			for(int j=1; j<i; j++) {
//				System.out.print("*");
			System.out.println(pad('*', i));
		}
//			System.out.println();
	}

	// "*"*3
//(*,10) --> "*******"
	String pad(char s, int cnt) {
		String result = "";
		for (int i = 0; i < cnt; i++) {
			result += s;

		}
		return result;
	}

//역삼각형
	void drawInvert(int cnt) {
		for (int i = cnt; i > 0; i--) {
			System.out.println(pad('*', i));
		}
	}

//이등변삼각형	
	void drawEq(int cnt) {
		for (int i = 1; i <= cnt; i++) {
			pad(' ', cnt - i);
			pad('*', cnt + i);
			{
				System.out.print(pad(' ', cnt)); // 공백
				System.out.println(pad('*', cnt * i - 1));

			}
		}
	}

	// 이등변 역삼각형
	void drawEqInvert(int cnt) {
		for (int i = 1; i <= cnt; i++) {
		}
	}
}