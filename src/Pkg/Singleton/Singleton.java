package Pkg.Singleton;

public class Singleton {
	
	// ���� �ʵ� ������ ȣ�� ��ü �ʱ�ȭ
	private static Singleton singleton = new Singleton();
	
	// ������
	private Singleton() {
		
	}
	
	// ���� �޼��� 
	// �ܺο��� �����ϰ� ������ �� �ִ� ���� 
	public static Singleton getInstance() {
		return singleton;
	}
}
