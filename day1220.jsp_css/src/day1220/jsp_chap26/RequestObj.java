package day1220.jsp_chap26;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestObj
 */
@WebServlet("/RequestObj")
public class RequestObj extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RequestObj() {
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
		actionDo(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		actionDo(request, response);
	}

	protected void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("actionDo");

//		String id = (String) request.getAttribute("id");
//		String pw = (String) request.getAttribute("pw");
//
//		response.setContentType("text/jhtml; charset=EUC-KR");
//		PrintWriter writer = response.getWriter();
//		writer.print("<html><head></head><body>");
//		writer.print("RequestObj" + "<hr>");
//		writer.print("id: " + id + "<br>");
//		writer.print("pw: " + pw + "<br>");
//		writer.print("</body></html>");

		request.setAttribute("id", "abcde");
		request.setAttribute("pw", "12345");

		// response 대신에 dispatcher 쓰기
		RequestDispatcher dispatcher = request.getRequestDispatcher("/dispatcher.jsp");
		dispatcher.forward(request, response);
		// forward하면 파라미터로 받은 객체 두 개가 "/dispatcher.jsp" 전달
	}

}
