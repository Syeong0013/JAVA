package Pkg.Final;

public class Final {
	/*
	 * 최종적인 필드
	 * 초기값이 저장되면 프로그램 실행 도중에 수정할 수 없음
	 * 초기값을 주는 방법 
	 * 1. 필드 선언 시 입력
	 * 2. 생성자 선언 시 입력
	 * 
	 * final 타입 필드 [=초기값];
	 * 
	 */
	
	final String nation = "Korea"; 	// 국적
	final String ssn;				// 주민번호
	String name;					// 이름
	
	// 생성자
	public Final(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
