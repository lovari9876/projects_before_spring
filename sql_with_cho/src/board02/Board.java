package board02;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//데이터베이스 통신을 이용한 게시판 예제 02
//CRUD 명령어를 최소한 메소드로 분리시키자!!
//이렇게 메소드만 분리하면, 재사용성이 떨어지게 된다....
//메인 메소드 내부에도 뭐가 너무 많고 같은 코드를 많이 썼어
public class Board {
	int id;
	String title;
	String content;
	Date writtenDate;
	Date updatedDate;
	final static String URL = "jdbc:mysql://localhost:3306/example?serverTimezone=UTC";
	//mysql 접속주소이다.
	final static String USERNAME = "root";
	final static String PASSWORD = "1234";
	//왜 대문자?? => Constants naming conventions
	//Java constants should be all UPPERCASE where words are separated by
	//	underscore character (“_”). 
	//Make sure to use final modifier with constant variables.

	// SELECT * FROM board;
	// 위의 쿼리문 결과표를 가져오는 메소드 생성
	public static ArrayList<Board> selectAll() {
		//리턴타입이 ArrayList<Board>이다.
		ArrayList<Board> list = new ArrayList<>();
		//초기화해서 list.size() = 0 이고 list = null 이다.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//mysql 서버와 통신중
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			//데이터베이스와 통신하기 위해 필요한 세가지를 주고 커넥션 객체를 리턴받는다.
			String query = "SELECT * FROM board";
			//미리 query를 설정해주고 넣어준다~~
			PreparedStatement pstmt = conn.prepareStatement(query);
			//커넥션 객체의 경우에는 우리가 query문을 준비시켜줄 수 있다.
			ResultSet rs = pstmt.executeQuery();
			//retrieve query로 나오는 결과(execute Query한 결과)를 
			//뭉뚱그려서 ResultSet rs에 넣어준다.
			while (rs.next()) {
			//다음을 읽어주는데, ResultSet은 다음으로 커서를 자동 이동하는 기능이 있어서
			//그냥 이것만 조건에 넣어주면 된다.
				Board b = new Board();
				//board형 객체 만들어서 긁어온 값을 Board b에 넣기 위해 String columnLabel을 써준다. 
				b.id = rs.getInt("id");
				b.title = rs.getString("title");
				b.content = rs.getString("content");
				b.writtenDate = rs.getDate("writtenDate");
				b.updatedDate = rs.getDate("updatedDate");
				//이제 하나의 Board인 b를 읽어왔으니, list에 요소로 넣어준다링!
				list.add(b);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	//id를 입력시 그 해당 id의 row를 읽어오는 메소드
	public static Board select(int id) {
		//글 하나만 리턴해주면 되기 때문에 Board 하나만 만들어주는것!
		Board b = new Board();
		//기본 생성자로 인해 new 하면 null로 초기화된다!!
		//b.id 기본값은 0, 객체는 null로 초기화~~~
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			String sql = "SELECT * FROM board WHERE id = ?";	
			//사용법: PreparedStatement pstmt = con.prepareStatement("UPDATE EMPLOYEES
            //        SET SALARY = ? WHERE ID = ?");
			//여기서는 ()에 그대로 넣는대신 String sql로 받아서 sql만 바꾸도록 관리~~
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			//파라미터로 받은 int id가 들어갈 ?의  index와 파라미터를 각각 인자로 받는 메소드
			//PreparedStatement는 ?에 어떤것도 넣어줄수 있어! Int 타입넣어주기로 했으니 
			//setInt(1, id) 해준다.
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				//읽어올 값이 존재할때만 읽어온다.
				b.id = rs.getInt("id");
				b.title = rs.getString("title");
				b.content = rs.getString("content");
				b.writtenDate = rs.getDate("writtenDate");
				b.updatedDate = rs.getDate("updatedDate");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return b;
		//읽어올게 없었다면 초기화된 Board b를 그대로 리턴~~
	}	
	
	//insert하는 query를 처리해주는 메소드
	public static void insert(Board b) {
		//유지 보수 측면에서 Board b를 파라미터로 받아주는것!
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			String sql = "INSERT INTO board(title, content, writtenDate, updatedDate)"
					+ "VALUES(?, ?, NOW(), NOW())";
			//무엇무엇에 값을 순서대로 넣어주겠단 query문
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.title);
			pstmt.setString(2, b.content);
			pstmt.execute();		
			//void 타입 메소드만 execute()를 실행~~
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//id로 찾아서 row 한줄 지워주기
	public static void delete(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			String query = "DELETE FROM board WHERE id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			//파라미터로 받은 int id가 들어갈 ?의 index와 파라미터를 각각 인자로 받는 메소드
			pstmt.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	//update하는 메소드; id로 찾아서 그 아이디의 해당 row에 제목과 내용 수정해준다.
	public static void update(Board b) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			String query = "UPDATE board SET title = ?, content = ?, updatedDate = NOW() WHERE id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, b.title);
			pstmt.setString(2, b.content);
			pstmt.setInt(3, b.id);
			//수정할 아이디값 부여한다.
			pstmt.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//main() method -> 지금껏 만든 CRUD method들을 실행할 메인 메소드
	//메인 메소드는 static 이기 때문에 같은 클래스의 다른 메소드들을 끌어오려면
	//다른 메소드들도 마찬가지로 static이어야 한다!
	//static은 static에서만 호출할 수 있다. (객체없이 호출가능)
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("------------<게시판>------------");
			System.out.println("1. 글 목록보기  2. 글 작성하기  3. 종료");
			System.out.print("> ");
			int choice = scan.nextInt();
			if(choice == 3) {
				System.out.println("사용해 주셔서 감사합니다~~");
				break;
			}else if (choice ==1) {
				ArrayList<Board> list = selectAll();
				//전부 보여주는 메소드로 list 불러와
				Collections.reverse(list);
				System.out.println("=============<목록>=============");
				if(list.size() == 0) {
					//board가 하나도 없어, 즉 글이 없다.
					System.out.println("글이 없습니다.");										
				}else {
					//글이 하나라도 있어!
					System.out.println("번호\t제목\t작성일\t");
					System.out.println("===============================");
					
					for(Board b : list) {		
						//for each문은 데이터 읽기는 되지만 수정은 불가!!
						//왜냐하면 각각의 요소를 b라는 보드에 복사해서 읽어오기만 하기 때문~
						System.out.println(b.id+"\t"+b.title+"\t"+b.writtenDate);
					}
					System.out.println("===============================");
					System.out.println("글 번호 선택 (0은 종료)");
					System.out.print("> ");
					int boardId = scan.nextInt();
					if(boardId != 0) {
						//글번호를 입력했어~
						Board b = select(boardId);
						//아직 안쓴 글, 즉 누군가 쓰지 않은 글번호 눌렀다면 초기화 된 상태로 불러와
						if(b.id == 0) {
							//boardId, 즉 글번호는 mysql에서 1부터 시작해!
							System.out.println("잘못 선택하셨습니다.");
						}else {
							System.out.println("==============================");
							System.out.println("제목: " + b.title);
							System.out.println("==============================");
							System.out.println("작성일: " + b.writtenDate);
							System.out.println("수정일: " + b.updatedDate);
							System.out.println("==============================");
							System.out.println("\t내용");
							System.out.println("==============================");
							System.out.println(b.content);
							System.out.println("==============================");
							System.out.println("1. 글 수정  2. 글 삭제  3. 메인으로");
							System.out.println("> ");
							choice = scan.nextInt();
							if(choice == 2) {
								delete(boardId);
								System.out.println("==============================");
								System.out.println(boardId + "번 글이 삭제되었습니다.");
							}else if(choice == 1) {
								scan.nextLine();
								Board update = new Board();
								update.id = boardId;
								System.out.print("제목: ");
								update.title = scan.nextLine();
								System.out.print("내용: ");
								update.content = scan.nextLine();
								update(update);
								System.out.println("==============================");
								System.out.println(boardId + "번 글이 수정되었습니다.");
							}
						}
					}
					
				}					
			}
			else if(choice == 2) {
				scan.nextLine();
				Board insert = new Board();
				System.out.println("==============================");
				System.out.print("제목: ");
				insert.title = scan.nextLine();
				System.out.println("==============================");
				System.out.println("내용: ");
				insert.content = scan.nextLine();
				insert(insert);			
			}
		}
		scan.close();
	}	
}



