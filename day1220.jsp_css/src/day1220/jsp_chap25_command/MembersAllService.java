package day1220.jsp_chap25_command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// �������̽��� ���� ������ ������ ������ Ŭ������ ����� ����,������ ���� ��!!

public class MembersAllService implements Service {

	@Override
	public ArrayList<MemberDTO> execute(HttpServletRequest request, HttpServletResponse response) {
	// return type�� ��ü�� �����ϰ� �޼ҵ� ȣ���Ͽ� ArrayList�� �޾ƿ���!
		MemberDAO dao = MemberDAO.getInstance(); // ��ü ����		
		
		return dao.membersAll();
	}

}
