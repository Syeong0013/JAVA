
public class customer {

	// 1. ��ü 
	// �Ӽ� - property, attribute 
	// ����  -  method
	
	public String cID;
	public String cName;
	public int cAge;
	public String gender;
	
	// 2. ����
	public void buyProduct(String prodName, int price) {
		
		/* 32���� ȫ�浿�� prodName�� price�� ������ ������ ȭ�鿡 ��� */
		String strResult = Integer.toString(cAge) + "��";
		strResult += cName + "����";
		strResult += prodName + "��";
		strResult += Integer.toString(price) + "�� �����߽��ϴ�.";
		
		System.out.println(strResult);
	
	}
	
	// 3. ���Ѵ� 
	public int getPlus(int start, int finish) {
		
		//1. for -- ���� ����
		int result = 0;
		for(int i = start; i<finish; i++) {
			result += i;
		}
		return result;
		
		//2. while -- ���� ���� ����
		/*
		int j = start;
		while(j <= finish) {
			j += 3;
		}
		*/
		/*
		int j = 1;
		while(true) {
			if(j == 1000) {
				break;
			}
		}
		
		int o = 1;
		do {
			result += o;
			o += 1;
		}while(o <= 100)
		;
		*/
	
	}
	
}
