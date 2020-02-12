package day1220.jsp_chap25_command;

// url pattern 중 확장자 패턴 예제!!

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do") // front.jsp에서 뭘 타고 이 페이지로 올지 모르니까 *로 찍어줘
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FrontController() {
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

	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("actionDo");

		String uri = request.getRequestURI();
		System.out.println("uri: " + uri);

		String conPath = request.getContextPath();
		System.out.println("conPath: " + conPath);

		String command = uri.substring(conPath.length());
		System.out.println("command: " + command);

		if (command.equals("/insert.do")) {
			System.out.println("insert");
			System.out.println("-----------------");
		} else if (command.equals("/update.do")) {
			System.out.println("update");
			System.out.println("-----------------");
		} else if (command.equals("/select.do")) {
			System.out.println("select");
			System.out.println("-----------------");
		} else if (command.equals("/delete.do")) {
			System.out.println("delete");
			System.out.println("-----------------");
		} else if (command.equals("/membersAll.do")) {
			response.setContentType("text/html; charset=euc-kr");
			PrintWriter writer = response.getWriter();
			writer.println("<html><head></head><body>");

			Service service = new MembersAllService();
			ArrayList<MemberDTO> dtos = service.execute(request, response);

			for (int i = 0; i < dtos.size(); i++) {
				MemberDTO dto = dtos.get(i);
				String id = dto.getId();
				String pw = dto.getPw();
				String name = dto.getName();

				writer.println(id + ", " + pw + ", " + name);

			}
			writer.println("</body></html>");
		}

	}

}
