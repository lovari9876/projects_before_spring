package jsp.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp.dao.BDao;
import jsp.dto.BDto;

public class BContentCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		String bId = request.getParameter("bId");

		BDao dao = new BDao();
		BDto dto = dao.contentView(bId);

		request.setAttribute("content_view", dto);
	}

}
