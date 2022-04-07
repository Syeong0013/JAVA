package Pkg.Persons;

public class Teacher extends Person{
	
	public int career;
	// 생성자
	public Teacher() {
		super();
	}
	
	public Teacher(String gender, String name) {
		super(gender, name);
	}
	
	public Teacher(String gender, String name, int career) {
		super(gender, name);
		this.career = career;
	}
	
	
	public void teaching() {
		System.out.println("선생이 학생을 가르친다.");
	}
}
