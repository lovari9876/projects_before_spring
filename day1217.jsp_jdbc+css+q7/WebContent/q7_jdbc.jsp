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
		// ������������ ����6

		/* java���� ǥ��ȭ�� �������̽��� ���� �� �����ͺ��̽����� ����̹��� �����
		�װ��� �����ͼ� ���� ��! */
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		/* port 1521 �� ����Ŭ�� ��Ʈ��ȣ~~~ */
		/* �������Ŵϱ� ��Ÿ���� ���� ū�ϳ�. ���� ��⵵ ����� �ФФ� */
		String uid = "scott"; // DB user Id
		String upw = "tiger"; // DB user pw
		String query = "select * from emp";
		/* ���� ���� ���̺��� �����Ƿ�, scott���� �⺻������ �����ϴ� ���̺��� emp��� */
	%>

	<%
		// runtimeException�� ������ ������ Exception�� �ݵ�� try-catch����� ��
		try {
			Class.forName(driver); // oracle.jdbc.driver.OracleDriver
			//=> Returns the Class object associated with the class or interface
			// with the given string name.
			// �Ķ���ͷ� �־��� String name�� ���õ� Ŭ������ �������̽� ��ü ����
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