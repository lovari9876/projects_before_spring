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

		// ###핵#심#코#드####
		// execute에서 request를 파라미터로 받아서 request 객체에다가
		// list라는 attribute name으로 dtos 값을 넣어준다!!
		request.setAttribute("dept", dtos);
	}
}
