package jsp.dto;

public class SDto {
	String eName;
	int sal;

	public SDto() {
	}

	public SDto(String eName, int sal) {
		this.eName = eName;
		this.sal = sal;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getPhoto() {
		int num = (int) (Math.random() * 6) + 1;
		return "product" + String.valueOf(num) + ".jpg";
	}
}
