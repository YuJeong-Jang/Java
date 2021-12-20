package co.memo.access;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import co.memo.model.Memo;

// MemoAccess를 구현하는 클래스입니다.
// 기능을 작성하세요.
public class MemoDAO extends DAO implements MemoAccess {
	static PreparedStatement psmt;
	static ResultSet rs;
	static Connection conn;

	// 연결(객체 얻어오는 부분)
	public static void connect() {
		String url = "jdbc:sqlite:C:/sqlite/db/sample.db";
		try {
			conn = DriverManager.getConnection(url);
			System.out.println("연결성공!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close() {
		if (rs != null) {
			try {
				psmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (psmt != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (conn != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void write(Memo memo) {
		connect();
		try {
			psmt = conn.prepareStatement("insert into memo values(?,?,?)");
			psmt.setString(1, memo.getDate());
			psmt.setString(2, memo.getTitle());
			psmt.setString(3, memo.getContent());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력완료.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void update(Memo memo) {
		connect();
		try {
			psmt = conn.prepareStatement("update memo set content=? where date=?");
			psmt.setString(1, memo.getContent());
			psmt.setString(2, memo.getDate());
			int r = psmt.executeUpdate();
			System.out.println(r + " 건 변경되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(String date) {
		connect();
		try {
			psmt = conn.prepareStatement("delete from memo where date = ?");
			psmt.setString(1, date);
			int s = psmt.executeUpdate();
			System.out.println(s + "삭제완료.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Memo> FindAll() {
		ArrayList<Memo> mList = new ArrayList<>();
		connect();
		try {
			psmt = conn.prepareStatement("select * from memo");
			rs = psmt.executeQuery();
			while (rs.next()) {
				Memo memo = new Memo();
				memo.setDate(rs.getString("date"));
				memo.setTitle(rs.getString("title"));
				memo.setContent(rs.getString("content"));
				mList.add(memo); // 데이터건수만큼 ArrayList담아서 반환.
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mList;

	}

	@Override
	public Memo FindByDate(String date) {
		ArrayList<Memo> memoList = new ArrayList<>();
		Memo m = null;
		connect();
		try {
			psmt = conn.prepareStatement("Select * from memo where date = ?");
			psmt.setString(1, date);
			rs = psmt.executeQuery();
			while (rs.next()) {
				m = new Memo();
				m.setDate(rs.getString("date"));
				m.setTitle(rs.getString("title"));
				m.setContent(rs.getString("content"));
				memoList.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return m;
	}

	@Override
	public Memo FindByContent(String content) {
		ArrayList<Memo> memoList = new ArrayList<>();
		Memo m = null;
		connect();
		try {
			psmt = conn.prepareStatement("Select * from memo where content = ?");
			psmt.setString(1, content);
			rs = psmt.executeQuery();
			while (rs.next()) {
				m = new Memo();
				m.setDate(rs.getString("date"));
				m.setTitle(rs.getString("title"));
				m.setContent(rs.getString("content"));
				memoList.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return m;
	}

}
