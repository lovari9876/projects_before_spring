package board03;

//DB와 자바를 연결해주는(통신하게 해주는) ConnectionMaker 인터페이스를 받아서
//실제로 mysql과 통신하도록 구체적으로 MysqlConnectionMaker 클래스 만들자!!
//오라클과 하고싶으면 OracleConnectionMaker 클래스 만들면 돼!!!!
//이것이 바로 mysql에 대한 의존성을 줄인 것이고, 
//의존성 주입하는것!!!!

import java.sql.*;

public class MySqlConnectionMaker implements ConnectionMaker {
	private final String URL = "jdbc:mysql://localhost:3306/example?serverTimezone=UTC";
	private final String ID = "root";
	private final String PASSWORD = "1234";
	//이 클래스만 주소, 아이디, 비번 갖고있으면 되기 때문에 게터 세터 필요없어
	
	//매번 메소드마다 연결해주던 커넥션 클래스를 리턴해주는
	//makeConnection()이라는 메소드를 인터페이스로부터 상속받아서 
	//mysql과 connection making 해서 connection객체 conn을 리턴하도록 오버라이딩!!!
	public Connection makeConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL, ID, PASSWORD);
		return conn;
	}
}
