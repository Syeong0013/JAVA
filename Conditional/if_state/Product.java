package conditional.if_state;

public class Product {
	
	public int price;
	
	public Product(int price) {
		this.price = price;
	}

	public void Pick() {
		if(price > 10000) {
			System.out.println("���������ʴ´�.");
		}
		else {
			System.out.println("�����Ѵ�.");
		}
	}
}
