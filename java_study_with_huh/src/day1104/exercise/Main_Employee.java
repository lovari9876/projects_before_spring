package day1104.exercise;
// employee[ɪmˈplɔɪiː] => e를 두번 발음해준다 ㅋㅋㅋㅋ

public class Main_Employee {

	public static void main(String[] args) {
		Employee employee = new Employee("employee", 28, "address", "department", 1000);
		employee.printInfo();
		
		System.out.println(employee);
	}
}
