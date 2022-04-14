package conditional.if_state;

public class Exec {
	public static void main(String[] args) {
		Product product1 = new Product(3000);
		Product product2 = new Product(12000);
		
		product1.Pick();	// 출력 : 구매합니다.
		product2.Pick();	// 출력 : 구매하지않습니다.
	}
}
