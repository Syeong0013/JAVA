package Pkg.Singleton;

public class SingletonExec {
	
	public static void main(String[] args) {
		// Singleton s1 = new Singleton(); 		>> �����Ͽ��� 
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		if(s2 == s3) {
			System.out.println("���� ��ü�� �����մϴ�.");
			
		}
		
	}
}
