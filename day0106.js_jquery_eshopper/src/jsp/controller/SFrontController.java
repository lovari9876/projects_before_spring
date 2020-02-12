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
@WebServlet("*.do") // 확장자 패턴!
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
		System.out.println("actionDo"); // 이거 하는 이유: 디버깅 코드
		// => 지금 어느 지점이다 하는것!!!

		request.setCharacterEncoding("EUC-KR");

		// 공식이니까 외워!!!!!

		String viewPage = null;
		SCommand command = null;

		String uri = request.getRequestURI();
		String conPath = request.getContextPath(); // 톰캣이 관리하는 프로젝트
		String com = uri.substring(conPath.length());

		System.out.println("테스트 URI: " + uri + ":" + conPath + ":" + com);

//		중요!!!!!!!!!!!!!!!!!!!!
//		치고 들어가는 path는 (프로젝트이름 다음) "/.do"로 해주고, 
//		viwPage에다가 웹컨텐트 이하!!!! 부를 파일폴더 해서 파일명 넣어주기!!!!!!!
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
			 * viewPage = "list.do"; // 쓰고 나면 글 목록 보여줘 } else if (com.equals("/list.do")) {
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
			 * // 수정 페이지가 따로 있지 않아.. // 그냥 content-view에서 수정하고 수정버튼 submit 하면 // modify.do로
			 * 가서 실행후, list.do로 응답... viewPage = "list.do"; } else if
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

//		유저가 /write_view.do로 치고 들어오면 write_view.jsp로 연결되는데 
//		어떻게 가능하냐면, 디스패쳐가 서블릿에서 jsp(위에서 지정함)로 forward하도록 해주기 때문
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
//		Forwards a request from a servlet to another resource (servlet, JSP file, orHTML file)
//		on the server. This method allows one servlet to do preliminary processing of
//		a request and another resource to generate the response. 

	}
}
