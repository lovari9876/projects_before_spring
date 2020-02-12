package day1017_Serialize;
import java.io.Serializable;

public class Contact implements Serializable {
	 
	/**
	 * 클래스이름에 오류뜰때 fix=> add generated serial version ID 하면
	 * 아래와 같이 이 클래스에 대한 유니크한 아이디 만든다!
	 */
	private static final long serialVersionUID = 8902323163104561078L;
	
	private String firstName;
	
	private String lastName;
	
	private Address address;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
}
