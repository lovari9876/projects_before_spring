package board01;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//데이터베이스 통신을 이용한 게시판 예제 01
//가장 원시적인 형태의 게시판 예제
//메인 함수 안에 때려박는 식으로 초기 코드 작성

public class Board {
	int id;
	String title;
	String content;
	Date writtenDate;
	//ctrl + space -> import 창 뜬다 -> java.sql.Date 선택
	Date updatedDate;	
	
	public boolean equals(Object o) {
		//equals 메소드는 모든 객체에 대해 실행가능~~
		if(o instanceof Board) {
			Board b = (Board)o;
			if(b.id == this.id) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		//import java.sql.connection 해준다.
		Scanner scan = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/example?serverTimezone=UTC", 
					"root", "1234");
			//localhost:3306/다음에는 사용을 원하는 schema 이름 써준다.
			while(true) {
				System.out.println("------------<게시판>------------");
				System.out.println("1. 글 목록보기  2. 글 작성하기  3. 종료");
				System.out.print("> ");
				int choice = scan.nextInt();
				if(choice == 3) {
					System.out.println("사용해 주셔서 감사링S2");
					break;
				}else if (choice == 1) {
					//글 목록 보여주기
					//글 목록 보여주기는 번호 제목 작성날짜 순으로 출력이 된다.
					//그리고 사용자는 번호를 입력해서 원하는 글로 이동한다.
					ArrayList<Board> list = new ArrayList<>();
					//우리의 list는 board 형식의 모음!
					//우리가 mysql에서 select *한 표를 보여주려고!
					String query = "SELECT * FROM board";
					PreparedStatement pstmt = conn.prepareStatement(query);
				//An object that represents a precompiled SQL statement. 
				//A SQL statement is precompiled and stored in a PreparedStatement object.
				//This object can then be used to efficiently execute
				//	this statement multiple times. 

				//준비(PreparedStatement)를 거쳐서 결과(ResultSet) 도출하기까지의 과정이다.
					ResultSet rs = pstmt.executeQuery(query);
				//쿼리문을 작성해 나온 결과를 resultSet이라 하고 자바에서도 그 결과를 갖고있게 된다.
					while(rs.next()) {
						//다음에 읽어올 결과셋(String query = "SELECT * FROM board"한 결과)이
						//남아있을 때!
						Board b = new Board();
						b.id = rs.getInt("id");
						b.title = rs.getString("title");
						b.content = rs.getString("content");
						b.writtenDate = rs.getDate("writtenDate");
						b.updatedDate = rs.getDate("updatedDate");
						list.add(b);
						//ArrayList<Board> list에 다 담겼다.
					}
					System.out.println("==============================");
					System.out.println("글번호\t제목\t작성날짜");
					System.out.println("==============================");
					if(list.size() == 0) {
						System.out.println("아무런 글이 없습니다.");
						
					}else {
						Collections.reverse(list);
						//이걸 해야 list의 b(각 row 하나씩)들이 역순 즉, 최신것부터 출력된다.
						for(Board b : list) {
							System.out.println(b.id +"\t"+ b.title+"\t"+ b.writtenDate);
							//임시로 Board b 선언하여 list에서 꺼내 하나씩 출력
						}
						System.out.println("글 번호 선택(0은 종료)");
						System.out.print(">");
						int boardNum = scan.nextInt();
						//boardNum 은 글 번호이다.
						if(boardNum != 0) {
							for(Board b : list) {
								if(b.id == boardNum) {
									System.out.println("=============<제목>============");
									System.out.println(b.title);
									System.out.print("작성일: ");
									System.out.println(b.writtenDate);
									System.out.println("=============<내용>============");
									System.out.println(b.content);
									System.out.println("1. 수정  2. 삭제  3. 메인으로");
									System.out.print(">");
									choice = scan.nextInt();	
									if(choice == 2) {
										query = "DELETE FROM board WHERE id = ?";
										pstmt = conn.prepareStatement(query);
										pstmt.setInt(1, boardNum);
										//?에 값 넣는 것. 1 위치에 boardNum 넣어달란 얘기
										pstmt.execute();										
									}else if(choice == 1) {
										System.out.print("제목: ");
										scan.nextLine();
										//스캐너는 버퍼메모리 참조한다. 
										//우리가 콘솔에 입력한 엔터키를 고려하여 한줄씩 읽어오는것
										//버퍼 메모리 지우고,
										String title = scan.nextLine();
										//다시 읽어오는 과정
										System.out.print("내용: ");
										String content = scan.nextLine();
										query = "UPDATE board SET title = ?, content = ?, updatedDate = NOW() WHERE id = ?";
										pstmt = conn.prepareStatement(query);
										pstmt.setString(1, title);
										pstmt.setString(2, content);
										pstmt.setInt(3, boardNum);
										pstmt.execute();										
									}
								}
							}
						}
					
					}
				}else if (choice == 2) {
					//글 작성하기
					//제목: 
					//내용:
					//요렇게 떠서 사용자가 입력할 수 있게 한다.
					scan.nextLine();
					//버퍼메모리 지워주기
					System.out.print("제목: ");
					String title = scan.nextLine();
					System.out.print("내용: ");
					String content = scan.nextLine();
					String query = "INSERT INTO board(title, content, writtenDate, updatedDate) "
							+ "VALUES(?, ?, NOW(), NOW())";
					PreparedStatement pstmt = conn.prepareStatement(query);
					pstmt.setString(1, title);
					pstmt.setString(2, content);
					pstmt.execute();					
				}
			}					
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
			scan.close();
		}
	}
}


















