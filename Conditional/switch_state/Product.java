package conditional.switch_state;

public class Product {

	public String name;
	public int kind;
	
	public Product(String name, int kind) {
		this.name = name;
		this.kind = kind;
	}
	
	public void ShowKind() {
		String str = "";
		switch(this.kind) {
		case 1: str = "초콜릿";
			break;
		case 2: str = "라면";
			break;
		case 3: str = "건강식품";
		 	break;
		}
		System.out.println(this.name + "의 종류는 " + str + "입니다.");
	}
}
