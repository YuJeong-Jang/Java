package co.yedam.app.score;

import java.util.Scanner;

/*
 * 성적처리 프로그램
 * 국어, 영어, 수학 입력
 * 총점, 평균, 등급 계산
 */
public class ScoreApp {
int kor;
int eng;
int mat;
int sum;
float avg;
char grade;
//성적입력
void input() {
	Scanner scanner = new Scanner(System.in);
	kor = scanner.nextInt();
	eng = scanner.nextInt();
	mat = scanner.nextInt();
}
//합계계산
int getSum() {
//	sum 계산
	sum = kor + eng + mat;
	return sum;
}
float getAvg() {
	//평균계산하고 리턴
	avg = sum/3;
	return avg;	
}
char getGrade() {
switch ((int)avg/10) { //80 상 60 중 하
	case 10: grade ='상'; break;
	case 9: grade ='상'; break;
	case 8: grade ='중'; break;
	case 7: grade ='중'; break;
	case 6: grade ='중'; break;
	default: grade ='하'; break;
}
	return grade;
}
boolean isPass() {
	//평균이 60이상 true;
	//아니면 false;
	if(avg >=60) {
		return true;
	}
	else {
		return false;
	}
}}

