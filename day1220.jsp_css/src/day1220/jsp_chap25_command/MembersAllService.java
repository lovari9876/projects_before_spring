package day1220.jsp_chap25_command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 인터페이스를 통해 각각의 역할을 수행할 클래스를 만들어 유지,보수가 쉽게 함!!

public class MembersAllService implements Service {

	@Override
	public ArrayList<MemberDTO> execute(HttpServletRequest request, HttpServletResponse response) {
	// return type의 객체를 생성하고 메소드 호출하여 ArrayList로 받아오기!
		MemberDAO dao = MemberDAO.getInstance(); // 객체 생성		
		
		return dao.membersAll();
	}

}
