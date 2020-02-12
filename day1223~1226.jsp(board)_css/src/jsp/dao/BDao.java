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

	// ��ü ������ �����ڿ��� connection pool ���� connection ����
	public BDao() {
		try {
			// context.xml�� ������ �޸𸮿� �ø��°�
			Context context = new InitialContext();
			// �˾Ƽ� connection pool �������ش�.
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
				System.out.println("����");
			} else {
				System.out.println("������ ó��");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try { // �������� �ʾҴٸ� ����
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	// �ݵ�� �ܿ� ��!!
	public ArrayList<BDto> list() {
		ArrayList<BDto> dtos = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = dataSource.getConnection();

			// �����ϴ� ������ ����!!
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
			try { // �������� �ʾҴٸ� ����
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

		BDto dto = null; // �Խ��� �� �ϳ��� �ڹٺ�

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = dataSource.getConnection();

			// �����ϴ� ������ ����!!
			String query = "select * from mvc_board where bid = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(strID));
			rs = pstmt.executeQuery();

			while (rs.next()) { // �ϳ��� �������ϱ� if�� �ص� ��!!
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
			try { // �������� �ʾҴٸ� ����
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
				System.out.println("����");
			} else {
				System.out.println("������ ó��");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try { // �������� �ʾҴٸ� ����
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
				System.out.println("����");
			} else {
				System.out.println("������ ó��");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { // �������� �ʾҴٸ� ����
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
				System.out.println("����");
			} else {
				System.out.println("������ ó��");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { // �������� �ʾҴٸ� ����
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
	// ���� ����
	public BDto replyView(String strID) {
		upHit(strID);

		BDto dto = null; // �Խ��� �� �ϳ��� �ڹٺ�

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = dataSource.getConnection();

			String query = "select * from mvc_board where bid = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(strID));
			rs = pstmt.executeQuery();

			while (rs.next()) { // �ϳ��� �������ϱ� if�� �ص� ��!!
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
			try { // �������� �ʾҴٸ� ����
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

	// parameter�� ��� replyView()�� ��� �����°�
	public void reply(String bId, String bName, String bTitle, String bContent, String bGroup, String bStep,
			String bIndent) {

		// �߿�!!! : ��۵� �ֽż����� �߱� ������ �ݵ�� ���� ����� step+1 ó�� �ʿ�!!!
		// �� ������ bStep�� replyView�� bStep�̴�
		replyShape(bGroup, bStep); // ���� �׷�(��)�� ��� ó���� �ϸ� �Ǵϱ�!!

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = dataSource.getConnection();
			// ��� �ޱ� query �ܿ��!!!
			String query = "insert into mvc_board (bId, bName, bTitle, bContent, bGroup, bStep, bIndent) "
					+ "values (mvc_board_seq.nextval, ?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(query);

			// request�� �޾ƿ� �Ķ���� �� ����ֱ�
			pstmt.setString(1, bName);
			pstmt.setString(2, bTitle);
			pstmt.setString(3, bContent);

			// bGroup�� �޾ƿ� ��, step�� indent�� �ϳ��� �þ
			pstmt.setInt(4, Integer.parseInt(bGroup));
			pstmt.setInt(5, Integer.parseInt(bStep) + 1);
			pstmt.setInt(6, Integer.parseInt(bIndent) + 1);

			int rn = pstmt.executeUpdate();

			if (rn == 1) {
				System.out.println("����");
			} else {
				System.out.println("������ ó��");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { // �������� �ʾҴٸ� ����
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

			// query �ܿ��! : �׷��� ����, ������ ���� step���� ū ����� step�� +1���ش�!!=> �ϳ��� �б�!
			String query = "update mvc_board set bStep = bStep+1 where bGroup = ? and bStep > ?";
			pstmt = conn.prepareStatement(query);

			pstmt.setInt(1, Integer.parseInt(bGroup));
			pstmt.setInt(2, Integer.parseInt(bStep));

			int rn = pstmt.executeUpdate();

			if (rn == 1) {
				System.out.println("����");
			} else {
				System.out.println("������ ó��");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { // �������� �ʾҴٸ� ����
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
