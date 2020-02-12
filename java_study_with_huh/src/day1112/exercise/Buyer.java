package day1112.exercise;
class Buyer {
	private int money;
	private Product[] cart;
	int num = 0; // 담긴 개수

	public Buyer(int money, Product[] cart) {
		this.money = money;
		this.cart = cart;
	}

	void buy(Product p) {

		if (money > p.getPrice()) {
			add(p);
			money -= p.getPrice();
		} else {
			System.out.println("돈 벌어와");
			return;
		}
	}

	void add(Product p) {
		if (num < cart.length) {
			cart[num++] = p;
		} else {
			Product[] temp = new Product[cart.length * 2];
			for (int i = 0; i < cart.length; i++) {
				temp[i] = cart[i];
			}
			cart = new Product[cart.length * 2];
			cart = temp;

			cart[num++] = p;
			
		}
	}

	void summary() {
		int sum = 0;
		System.out.print("구입한 물건은 ");
		for (int i = 0; i < num; i++) {
			System.out.print(cart[i].getClass().getSimpleName() + " ");
		}
		System.out.print("입니다.");
		System.out.print("사용 금액은 ");
		for (int i = 0; i < num; i++) {
			sum += cart[i].getPrice();
		}
		System.out.print(sum);
		System.out.printf("입니다. 남은 금액은 %d 입니다.\n", money);

	}
}
