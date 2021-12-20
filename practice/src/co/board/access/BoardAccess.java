package co.board.access;

import java.util.ArrayList;

import co.board.model.Board;

public interface BoardAccess {

	// 전체조회
	public ArrayList<Board> selectAll();
	// 글등록
		public void insert(Board board);

		// 글수정
		public void update(Board board);

		// 글삭제
		public void delete(int id);
		
		// 이름조회
		public Board selectOne(int id);
		
		//댓글 입력
		public void insertX(Board board);

		//로그인(동일한 값이 있는가)
		public Board selectUid(String uid, String pass);
		
}
