package co.board.access;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import co.board.model.Board;
import co.board.util.DAO;

public class BoardDAO extends DAO implements BoardAccess {
	static PreparedStatement psmt;
	static ResultSet rs;
	static Connection conn;
	// 1.조회, 2.입력, 3.수정, 4.삭제, 5.전체리스트(각각 기능을 분리) => 메소드로 기능분리.

	// 전체리스트
	public ArrayList<Board> getBoardList() {
		ArrayList<Board> BoardList = new ArrayList<>();

		String sql = "Select * from board";
		connect(); // Connection객체 연결.
		try {
			psmt = conn.prepareStatement(sql); // PreparedStatement 쿼리를 실행. 결과받아.
			rs = psmt.executeQuery(); // 쿼리실행결과를 가져오는 부분.
			while (rs.next()) {

				Board board = new Board();
				board.setTitle(rs.getString("b_title"));
				board.setContent(rs.getString("b_content"));
				board.setWriter(rs.getString("b_writer"));
				BoardList.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return BoardList;
	}

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
	public ArrayList<Board> selectAll() {
		ArrayList<Board> bList = new ArrayList<>();
		connect();
		try {
			psmt = conn.prepareStatement("select * from board");
			rs = psmt.executeQuery();
			while (rs.next()) {
				Board board = new Board();
				board.setTitle(rs.getString("b_id"));
				board.setTitle(rs.getString("b_title"));
				board.setContent(rs.getString("b_content"));
				board.setWriter(rs.getString("b_writer"));
				bList.add(board); // 데이터건수만큼 ArrayList담아서 반환.
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bList;
	}

	@Override
	public void insert(Board board) {
		connect();
		try {
			psmt = conn.prepareStatement("insert into board(b_title, b_content, b_writer) values(?,?,?)");
			psmt.setString(1, board.getTitle());
			psmt.setString(2, board.getContent());
			psmt.setString(3, board.getWriter());
			int r = psmt.executeUpdate(); // insert, update, delete 할 때 사용.
			System.out.println(r + "건 입력.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(Board board) {
		connect();
		try {
			psmt = conn.prepareStatement("update board set b_content=? where b_id=?");
			psmt.setString(1, board.getContent());
			psmt.setInt(2, board.getId());
			int r = psmt.executeUpdate();
			System.out.println(r + " 건 변경되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		connect();
		try {
			psmt = conn.prepareStatement("delete from board where b_id = ?");
			psmt.setInt(1, id);
			int s = psmt.executeUpdate();
			System.out.println(s + "삭제완료.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Board selectOne(int id) {
		ArrayList<Board> boardList = new ArrayList<>();
		Board b = null;
		connect();
		try {
			psmt = conn.prepareStatement("Select * from board where b_id = ?");
			psmt.setInt(1, id);
			rs = psmt.executeQuery();
			while (rs.next()) {
				b = new Board();
				b.setTitle(rs.getString("b_title"));
				b.setContent(rs.getString("b_content"));
				b.setWriter(rs.getString("b_writer"));
				boardList.add(b);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}
	// 댓글등록

	// insert into board(b_title, b_content, b_writer, b_parent_id) values('제목',
	// '댓글을달아보자', '작성자', (select b_id from board where b_id=?));
	ArrayList<Board> board1 = new ArrayList<Board>();

	public void insertX(Board board) {
		connect();
		// 불러온 글에 댓글 작성
		try {
			psmt = conn.prepareStatement(
					"insert into board(b_title, b_content, b_writer, b_parent_id) values('댓글', ?, '작성자', ?)");
			psmt.setString(1, board.getContent());
			psmt.setInt(2, board.getParentid());
			int r = psmt.executeUpdate();
			System.out.println("업데이트 되었습니다." + r + "건 완료.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 로그인(아이디, 비밀번호 조회)
	ArrayList<Board> boardList = new ArrayList<>();

	public Board selectUid(String uid, String pass) {
		Board b = null;
		connect();
		try {
			psmt = conn.prepareStatement("Select * from member where u_id = ? and u_pass = ?");
			psmt.setString(1, uid);
			psmt.setString(2, pass);
			rs = psmt.executeQuery();
			if(rs.next()) {
				System.out.println("로그인성공!");
			} else {
				System.out.println("로그인실패...");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}
}
