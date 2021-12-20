package mymemoaccess;

import java.util.ArrayList;

import mymemo.model.MyMemo;

public class MyMemoList implements MyMemoAccess {
	ArrayList<MyMemo> memos;

	@Override
	public void insert(MyMemo memo) {
		memos.add(memo);
	}

	@Override
	public void update(MyMemo memo) {
		for(MyMemo m : memos) {
			if(m.getDate().equals("date")) {
				memos.remove(m);
				break;
			}
		}
		
	}

	@Override
	public void delete(MyMemo memo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<MyMemo> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MyMemo selectOne(String date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MyMemo selectcon(String contents) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
