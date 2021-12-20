package co.board.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.board.access.BoardAccess;
import co.board.access.BoardDAO;
import co.board.model.Board;
import co.board.util.ScannerUtil;

public class BoardApp {
	BoardAccess boardList = new BoardDAO();

	public void start() {
		int menunum;
		do {
			menuTitle(); // 메뉴출력
			menunum = ScannerUtil.readInt(); // 메뉴선택
			switch (menunum) { // 실행
			case 1:
				selectAll();
				break;
			case 2:
				insert();
				break;
			case 3:
				update();
				break;
			case 4:
				delete();
				break;
			case 5:
				selectOne();
				break;
			case 6:
				insertP();
				break;
			case 7:
				selectUid();
				break;
			}
		} while (menunum != 0);
	}

//전체조회
	private void selectAll() {
		List<Board> list = boardList.selectAll();
		for (Board board : list) {
			System.out.println(board);
		}
	}

//등록
	private void insert() {
		Board board = ScannerUtil.readBoard();
		boardList.insert(board);
	}

//id로 검색해서 내용 수정
	private void update() {
		Board board = new Board();
		board.setId(ScannerUtil.readInt("아이디입력"));
		board.setContent(ScannerUtil.readStr("내용입력"));
		boardList.update(board);
	}

//id로 검색해서 삭제
	private void delete() {
		int id = ScannerUtil.readInt("아이디입력");
		boardList.delete(id);
	}

//id검색
	private void selectOne() {
		int id = ScannerUtil.readInt("아이디입력");
		Board board = boardList.selectOne(id);

		if (board == null) {
			System.out.println("존재하지 않는 제목입니다.");
		} else {
			System.out.println(board);
		}
	}

	// 댓글
	private void insertP() {
		int parentid = ScannerUtil.readInt("조회할 글의 번호를 입력하세요.");
		String content = ScannerUtil.readStr("내용을 입력하세요.");
		Board commentB = new Board();
		commentB.setContent(content);
		commentB.setParentid(parentid);
		boardList.insertX(commentB);
	}

	private void selectUid() {
		String uid = ScannerUtil.readStr("아이디입력");
		String pass = ScannerUtil.readStr("비밀번호입력");
		Board board = boardList.selectUid(uid, pass);
	}
	
	


//메뉴출력
	public void menuTitle() {
		System.out.println("==== 작성글 관리====");
		System.out.println("==1. 전체 조회==");
		System.out.println("==2. 글 추가==");
		System.out.println("==3. 글 수정==");
		System.out.println("==4. 글 삭제==");
		System.out.println("==5. 제목으로 조회==");
		System.out.println("==6. 댓글작성==");
		System.out.println("==7. 로그인 조회==");
		System.out.println("====0. 종료====");
	}
}
