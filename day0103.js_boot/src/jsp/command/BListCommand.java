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
		ArrayList<BDto> dtos = dao.list(); // select문으로 dtos 받아옴

		// ###핵#심#코#드####
		// execute에서 request를 파라미터로 받아서 request 객체에다가 
		// list라는 attribute name으로 dtos 값을 넣어준다!!
		request.setAttribute("list", dtos); // r
	}

}
