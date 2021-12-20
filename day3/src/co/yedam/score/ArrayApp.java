package co.yedam.score;

public class ArrayApp {
	int[] arr = new int[10]; //0~9
	//초기값 지정
	void init() {
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;	
		}
	}
	//배열 출력
	void print() {
		for(int j=0; j<arr.length; j++) {
			System.out.println("arr[" + j + "] =" + arr[j]);
		}
	}
	//합계
	void result() {
		int result = 0; 
		for(int s=0; s<arr.length; s++) {
			result += arr[s];
		}
		System.out.println("합계:" + result);
	}
	//최대값
	void max() {
		int max = 0;
		for(int z=0; z<arr.length; z++) {
			max = arr[z];
		}
		System.out.println("최대값:" + max);
						}

		public static void main(String[] args) {
			
			ArrayApp app = new ArrayApp();
			//배열에 초기값 지정
			app.init();
			//배열 출력
			app.print();
			//합계
			app.result();
			//최대값
			app.max();}}
