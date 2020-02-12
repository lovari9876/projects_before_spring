package jsp.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp.dao.SDeptDao;
import jsp.dto.SDeptDto;

public class SDeptCommand implements SCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		SDeptDao dao = new SDeptDao();
		ArrayList<SDeptDto> dtos = dao.deptList();

		// ###��#��#��#��####
		// execute���� request�� �Ķ���ͷ� �޾Ƽ� request ��ü���ٰ�
		// list��� attribute name���� dtos ���� �־��ش�!!
		request.setAttribute("dept", dtos);
	}
}
