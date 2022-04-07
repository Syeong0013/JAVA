package Pkg.Persons;

public class Student2 extends Person{
	// 기본적인 추상화된 Person class을 인정해야 
	// 내가 짜고 있는 객체지향프로그램에서 person 이라고 인정을 할거다
	
	// 상속을 받는다.  >> 문법 "extens" Person
	
	
	// 학생만의 속성
	public String sID;
	
	// 생성자 
	public Student2() {
		super();
	}
	
	public Student2(String gender, String name) {
		super(gender, name);
	}
	
	public Student2(String gender, String name, String sID) {
		super(gender, name);
		this.sID = sID;
	}
	
	// 학생만의 행위 
	public void study() {
		System.out.println("학생이 공부를 한다.");
	}
}
