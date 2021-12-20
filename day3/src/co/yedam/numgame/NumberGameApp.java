package co.yedam.numgame;
/*
 * 숫자 맞추기 게임
 * 작성자 : 장유정
 */
public class NumberGameApp {
	int com; // 컴퓨터가 만든 수(1~10)
	int user; // 사용자가 입력한 값

	void init() {
		// 1~10 사이의 난수 생성
	}

	// 사용자 수 입력
	void input() {
		// scanner를 이요해서 정수값 입력
	}

	// 높거나 낮으면 false, 정답이면 true
	boolean confirm() {
		if(com == user) {
			return true;
		} else {
			return false;
		}
		// com과 user를 비교해서 같으면 true 리턴
		// 다르면 높다/낮다 출력하고 false 리턴
	}

	void start() {
		init();
		while (true) {
			input();
			if (confirm()) {
				break;
			}
		}
	}
}
