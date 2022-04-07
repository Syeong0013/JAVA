package Pkg.Singleton;

public class SingletonExec {
	
	public static void main(String[] args) {
		// Singleton s1 = new Singleton(); 		>> 컴파일에러 
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		if(s2 == s3) {
			System.out.println("같은 객체를 참조합니다.");
			
		}
		
	}
}
