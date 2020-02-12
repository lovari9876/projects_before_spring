package board03;

import java.sql.*;
import java.util.ArrayList;

//데이터베이스 통신을 이용한 게시판 예제 03
//controller는 DataBase와 데이터 통신만을 담당하는 클래스
//-> 유지,보수가 쉬워지겠지!
//=> 만약 DB와의 기능이 추가적으로 더 필요해진다면? 컨트롤러만 건드린다!

//우리가 두번째 만든 것은 mysql에 의존적이었어!
//
//의존성 주입(Dependency Injection)
//  : 객체 자체가 아니라 Framework에 의해 객체의 의존성이 주입되는 설계 패턴
//-> 의존할 것을 외부에서 주입해주어서 변경가능!
//=> 1. 세터 이용 주입 방법  2. 생성자 이용 주입 방법 
//   3. XML(Extensible Markup Language) 통한 주입 방법

public class BoardController {
	// 1. 세터 이용 주입 방법 사용! =>의존성주입을 위해 필드와 SETTER를 만든다.
	// 하지만 세터를 이용한 의존성 주입은 강제성이 떨어지기 때문에
	// 기본 생성자를 막고 파라미터가 있는 생성자를 만들어서
	// 꼭 ConnectionMaker가 들어와서
	// makeConnection() 메소드를 통해서 Connection conn이 초기화가 될 수 있게
	// 만들어서 생성자를 통한 DI를 구현한다.

	Connection conn; //클래스의 객체 conn 만들었다링...
	//A connection (session) with a specificdatabase. 
	//SQL statements are executed and
	// results are returned within the context of a connection. 

	//파라미터로 ConnectionMaker 받는 생성자 만들기. 인자받기를 강제함.
	public BoardController(ConnectionMaker m) throws Exception {
		conn = m.makeConnection(); 
		//BoardController의 객체를 만들고 싶다면 반드시 파라미터를 똑같이 넣어주고
		//makeConnection()이라는 실제로 연결하는 메소드까지 강제로 연결해야해!
	}

	public ArrayList<BoardVO> selectAll() {
		ArrayList<BoardVO> list = new ArrayList<>();
		String sql = "SELECT * FROM board";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardVO b = new BoardVO();
				b.setId(rs.getInt("id"));
				b.setTitle(rs.getNString("title"));
				b.setContent(rs.getString("content"));
				b.setWrittenDate(rs.getDate("writtenDate"));
				b.setUpdatedDate(rs.getDate("updatedDate"));
				list.add(b);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public BoardVO select(int id) {
		BoardVO boardVO = new BoardVO();
		String sql = "SELECT * FROM board WHERE id = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				boardVO.setId(id);
				boardVO.setTitle(rs.getNString("title"));
				boardVO.setContent(rs.getString("content"));
				boardVO.setWrittenDate(rs.getDate("writtenDate"));
				boardVO.setUpdatedDate(rs.getDate("updatedDate"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return boardVO;
	}

	public void insert(BoardVO boardVO) {
		String sql = "INSERT INTO board(title, content, writtenDate, updatedDate)"
				+ " VALUES(?, ?, NOW(), NOW())";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, boardVO.getTitle());
			pstmt.setString(2, boardVO.getContent());
			// private fields 이기에 getter로 갖고온다!
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void update(BoardVO boardVO) {
		String sql = "UPDATE board SET title = ?, content = ?, "
				+ "updatedDate = NOW() WHERE id = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, boardVO.getTitle());
			pstmt.setString(2, boardVO.getContent());
			pstmt.setInt(3, boardVO.getId());
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(int id) {
		String sql = "DELETE FROM board WHERE id = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
