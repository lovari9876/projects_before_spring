package jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import jsp.dto.SDeptDto;

public class SDeptDao {
	DataSource dataSource;

	// ��ü ������ �����ڿ��� connection pool ���� connection ����
	public SDeptDao() {
		try {
			// context.xml�� ������ �޸𸮿� �ø��°�
			Context context = new InitialContext();
			// �˾Ƽ� connection pool �������ش�.
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<SDeptDto> deptList() {
		ArrayList<SDeptDto> dtos = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = dataSource.getConnection();

			// �����ϴ� ������ ����!!
			String query = "select dname from dept";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String dName = rs.getString("dname");

				SDeptDto dto = new SDeptDto(dName);
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
