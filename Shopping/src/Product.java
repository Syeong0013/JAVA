
public class Product {

	public String prodName;
	public int prodPrice;
	public int enableAge; //��������
	
	// ���� : ���̿� ���� �� �� �ִ� �� Ȯ���ϴ� �����ʿ�
	public void checkAge(int buyCus_Age) {
		String result = "";
		if(buyCus_Age >= enableAge) {
			result = "���Ű���";
		}
		else {
			result = "���� �Ұ���";			
		}
		System.out.print(result);
	}
	
}
