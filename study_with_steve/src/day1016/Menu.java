package day1016;

public class Menu {
	private String firstName;
	private String lastName;
	private Scanner scanner;
	
	public Menu() {
		this.scanner = new Scanner(System.in);
		this.firstName = "";
		this.lastName = "";
	}
	
	public void processMain() {
		String cmd = this.scanner.next();
		cmd.trim();

		if (cmd.equalsIgnoreCase("a")) {
			processAdd();
		} else if (cmd.equalsIgnoreCase("p")) {
			printAddress();
		} else if (cmd.equalsIgnoreCase("x")) {
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);
		} else {
		}
		
	}
	
	public void mainScreen() {		
		while (true) {
			System.out.println("**********************************");
			System.out.format("\tFirstName: %s\n", firstName);
			System.out.format("\tLastName: %s\n", lastName);
			System.out.println("**********************************");
			// \t = tap
			
			System.out.println("\n\t1) FirstName");
			System.out.println("\t2) LastName");
			System.out.println("\tx) Exit");
			System.out.print("Input> ");
			
			processMain();
		}
			
	}
	
	public void edit
	public void editScreen(int screenId) {
		System.out.println("**********************************");
		if (screenId == 100) {
			System.out.format("\t현재: %s\n", firstName
			
		} else {
			System.out.format
		
	}
}
