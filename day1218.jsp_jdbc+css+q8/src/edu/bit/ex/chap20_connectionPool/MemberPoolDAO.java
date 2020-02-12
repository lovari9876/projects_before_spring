package edu.bit.ex.chap20_connectionPool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberPoolDAO {
//	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
//	private String uid = "scott";
//	private String upw = "tiger";

	// Connection Pool
	private DataSource dataSource;
	
	public MemberPoolDAO() {
		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			Context context = new InitialContext();
			// JNDI는 java naming and directory interface
			// 명명 및 디렉토리 서비스에 접근하기 위한 API
			dataSource =(DataSource)context.lookup("java:comp/env/jdbc/oracle");
			// Servers/Tomcat.../context.xml의 name인 jdbc/oracle이 와야해.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<MemberDTO> memberSelect() {
		ArrayList<MemberDTO> dtos = new ArrayList<MemberDTO>();

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {

//			conn = DriverManager.getConnection(url, uid, upw);
			
			conn = dataSource.getConnection(); // 커넥션 풀에서 커넥션 꺼내오기
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from member");

			while (rs.next()) {
				String name = rs.getString("name");
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String phone1 = rs.getString("phone1");
				String phone2 = rs.getString("phone2");
				String phone3 = rs.getString("phone3");
				String sex = rs.getString("sex");
				
				MemberDTO dto = new MemberDTO(name, id, pw, phone1, phone2, phone3, sex);
				dtos.add(dto);
			}		

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos;
	}

}
