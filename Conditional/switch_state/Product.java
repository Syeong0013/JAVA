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
		case 1: str = "���ݸ�";
			break;
		case 2: str = "���";
			break;
		case 3: str = "�ǰ���ǰ";
		 	break;
		}
		System.out.println(this.name + "�� ������ " + str + "�Դϴ�.");
	}
}
