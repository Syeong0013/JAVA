package conditional.if_state;

public class Product {
	
	public int price;
	
	public Product(int price) {
		this.price = price;
	}

	public void Pick() {
		if(price > 10000) {
			System.out.println("구매하지않는다.");
		}
		else {
			System.out.println("구매한다.");
		}
	}
}
