package Pkg.Persons;

public class Student extends Person{
	
	public String gender;
	public String name;
	public String sID;
	
	
	
	public Student() {
		
	}
	
	public Student(String gender, String name) {
		this.gender = gender;
		this.name = name;
	}
	
	public void drinkCoffee() {
		System.out.println("학생이 커피를 마신다.");
	}

	public void study() {
		System.out.println("학생이 공부를 한다.");
	}
}
