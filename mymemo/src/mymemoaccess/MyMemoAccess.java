package mymemoaccess;

import java.util.ArrayList;

import mymemo.model.MyMemo;

public interface MyMemoAccess {
	//등록
	public void insert(MyMemo memo);
	//수정
	public void update(MyMemo memo);
	//삭제
	public void delete(MyMemo memo);
	//전체조회
	public ArrayList<MyMemo> selectAll();
	//날짜조회
	public MyMemo selectOne(String date);
	//내용조회
	public MyMemo selectcon(String contents);

}
