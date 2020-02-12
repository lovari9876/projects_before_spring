package jsp_t;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Servlet implementation class RequestObj

@WebServlet("/RequestObj")
public class RequestObj extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RequestObj() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request, response);
	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("actionDo");
		
//		String id = (String)request.getAttribute("id");
//		String pw = (String)request.getAttribute("pw");
//		
//		response.setContentType("text/html; charset=EUC-KR");
//		PrintWriter writer = response.getWriter();
//		writer.print("<html><head></head><body>");
//		writer.print("RequestObj" + "<hr/>");
//		writer.print("id : " + id + "<br/>");
//		writer.print("pw : " + pw + "<br/>");
//		writer.print("</body>" + "</html>");
		
		
		request.setAttribute("id", "qwer");
		request.setAttribute("pw", "1234");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/dispatcher.jsp");
		dispatcher.forward(request, response);
	}

}
