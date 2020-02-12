<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page
	import="java.sql.DriverManager, java.sql.ResultSet, java.sql.Statement, java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%!Connection connection;
	Statement statement;
	ResultSet resultSet;%>

	<%
		/* java에서 표준화한 인터페이스에 따라 각 데이터베이스에서 드라이버를 만들면
		그것을 가져와서 쓰는 것! */
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		/* port 1521 은 오라클의 포트번호~~~ */
		/* 정해진거니까 오타나면 정말 큰일나. 오류 잡기도 어려워 ㅠㅠㅠ */
		String uid = "scott"; // DB user Id
		String upw = "tiger"; // DB user pw
		String query = "select * from emp";
		/* 현재 만든 테이블이 없으므로, scott에서 기본적으로 제공하는 테이블인 emp사용 */
	%>

	<%
		// runtimeException을 제외한 나머지 Exception은 반드시 try-catch해줘야 함
		try {
			Class.forName(driver); // oracle.jdbc.driver.OracleDriver
			//=> Returns the Class object associated with the class or interface
			// with the given string name.
			// 파라미터로 주어진 String name과 관련된 클래스나 인터페이스 객체 리턴
			connection = DriverManager.getConnection(url, uid, upw);
			//=> jdbc:oracle:thin:@localhost:1521:xe
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query); // select * from emp

			while (resultSet.next()) {
				String name = resultSet.getString("ename"); //columnLabel
				String job = resultSet.getString("job");
				String mgr = resultSet.getString("mgr");

				out.println("이름: " + name + ", 직책: " + job + ", 매니저: " + mgr + "<br />");
			}

		} catch (Exception e) {

		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (statement != null)
					statement.close();
				if (connection != null)
					connection.close();
			} catch (Exception e) {

			}
		}
	%>

</body>
</html>