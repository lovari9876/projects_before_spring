package day1015;
//열거형과 결합의 예시~~~
public enum FieldName {
	//내가 제한한 필드형만 써!
	DOB("DOB"),
	NICKNAME("NICKNAME"),
	ADDRESS_CITY("ADDRESS_CITY"),
	ADDRESS_STATE("ADDRESS_STATE"),
	ADDRESS_POSTCODE("ADDRESS_POSTCODE"),
	ADDRESS_STREET("ADDRESS_STREET")
	;
	
	private String value;
	private FieldName(String value) {
		this.value = value;
	}
	
	public String value() {
		return this.value;
	}
	
	public String type() {
		if (value.equals("ADDRESS_POST")) {
			return "숫자";
		} else {
			return "문자열";
		}
	}
}
