package Pkg.Persons;

public class Staff extends Person{
	
	public String staffID;
	
	// 생성자
	public Staff() {
		super();
	}
	
	public Staff(String gender, String name) {
		super(gender, name);
	}
	
	public Staff(String gender, String name, String staffID) {
		super(gender, name);
		this.staffID = staffID;
	}
	
	// 스탭만의 행위
	public void apply() {
		System.out.println("학생을 지원한다.");
	}
}
