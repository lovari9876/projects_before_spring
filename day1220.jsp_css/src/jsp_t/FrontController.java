package jsp_t;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Servlet implementation class FrontController

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FrontController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		actionDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		actionDo(request, response);
	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("actionDo");

		String uri = request.getRequestURI();
		System.out.println("uri : " + uri);

		String conPath = request.getContextPath();
		System.out.println("conPath : " + conPath);
		
		String command = uri.substring(conPath.length());
		System.out.println("command : " + command);
		
		if(command.equals("/insert.do")) {
			System.out.println("insert");
			System.out.println("-----------------");			
		}else if(command.equals("/update.do")) {
			System.out.println("update");
			System.out.println("-----------------");	
		}else if(command.equals("/select.do")) {
			System.out.println("select");
			System.out.println("-----------------");	
		}else if(command.equals("/delete.do")) {
			System.out.println("delete");
			System.out.println("-----------------");	
		}else if(command.equals("/membersAll.do")) {
			System.out.println("memberAll");
			System.out.println("-----------------");	
			
			response.setContentType("text/html; charset=EUC-KR");
			PrintWriter writer = response.getWriter();
			writer.println("<html><head></head><body>");
			
			Service service = new MembersAllService();
			ArrayList<MemberDto> dtos = service.execute(request, response);
		
			for(int i = 0; i <dtos.size() ; i++) {
				MemberDto dto = dtos.get(i);
				String id = dto.getId();
				String pw = dto.getPw();
				String name = dto.getName();
				
				writer.println(id + ", " + pw + ", " + name);
			}
			writer.println("</body></html>");
		}
	}
}
