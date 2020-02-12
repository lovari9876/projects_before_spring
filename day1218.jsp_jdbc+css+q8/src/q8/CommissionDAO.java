package q8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class CommissionDAO {
//	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
//	private String uid = "scott";
//	private String upw = "tiger";

	// Connection Pool
	private DataSource dataSource;

	public CommissionDAO() {
		try {
			Context context = new InitialContext();
			// JNDI는 java naming and directory interface
			// 명명 및 디렉토리 서비스에 접근하기 위한 API
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
			// Servers/Tomcat.../context.xml의 name인 jdbc/oracle이 와야해.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<CommissionDTO> commissionSelect() {
		ArrayList<CommissionDTO> dtos = new ArrayList<CommissionDTO>();

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
//			conn = DriverManager.getConnection(url, uid, upw);

			conn = dataSource.getConnection(); // 커넥션 풀에서 커넥션 꺼내오기
			String query = "select ename, hiredate, comm from emp where comm is not null";
			pstmt = conn.prepareStatement(query);

			// 절대!!!!!!!!!!!!!!!!!!!!!!!!
			// column name은 parameter(?)로 처리하면 안돼!!!!!!!!!!!
			// value만 가능!!!!!!!!!!!!!!

			// pstmt.setString(1, "ename");
			// pstmt.setString(2, "hiredate");
			// pstmt.setString(3, "comm");

			rs = pstmt.executeQuery();

			if (rs != null)
				System.out.println("select success");
			else
				System.out.println("select fail");

			while (rs.next()) {
				CommissionDTO dto = new CommissionDTO();

				dto.setName((rs.getString("ename")));
				dto.setHiredate(rs.getString("HIREDATE"));
				dto.setCommission(rs.getString("COMM"));

//				String name = rs.getString("ENAME");
//				String hiredate = rs.getString("HIREDATE");
//				String commission = rs.getString("COMM");

//				CommissionDTO dto = new CommissionDTO(name, hiredate, commission);
				dtos.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
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
