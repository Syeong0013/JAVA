package Pkg.Coffes;

public class Coffee {
	
	//Ŀ�ǿ� ���� �߻����ΰ͵��� ǥ��
	// �Ӽ��� ����

	//1. �Ӽ�  ����Ŀ��, �ͽ�Ŀ�� ��
	public String beansKind;
	public String beansContry;
	
	//Ŭ������ �ν��Ͻ�ȭ�Ǿ����� -- Ŭ������ ��������� �ڵ����� ����Ǵ� �޽��
	public Coffee() {
		//�޽���� �����ε�
		
	}
		
	public Coffee(String beansKind, String beansContry) {
		this.beansKind = beansKind;
		this.beansContry = beansContry;
	}
		
	//2. ���� �޽��
	public void checkCoffee() {
		System.out.println("Ŀ���� ���� : " + beansKind);
		System.out.println("Ŀ���� ������ : " + beansContry);
	}
}
