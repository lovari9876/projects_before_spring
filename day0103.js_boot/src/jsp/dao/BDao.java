package jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import jsp.dto.BDto;

public class BDao {
	DataSource dataSource;

	// 객체 생성시 생성자에서 connection pool 통해 connection 생성
	public BDao() {
		try {
			// context.xml을 가져다 메모리에 올리는것
			Context context = new InitialContext();
			// 알아서 connection pool 생성해준다.
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void write(String bName, String bTitle, String bContent) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = dataSource.getConnection();
			String query = "insert into mvc_board " + "(bId, bName, bTitle, bContent, bHit, bGroup, bStep, bIndent) "
					+ "values (mvc_board_seq.nextval, ?, ?, ?, 0, mvc_board_seq.currval, 0, 0 )";
			pstmt = conn.prepareStatement(query);

			pstmt.setString(1, bName);
			pstmt.setString(2, bTitle);
			pstmt.setString(3, bContent);

			int rn = pstmt.executeUpdate();

			if (rn == 1) {
				System.out.println("정상");
			} else {
				System.out.println("비정상 처리");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try { // 끊어지지 않았다면 끊기
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	// 반드시 외울 것!!
	public ArrayList<BDto> list() {
		ArrayList<BDto> dtos = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = dataSource.getConnection();

			// 정렬하는 쿼리문 주의!!
			String query = "select * from mvc_board order by bGroup desc, bStep asc";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				int bId = rs.getInt("bId");
				String bName = rs.getString("bName");
				String bTitle = rs.getString("bTitle");
				String bContent = rs.getString("bContent");

				//
				Timestamp bDate = rs.getTimestamp("bDate");
				int bHit = rs.getInt("bHit");
				int bGroup = rs.getInt("bGroup");
				int bStep = rs.getInt("bStep");
				int bIndent = rs.getInt("bIndent");

				BDto dto = new BDto(bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent);
				dtos.add(dto);

			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try { // 끊어지지 않았다면 끊기
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos;
	}

	public BDto contentView(String strID) {
		upHit(strID);

		BDto dto = null; // 게시판 글 하나인 자바빈

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = dataSource.getConnection();

			// 정렬하는 쿼리문 주의!!
			String query = "select * from mvc_board where bid = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(strID));
			rs = pstmt.executeQuery();

			while (rs.next()) { // 하나만 가져오니까 if로 해도 돼!!
				int bId = rs.getInt("bId");
				String bName = rs.getString("bName");
				String bTitle = rs.getString("bTitle");
				String bContent = rs.getString("bContent");
				//
				Timestamp bDate = rs.getTimestamp("bDate");
				int bHit = rs.getInt("bHit");
				int bGroup = rs.getInt("bGroup");
				int bStep = rs.getInt("bStep");
				int bIndent = rs.getInt("bIndent");

				dto = new BDto(bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent);
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try { // 끊어지지 않았다면 끊기
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}

	public void modify(String strID, String bName, String bTitle, String bContent) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = dataSource.getConnection();
			String query = "update mvc_board " + "set bName=?, bTitle=?, bContent=? where bid = ?";
			// set "columnname" = "newvalue" [,"nextcolumn" = "newvalue2"...]
			pstmt = conn.prepareStatement(query);

			pstmt.setString(1, bName);
			pstmt.setString(2, bTitle);
			pstmt.setString(3, bContent);
			pstmt.setInt(4, Integer.parseInt(strID));

			int rn = pstmt.executeUpdate();

			if (rn == 1) {
				System.out.println("정상");
			} else {
				System.out.println("비정상 처리");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try { // 끊어지지 않았다면 끊기
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void delete(String bId) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = dataSource.getConnection();

			String query = "delete from mvc_board where bid = ?";
			pstmt = conn.prepareStatement(query);

			pstmt.setInt(1, Integer.parseInt(bId));

			int rn = pstmt.executeUpdate();

			if (rn == 1) {
				System.out.println("정상");
			} else {
				System.out.println("비정상 처리");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { // 끊어지지 않았다면 끊기
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void upHit(String bId) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = dataSource.getConnection();

			String query = "update mvc_board set bHit = bHit+1 where bid = ?";
			pstmt = conn.prepareStatement(query);

			pstmt.setInt(1, Integer.parseInt(bId));

			int rn = pstmt.executeUpdate();

			if (rn == 1) {
				System.out.println("정상");
			} else {
				System.out.println("비정상 처리");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { // 끊어지지 않았다면 끊기
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	// contentView => ctrl + c, v
	// 거의 같음
	public BDto replyView(String strID) {
		upHit(strID);

		BDto dto = null; // 게시판 글 하나인 자바빈

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = dataSource.getConnection();

			String query = "select * from mvc_board where bid = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(strID));
			rs = pstmt.executeQuery();

			while (rs.next()) { // 하나만 가져오니까 if로 해도 돼!!
				int bId = rs.getInt("bId");
				String bName = rs.getString("bName");
				String bTitle = rs.getString("bTitle");
				String bContent = rs.getString("bContent");
				//
				Timestamp bDate = rs.getTimestamp("bDate");
				int bHit = rs.getInt("bHit");
				int bGroup = rs.getInt("bGroup");
				int bStep = rs.getInt("bStep"); 
				int bIndent = rs.getInt("bIndent");

				dto = new BDto(bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent);
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try { // 끊어지지 않았다면 끊기
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}

	// parameter는 모두 replyView()의 결과 가져온것
	public void reply(String bId, String bName, String bTitle, String bContent, String bGroup, String bStep,
			String bIndent) {

		// 중요!!! : 댓글도 최신순으로 뜨기 때문에 반드시 기존 댓글의 step+1 처리 필요!!!
		// 이 시점의 bStep은 replyView의 bStep이다
		replyShape(bGroup, bStep); // 같은 그룹(글)의 댓글 처리만 하면 되니까!!

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = dataSource.getConnection();
			// 댓글 달기 query 외우기!!!
			String query = "insert into mvc_board (bId, bName, bTitle, bContent, bGroup, bStep, bIndent) "
					+ "values (mvc_board_seq.nextval, ?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(query);

			// request로 받아온 파라미터 값 집어넣기
			pstmt.setString(1, bName);
			pstmt.setString(2, bTitle);
			pstmt.setString(3, bContent);

			// bGroup은 받아온 값, step과 indent는 하나씩 늘어남
			pstmt.setInt(4, Integer.parseInt(bGroup));
			pstmt.setInt(5, Integer.parseInt(bStep) + 1);
			pstmt.setInt(6, Integer.parseInt(bIndent) + 1);

			int rn = pstmt.executeUpdate();

			if (rn == 1) {
				System.out.println("정상");
			} else {
				System.out.println("비정상 처리");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { // 끊어지지 않았다면 끊기
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	private void replyShape(String bGroup, String bStep) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = dataSource.getConnection();

			// query 외우기! : 그룹이 같고, 쓰려는 댓의 step보다 큰 놈들의 step을 +1해준다!!=> 하나씩 밀기!
			String query = "update mvc_board set bStep = bStep+1 where bGroup = ? and bStep > ?";
			pstmt = conn.prepareStatement(query);

			pstmt.setInt(1, Integer.parseInt(bGroup));
			pstmt.setInt(2, Integer.parseInt(bStep));

			int rn = pstmt.executeUpdate();

			if (rn == 1) {
				System.out.println("정상");
			} else {
				System.out.println("비정상 처리");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { // 끊어지지 않았다면 끊기
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
