package edu.bit.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormEx
 */
@WebServlet("/FormEx")
public class FormEx extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FormEx() {
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
//		response.getWriter().append("Served at: ").append(request.getContextPath());

		System.out.println("doGet");

//		String id = getInitParameter("id");
//		String pw = getInitParameter("pw");
//		String path = getInitParameter("path");
		
//		init param은 특정 servlet에서만 쓸 수 있다면, 
//		context param은 해당 프로젝트의 servlet들이 공유할 수 있다.
		String id = getServletContext().getInitParameter("id");
		String pw = getServletContext().getInitParameter("pw");
		String path = getServletContext().getInitParameter("path");

		response.setContentType("text/html; charset=euc-kr");
		PrintWriter writer = response.getWriter();

		writer.println("<html><head></head><body>");
		writer.println("ID: " + id + "<br />");
		writer.println("PASSWORD: " + pw + "<br />");
		writer.println("PATH: " + path + "<br />");
		writer.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("doPost");
//		
//		// 클라이언트의 입력값의 인코딩을 설정해주어 한글 안깨지게....
//		request.setCharacterEncoding("EUC-KR");
//		
//		// request(클라이언트의 입력값) 받기
//		String id = request.getParameter("id"); // html의 name 속성과 맞춰준다.
//		String pw = request.getParameter("pw");
//		
//		// checkbox는 두개이상 체크 가능이므로 배열로 받아온다.
//		String[] hobbys = request.getParameterValues("hobby");
//		
//		String major = request.getParameter("major");
//		String protocol = request.getParameter("protocol");
//		
//		// 여기서는 다시 클라이언트인 웹브라우저에게 뿌려주는 것
//		response.setContentType("text/html; charset=euc-kr");
//		PrintWriter writer = response.getWriter();
//		writer.println("<html><head></head><body>");
//		writer.println("ID: " + id + "<br />");
//		writer.println("PASSWORD: " + pw + "<br />");
//		writer.println("취미: " + Arrays.toString(hobbys) + "<br />");
//		writer.println("전공: " + major + "<br />");
//		writer.println("프로토콜: " + protocol);
//		writer.println("</body></html>");
//		
//		writer.close();
//	}

}
