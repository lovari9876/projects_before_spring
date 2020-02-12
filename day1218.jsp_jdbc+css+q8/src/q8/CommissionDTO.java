package q8;

// Data Transfer Object
// �����ͺ��̽� ���忡�� �����͸� �����ϴ� ��ü��
// =>>> ����� VO(Value Object)�� �� ���� ��

public class CommissionDTO {
	private String name;
	private String hiredate;
	private String commission;

	public CommissionDTO() {

	}

	public CommissionDTO(String name, String hiredate, String commission) {
		super();
		this.name = name;
		this.hiredate = hiredate;
		this.commission = commission;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public String getCommission() {
		return commission;
	}

	public void setCommission(String commission) {
		this.commission = commission;
	}

}