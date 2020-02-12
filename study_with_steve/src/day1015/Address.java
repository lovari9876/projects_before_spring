package day1015;
import java.util.Set;

public interface Address {
	
	String getFirstName();
	
	void setFirstName(String firstName);
	
	String getLastName();
	
	void setLastName(String LastName);
	
	/*
	String getPostCode();
	
	String getAddressStreet();
	
	String getCity();
	
	String getState();
	*/
	//위의 애들같은 애들 일일히 설정하기 보다 이렇게 한번에 처리하기
	
	Set<String> getFieldNames();
	
	void addField(String fieldName, String value);
	//위 두 줄의 코드들로 훨씬  field들을 유연하게 관리할 수 있다.
	//따로 설정한 enum에서 갖다쓸수도 있지롱(내가 정한 애들만 쓰게 하고 싶을때)

	String getField(String fieldName);
	
	void removeField(String fieldName);

}
