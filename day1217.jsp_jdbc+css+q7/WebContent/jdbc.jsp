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

			while (resultSet.next()) {
				String name = resultSet.getString("ename"); //columnLabel
				String job = resultSet.getString("job");
				String mgr = resultSet.getString("mgr");

				out.println("�̸�: " + name + ", ��å: " + job + ", �Ŵ���: " + mgr + "<br />");
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