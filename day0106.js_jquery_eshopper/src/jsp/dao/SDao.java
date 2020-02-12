package jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import jsp.dto.SDto;

public class SDao {
	DataSource dataSource;

	// ��ü ������ �����ڿ��� connection pool ���� connection ����
	public SDao() {
		try {
			// context.xml�� ������ �޸𸮿� �ø��°�
			Context context = new InitialContext();
			// �˾Ƽ� connection pool �������ش�.
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// �ݵ�� �ܿ� ��!!
	public ArrayList<SDto> list() {
		ArrayList<SDto> dtos = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = dataSource.getConnection();

			// �����ϴ� ������ ����!!
			String query = "select ename, sal from emp";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String eName = rs.getString("eName");
				int sal = rs.getInt("sal");

				SDto dto = new SDto(eName, sal);
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

}
