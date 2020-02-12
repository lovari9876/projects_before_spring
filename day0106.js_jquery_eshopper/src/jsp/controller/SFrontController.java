package jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp.command.*;

/**
 * Servlet implementation class BFrontController
 */
@WebServlet("*.do") // Ȯ���� ����!
public class SFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SFrontController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet");
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost");
		actionDo(request, response);
	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("actionDo"); // �̰� �ϴ� ����: ����� �ڵ�
		// => ���� ��� �����̴� �ϴ°�!!!

		request.setCharacterEncoding("EUC-KR");

		// �����̴ϱ� �ܿ�!!!!!

		String viewPage = null;
		SCommand command = null;

		String uri = request.getRequestURI();
		String conPath = request.getContextPath(); // ��Ĺ�� �����ϴ� ������Ʈ
		String com = uri.substring(conPath.length());

		System.out.println("�׽�Ʈ URI: " + uri + ":" + conPath + ":" + com);

//		�߿�!!!!!!!!!!!!!!!!!!!!
//		ġ�� ���� path�� (������Ʈ�̸� ����) "/.do"�� ���ְ�, 
//		viwPage���ٰ� ������Ʈ ����!!!! �θ� �������� �ؼ� ���ϸ� �־��ֱ�!!!!!!!
		if (com.equals("/index.do")) {
			command = new SIndexCommand();
			command.execute(request, response);
			command = new SDeptCommand();
			command.execute(request, response);

			viewPage = "/index.jsp";
		} /*
			 * else if (com.equals("/write.do")) { command = new BWriteCommand();
			 * command.execute(request, response);
			 * 
			 * viewPage = "list.do"; // ���� ���� �� ��� ������ } else if (com.equals("/list.do")) {
			 * command = new BListCommand(); command.execute(request, response);
			 * 
			 * viewPage = "/jsp.mvc_board/list.jsp"; } else if
			 * (com.equals("/content_view.do")) { command = new BContentCommand();
			 * command.execute(request, response);
			 * 
			 * viewPage = "/jsp.mvc_board/content_view.jsp"; } else if
			 * (com.equals("/modify.do")) { command = new BModifyCommand();
			 * command.execute(request, response);
			 * 
			 * // ���� �������� ���� ���� �ʾ�.. // �׳� content-view���� �����ϰ� ������ư submit �ϸ� // modify.do��
			 * ���� ������, list.do�� ����... viewPage = "list.do"; } else if
			 * (com.equals("/delete.do")) { command = new BDeleteCommand();
			 * command.execute(request, response);
			 * 
			 * viewPage = "list.do"; } else if (com.equals("/reply_view.do")) { command =
			 * new BReplyViewCommand(); command.execute(request, response);
			 * 
			 * viewPage = "/jsp.mvc_board/reply_view.jsp"; } else if
			 * (com.equals("/reply.do")) { command = new BReplyCommand();
			 * command.execute(request, response);
			 * 
			 * viewPage = "list.do"; }
			 */

//		������ /write_view.do�� ġ�� ������ write_view.jsp�� ����Ǵµ� 
//		��� �����ϳĸ�, �����İ� �������� jsp(������ ������)�� forward�ϵ��� ���ֱ� ����
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
//		Forwards a request from a servlet to another resource (servlet, JSP file, orHTML file)
//		on the server. This method allows one servlet to do preliminary processing of
//		a request and another resource to generate the response. 

	}
}
