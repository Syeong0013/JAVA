package Pkg.Singleton;

public class Singleton {
	
	// 정적 필드 생성자 호출 객체 초기화
	private static Singleton singleton = new Singleton();
	
	// 생성자
	private Singleton() {
		
	}
	
	// 정적 메서드 
	// 외부에서 유일하게 접근할 수 있는 수단 
	public static Singleton getInstance() {
		return singleton;
	}
}
