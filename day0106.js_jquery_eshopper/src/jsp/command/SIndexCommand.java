package jsp.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp.dao.SDao;
import jsp.dto.SDto;

public class SIndexCommand implements SCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		SDao dao = new SDao();
		ArrayList<SDto> dtos = dao.list(); // select������ dtos �޾ƿ�

		// ###��#��#��#��####
		// execute���� request�� �Ķ���ͷ� �޾Ƽ� request ��ü���ٰ�
		// list��� attribute name���� dtos ���� �־��ش�!!
		request.setAttribute("list", dtos);
	}
}
