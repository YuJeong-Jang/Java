package co.yedam.score;
 // 1. 클래스 설계도(UML)
public class ScoreArrApp {
	int[] arr = {90,90,50};
	void print() {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
void printH() {
	System.out.printf("%s\n국어:%2$d\t영어:%3$d\t수학:%4$d\n","홍길동성적",arr[0],arr[1],arr[2]);
	}

int total() {
	int result = 0;
	for(int i=0; i<arr.length; i++) {
		result += arr[i]; 
}
	return result;

}
double avg() {
	double result = 0;
	result = total() / (float)arr.length;
	return result;
}
 



}
