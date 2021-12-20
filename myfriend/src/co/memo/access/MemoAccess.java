package co.memo.access;

import java.util.ArrayList;

import co.memo.model.Memo;

public interface MemoAccess {
public static final String model = "ddd";

public void insert(Memo memo);

public void update(Memo memo);

public void delete(String content);

public ArrayList<Memo> selectAll();

public Memo selectd(String date);

public Memo selectc(String content);
}
