package edu.bit.ex;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JoinOk
 */
@WebServlet("/JoinOk")
// 일케 하면 /JoinOk 주소 쳤을 때 여기루 고고
public class JoinOk extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Connection connection;
	private Statement statement;
	private String name, id, pw, phone1, phone2, phone3, sex;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public JoinOk() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost 실행");
		actionDo(request, response);
	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");

		name = request.getParameter("name");
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		phone1 = request.getParameter("phone1");
		phone2 = request.getParameter("phone2");
		phone3 = request.getParameter("phone3");
		sex = request.getParameter("sex");

		String query = "insert into member values('" + name + "','" + id + "','" + pw + "','" + phone1 + "','" + phone2
				+ "','" + phone3 + "','" + sex + "')";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			statement = connection.createStatement();

			int i = statement.executeUpdate(query);
// Executes the given SQL statement, which may be an INSERT, UPDATE, or DELETE statement
// or anSQL statement that returns nothing, such as an SQL DDL statement. 
// Returns:either (1) the row count for SQL Data Manipulation Language (DML) statements
//	or (2) 0 for SQL statements that return nothing.
			if (i == 1) {
				System.out.println("insert success");
				response.sendRedirect("joinResult.jsp");

			} else {
				System.out.println("insert fail");
				response.sendRedirect("join.jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null)
					statement.close();
				if (connection != null)
					connection.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
