package co.Memo;

import java.util.ArrayList;
import java.util.List;

public class MemoData extends MemoAccess{

	public ArrayList<Memo> memos = new ArrayList<Memo>();

	
	
	@Override
	public void insert(Memo memo) {
		memos.add(memo);
	}

	@Override
	public List<Memo> findDate(String Memo) {
		List<Memo> list = new ArrayList<Memo>();
		for(Memo m : memos) {
			if(m.getDate().contains(Memo)) {
				list.add(m);
			}
		}
		return list;
	}
	
	
}
