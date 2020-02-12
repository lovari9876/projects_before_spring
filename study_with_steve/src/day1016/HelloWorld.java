package day1016;

class HelloWorld {
	//Instance method
	public void print() {
		System.out.println("Hello world!");
	}
	
	//class method ---> static
	public static void printOut() {
		//this.print();<---no!!!
		System.out.println("Hello world!");
		
	}
 	
	
	public static void main(String[] args) {
		HelloWorld helloworld = new HelloWorld();
		helloworld.print();
		
		HelloWorld.printOut();
		//helloWorld.printOut();<---no!!!

	}
}
