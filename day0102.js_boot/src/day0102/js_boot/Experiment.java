package day0102.js_boot;

public class Experiment {
	String name = "sara";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Experiment ex1 = new Experiment();
		Experiment ex2 = ex1;
		
		System.out.println(ex1.equals(ex2));
	
		ex2.name ="james";
		System.out.println(ex1.name);
	}
}
