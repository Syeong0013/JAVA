package Pkg.Final;

public class Final {
	/*
	 * �������� �ʵ�
	 * �ʱⰪ�� ����Ǹ� ���α׷� ���� ���߿� ������ �� ����
	 * �ʱⰪ�� �ִ� ��� 
	 * 1. �ʵ� ���� �� �Է�
	 * 2. ������ ���� �� �Է�
	 * 
	 * final Ÿ�� �ʵ� [=�ʱⰪ];
	 * 
	 */
	
	final String nation = "Korea"; 	// ����
	final String ssn;				// �ֹι�ȣ
	String name;					// �̸�
	
	// ������
	public Final(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
