package Pkg.Coffes;

public class Coffee {
	
	//커피에 대한 추상적인것들을 표현
	// 속성과 행위

	//1. 속성  원두커피, 믹스커피 등
	public String beansKind;
	public String beansContry;
	
	//클래스가 인스턴스화되어지면 -- 클래스가 만들어지면 자동으로 실행되는 메써드
	public Coffee() {
		//메써드의 오버로딩
		
	}
		
	public Coffee(String beansKind, String beansContry) {
		this.beansKind = beansKind;
		this.beansContry = beansContry;
	}
		
	//2. 행위 메써드
	public void checkCoffee() {
		System.out.println("커피의 종류 : " + beansKind);
		System.out.println("커피의 원산지 : " + beansContry);
	}
}
