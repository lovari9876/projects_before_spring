package day1111.chap17.example;

interface Printable2 {
	void printLine(String str);
}

class SimplePrinter implements Printable2 {
	public void printLine(String str) {
		System.out.println(str);
	}
}

class MultiPrinter extends SimplePrinter {
	public void printLine(String str) {
		super.printLine("start of multi...");
		super.printLine(str);
		super.printLine("end of multi");
	}
}

public class InstanceofInterface {
	public static void main(String[] args) {
		Printable2 prn1 = new SimplePrinter();
		Printable2 prn2 = new MultiPrinter();

		if (prn1 instanceof Printable2)
			prn1.printLine("This is a simple printer.");
		System.out.println();

		if (prn2 instanceof Printable2)
			prn2.printLine("This is a multiple printer.");
	}
}
