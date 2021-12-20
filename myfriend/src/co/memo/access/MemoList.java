package co.memo.access;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import co.memo.model.Memo;

public class MemoList implements MemoAccess {
	ArrayList<Memo> memoes;
	String path = "d:/temp/memo.txt";

	public void open() {
		try {
			Scanner scanner = new Scanner(new File(path));
			while (true) {
				if (!scanner.hasNext())
					break;
				String str = scanner.next();
				String[] arr = str.split(",");
				memoes.add(new Memo(arr[0], arr[1]));
			}
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void save() {
		try {
			BufferedWriter fw = new BufferedWriter(new FileWriter(path));
			for (Memo m : memoes) {
				fw.write(String.format("%s,%s\n", m.getDate(), m.getContent()));
			}
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public MemoList() {
		memoes = new ArrayList<Memo>();
		open();
	}

	@Override
	public void insert(Memo memo) {
		memoes.add(memo);
		save();
	}

	@Override
	public void update(Memo memo) {
		for (Memo m : memoes) {
			if (m.getDate().equals(memo.getDate())) {
				m.setDate(memo.getDate());
				save();
			}
		}

	}

	@Override
	public void delete(String date) {
		for (Memo m : memoes) {
			if (m.getDate().equals(date)) {
				memoes.remove(m);
				save();
				break;
			}
		}

	}

	@Override
	public ArrayList<Memo> selectAll() {
		
		return memoes;
	}

	@Override
	public Memo selectd(String date) {
		for (Memo m : memoes) {
			if (m.getDate().equals(date)) {
				return m;
			}
		}
		return null;
	}

	@Override
	public Memo selectc(String content) {
		for (Memo m : memoes) {
			if (m.getContent().contains(content)) {
				return m;
			}
		}
		return null;
	}
}
