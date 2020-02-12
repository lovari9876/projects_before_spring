package jsp_t;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MembersAllService implements Service {

	@Override
	public ArrayList<MemberDto> execute(HttpServletRequest request, HttpServletResponse response) { // DAO 객체를 생성해서 함수를 만듦.
		
		MemberDao dao = MemberDao.getInstance(); // .getInstance() static 함수(new 안했는데 객체생성)
		
		return dao.membersAll();
	}

}