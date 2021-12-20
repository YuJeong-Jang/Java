package co.Memo;

public class Memo {
protected int no;
protected String date;
protected String title;
protected String content;



public Memo() {
	super();
}
public Memo(int no, String date, String title, String content) {
	super();
	this.no = no;
	this.date = date;
	this.title = title;
	this.content = content;
}
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
@Override
public String toString() {
	return date + "\t" + title + "\t" + content;
}


}
