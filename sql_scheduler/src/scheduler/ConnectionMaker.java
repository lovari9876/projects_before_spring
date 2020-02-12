package scheduler;

//DB와 자바를 연결해주는(통신하게 해주는) ConnectionMaker 인터페이스
import java.sql.*;

public interface ConnectionMaker {
	public Connection makeConnection() throws Exception;
}
