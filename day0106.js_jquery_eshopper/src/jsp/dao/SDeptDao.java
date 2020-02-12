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

	// 객체 생성시 생성자에서 connection pool 통해 connection 생성
	public SDeptDao() {
		try {
			// context.xml을 가져다 메모리에 올리는것
			Context context = new InitialContext();
			// 알아서 connection pool 생성해준다.
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

			// 정렬하는 쿼리문 주의!!
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
}
