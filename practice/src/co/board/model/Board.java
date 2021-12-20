package co.board.model;

public class Board {
	private int id;
	private String title;
	private String content;
	private String writer;
	private int parentid;
	private String uid;
	private String pass;
	
	public Board() {
		super();
	}

	public Board(String uid, String pass) {
		super();
		this.uid = uid;
		this.pass = pass;
	}

	public Board(int id, String title, String content, String writer, int parentid) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.parentid = parentid;
	}

	public Board(String title, String content, String writer) {
		super();
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public Board(int id, String title, String content, String writer) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getParentid() {
		return parentid;
	}

	public void setParentid(int parentid) {
		this.parentid = parentid;
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

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Board [title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
}
