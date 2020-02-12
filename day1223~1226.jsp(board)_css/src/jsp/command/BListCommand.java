package jsp.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp.dao.BDao;
import jsp.dto.BDto;

public class BListCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list(); // select������ dtos �޾ƿ�

		// ###��#��#��#��####
		// execute���� request�� �Ķ���ͷ� �޾Ƽ� request ��ü���ٰ� 
		// list��� attribute name���� dtos ���� �־��ش�!!
		request.setAttribute("list", dtos); // r
	}

}
