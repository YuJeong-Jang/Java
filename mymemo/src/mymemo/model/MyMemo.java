package mymemo.model;

public class MyMemo {
	protected String date;
	protected String contents;

	public void print() {
		System.out.printf("메모 : %20s %20s\n", date, contents);
	}

	public MyMemo() {
	}

	public MyMemo(String date, String contents) {
		this.date = date;
		this.contents = contents;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContents() {
		return contents;
	}

public void setContents(String Contents) {
	this.contents = contents;
}

	@Override
	public String toString() {
		return "MyMemo [date=" + date + ", contents=" + contents + "]";
	}

}
