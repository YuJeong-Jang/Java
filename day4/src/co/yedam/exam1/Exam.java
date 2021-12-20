package co.yedam.exam1;

public class Exam {
	String examNum;
	int kor;
	int his;
	int eng;
	int avg;

	public Exam(String examNum, int kor, int his, int eng) {
		super();
		this.examNum = examNum;
		this.kor = kor;
		this.his = his;
		this.eng = eng;
		this.avg = (kor + his + eng) / 3;
	}

	boolean isPass() {
		if (avg >60 && kor>40 && his>40 && eng>40) {
			return true;
			}
			else {
				return false;
			}
		}
	}
	
	
	
	
