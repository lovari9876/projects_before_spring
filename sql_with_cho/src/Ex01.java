import java.sql.*;
//데이터베이스 mysql을 
//자바와 연결하기 위해서는 
//자바의 sql 패키지의 커넥션 클래스랑 
//드라이버 매니저 클래스랑
//SQLException 클래스를 불러와야합니다.

//또한 자바에서는 MySQL 드라이버를 기본으로 제공하지 않기 때문에
//외부에서 받아와서 로딩해줘야 합니다.

public class Ex01 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sakila?serverTimezone=UTC", 
					"root", "1234");
			//현재는 schema를 sakila를 사용하도록 설정해두었다.
			System.out.println("로그인 성공");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			} 
		}
	}
} 




