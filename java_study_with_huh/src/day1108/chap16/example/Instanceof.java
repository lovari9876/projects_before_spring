package day1108.chap16.example;

class Cake {}

class CheeseCake extends Cake {}

class StrawberryCheeseCake extends CheeseCake{}

public class Instanceof {

	public static void main(String[] args) {
		Cake cake = new StrawberryCheeseCake();
		StrawberryCheeseCake scc = new StrawberryCheeseCake();

		if(cake instanceof Cake) {
			System.out.println("cake instanceof Cake");
		} else 
			System.out.println("cake not instanceof Cake");
		if(cake instanceof CheeseCake) {
			System.out.println("cake instanceof CheeseCake");
		} else 
			System.out.println("cake not instanceof CheeseCake");
		if(cake instanceof StrawberryCheeseCake) {
			System.out.println("cake instanceof StrawberryCheeseCake");
		} else 
			System.out.println("cake not instanceof StrawberryCheeseCake");
	
		if(scc instanceof Cake) {
			System.out.println("scc instanceof Cake");
		} else 
			System.out.println("scc not instanceof Cake");
		
	}

}
