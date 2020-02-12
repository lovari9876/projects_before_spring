package day1112.exercise;

class Product {
	private int price;
	
	Product(int price) {
		this.price = price;
	}
	
	int getPrice() {
		return price;
	}
}

class Computer extends Product {
	Computer() {
		super(500);
	}
}

class Monitor extends Product {
	Monitor() {
		super(200);
	}
}

class Keyboard extends Product {
	Keyboard() {
		super(100);
	}
}

class Mouse extends Product {
	Mouse() {
		super(50);
	}
}

//	
//	static final String[] name = 
//		{"컴퓨터", "모니터", "키보드" , "마우스", "스피커", "이어폰"};
//	static final int[] price = 
//		{500, 200, 100, 50, 100, 10};
//	
//	public Product(String name, int price) {		
//	}
//	
//	Product p0 = new Product(name[0], price[0]);
//	Product p1 = new Product(name[1], price[1]);
//	Product p2 = new Product(name[2], price[2]);
//	Product p3 = new Product(name[3], price[3]);
//	Product p4 = new Product(name[4], price[4]);
//	Product p5 = new Product(name[5], price[5]);
//	
//}