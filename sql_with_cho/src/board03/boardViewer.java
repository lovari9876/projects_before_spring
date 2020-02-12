package board03;

//데이터베이스 통신을 이용한 게시판 예제 03
//메인메소드와 화면에 나타나는 메소드들 있는 view 클래스
//스캐너 사용하여 입력받고, 프린트하여 화면으로 보여준다.

import java.util.*;
import java.util.Scanner;

public class boardViewer {
	public static void main(String[] args) throws Exception {
		// try-catch문 안쓰고 뭉뚱그려서 예외 던져주기!
		ConnectionMaker m = new MySqlConnectionMaker();
		// mysql과 자바를 연결하도록 객체를 m으로 초기화, 메소드 실행
		BoardController c = new BoardController(m);
		// 쿼리문들이 있는 BoardController 객체 c를 생성자 파라미터로 m을 받아 만든다.
		Scanner scan = new Scanner(System.in);
		showMenu(c, scan);
		//무한루프기 때문에 이것만 실행시켜도 다 돌아간다.
		scan.close();
	}

	//스캔받는거니까 비밀~~
	private static void showMenu(BoardController boardController, Scanner scan) {
		//파라미터의 의미: 이 메소드를 실행하면서 통신도 해주고 스캐너도 써줘야 하므로!!
		while (true) {
			System.out.println("===============================");
			System.out.println("\t게시판\t");
			System.out.println("===============================");
			System.out.println("1. 목록 보기  2. 입력하기  3. 종료하기");
			System.out.println("> ");
			int choice = scan.nextInt();
			if (choice == 3) {
				System.out.println("사용해 주셔서 감사합니다.");
				break;
			} else if (choice == 1) {
				showList(boardController, scan);
			} else if (choice == 2) {
				insert(boardController, scan);
			}
		}
	}

	private static void showList(BoardController boardController, Scanner scan) {
		ArrayList<BoardVO> list = boardController.selectAll();
		Collections.reverse(list);
		System.out.println("===============================");
		System.out.println("글 번호\t제목\t입력 날짜");
		System.out.println("===============================");
		if (list.size() == 0) {
			System.out.println("작성된 글이 없습니다.");
		} else {
			for (BoardVO b : list) {
				System.out.println(b);
			}
			System.out.println("글 번호 선택 (0은 메인 메뉴로)");
			System.out.print("> ");
			int id = scan.nextInt();
			if (id != 0) {
				showOne(boardController, scan, id);
			}
		}
	}

	private static void showOne(BoardController boardController, Scanner scan, int id) {
		BoardVO boardVO = boardController.select(id);
		if (boardVO.getId() == 0) {
			System.out.println("잘못 입력하셨습니다.");
			showList(boardController, scan);
		} else {
			System.out.println("===============================");
			System.out.println("제목: " + boardVO.getTitle());
			System.out.println("===============================");
			System.out.println("작성일: " + boardVO.getWrittenDate());
			System.out.println("수정일: " + boardVO.getUpdatedDate());
			System.out.println("===============================");
			System.out.println(boardVO.getContent());
			System.out.println("===============================");
			System.out.println("1. 수정  2. 삭제  3. 목록으로");
			System.out.println("> ");
			int choice = scan.nextInt();
			if (choice == 3) {
				showList(boardController, scan);
			} else if (choice == 1) {
				update(boardController, scan, id);
			} else if (choice == 2) {
				delete(boardController, id);
				showList(boardController, scan);
			}
		}
	}	

	private static void insert(BoardController boardController, Scanner scan) {
		scan.nextLine();
		BoardVO boardVO = new BoardVO();
		System.out.print("제목: ");
		boardVO.setTitle(scan.nextLine());
		System.out.print("내용: ");
		boardVO.setContent(scan.nextLine());
		boardController.insert(boardVO);
		showList(boardController, scan);		
	}

	private static void delete(BoardController boardController, int id) {
		boardController.delete(id);
	}

	private static void update(BoardController boardController, Scanner scan, int id) {
		scan.nextLine();
		// 버퍼 메모리 비우기
		BoardVO boardVO = new BoardVO();
		//새 객체 만들어서 사용자에게서 받은 제목과 내용, 아이디를 거기에 넣어줄것이야
		System.out.print("제목: ");
		boardVO.setTitle(scan.nextLine());
		System.out.print("내용: ");
		boardVO.setContent(scan.nextLine());
		boardVO.setId(id);
		boardController.update(boardVO);
		//나머지 updatedDate는 boardController.update()의 쿼리문에서 now()로 알아서 입력한다.
		showOne(boardController, scan, id);
		//수정 마쳤으니까 수정한 글 다시 띄워준다.
	}
}
















