<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page
	import="java.sql.DriverManager, java.sql.ResultSet, java.sql.Statement, java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>q6</title>
</head>

<style>
table, tr, td {
	border: 2px solid #cccccc;
	border-collapse: collapse;
	padding: 3px;
}

td {
	text-align: center;
}

tr#column {
	font-weight: bold;
	font-size: 18px;
}
</style>

<body>

	<%!Connection connection;
	Statement statement;
	ResultSet resultSet;%>

	<%
		// 면접예상질문 문제6

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
	%>

	<table>

		<tr id="column">
			<td>EMPNO</td>
			<td>ENAME</td>
			<td>JOB</td>
			<td>MGR</td>
			<td>HIREDATE</td>
			<td>SAL</td>
			<td>COMM</td>
			<td>DEPTNO</td>
		</tr>

		<%
			while (resultSet.next()) {
					int empNo = resultSet.getInt("empno");
					String name = resultSet.getString("ename"); //columnLabel
					String job = resultSet.getString("job");
					String mgr = resultSet.getString("mgr");
					String hireDate = resultSet.getString("hiredate");
					int sal = resultSet.getInt("sal");
					String comm = resultSet.getString("comm");
					int deptNo = resultSet.getInt("deptno");

					out.println("<tr>");
					out.println("<td>" + empNo + "</td>");
					out.println("<td>" + name + "</td>");
					out.println("<td>" + job + "</td>");
					out.println("<td>" + mgr + "</td>");
					out.println("<td>" + hireDate + "</td>");
					out.println("<td>" + sal + "</td>");
					out.println("<td>" + comm + "</td>");
					out.println("<td>" + deptNo + "</td>");
					out.println("</tr>");
				}
				out.println("</table>");
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