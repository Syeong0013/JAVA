import java.util.Scanner;

public class Exec {

	public static void main(String[] args) {
		/*
		// �߸�����ϴ� ��
		
		Calculator cal = new Calculator();
		int result = cal.plus(13, 14);
		
		System.out.println(result); 
		*/
		
		// 1. c001, ȫ�浿, 32, M
		customer cus1 = new customer();
		cus1.cID = "C001";
		cus1.cName = "ȫ�浿";
		cus1.cAge = 32;
		cus1.gender = "M";
		
		
		// 2. c002, ����ġ, 25, M
		customer cus2 = new customer();
		cus2.cID = "C002";
		cus2.cName = "����ġ";
		cus2.cAge = 15;
		cus2.gender = "M";
		//cus2.buyProduct("���̽�ũ��", 1500);
		//cus2.buyProduct("��Ǫ", 10000);
		
		
		Product prod1 = new Product();
		prod1.prodName = "�����";
		prod1.prodPrice = 500;
		prod1.enableAge = 0;
		//prod1.checkAge(cus1.cAge);
		
		Product prod2 = new Product();
		prod2.prodName = "���";
		prod2.prodPrice = 4500;
		prod2.enableAge = 20;
		
		cus2.buyProduct(prod2.prodName, prod2.prodPrice);
		prod2.checkAge(cus2.cAge);
		
		// �迭 
		// datatype, ����
		// int Ÿ������ 10���� �μ��� ���� �迭 
	
		int[] arr =  new int[10];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int result = 0;
		for(int i = 0; i<arr.length; i++)
		{
			result += arr[i];
		}
		//System.out.println(Integer.toString(result));
		
		
		/*
		 * 1 - 0 4 5 6 11				>> 0,0 0,4
		 * 2 - 1 8 3 1 1
		 * 3 - 5 12 11 10 9 
		*/
	}
	
	

}
