package day1112.q6;

public class PersonalInfo extends Business{
	private String name;
	private int age;	
    
	public PersonalInfo(String name, int age, String company, String work) {
		super(company, work);
		this.name = name;
		this.age = age;		
	}

	public void setName(String name) {
		this.name = name;
	} // 확인용 세터

	public void showPersonalInfo() {
		System.out.println("이름: " + name);
        System.out.println("나이: " + age);		
        super.showBusinessInfo();
	}
	
	public PersonalInfo clone() throws CloneNotSupportedException {
		PersonalInfo copy = (PersonalInfo)super.clone();			
       // copy.name = this.name;
		return copy; // business 상속하고 부서랑 회사를 맘대로 바꾸면 안되니까 비즈니스의
		// 회사랑 컴퍼니는 얕은 카피로 한다.
    }
}
