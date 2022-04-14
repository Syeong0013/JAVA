package conditional.if_state;

public class Product {
	
	public int price;
	
	public Product(int price) {
		this.price = price;
	}

	public void Pick() {
		if(price > 10000) {
			System.out.println("구매하지않습니다.");
		}
		else {
			System.out.println("구매합니다.");
		}
	}
}
