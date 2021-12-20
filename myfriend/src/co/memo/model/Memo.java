package co.memo.model;

public class Memo {
	protected String date;
	protected String content;

	public void print() {
		System.out.printf("날짜 : %20s %20s\n", date, content);
	}

	public Memo() {
	}

	public Memo(String date, String content) {
		this.date = date;
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Memo [date=" + date + ", content=" + content + "]";
	}

}
