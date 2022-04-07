package conditional.if_state;

public class Exec {
	public static void main(String[] args) {
		Product product1 = new Product(3000);
		Product product2 = new Product(12000);
		
		product1.Pick();
		product2.Pick();
	}
}
